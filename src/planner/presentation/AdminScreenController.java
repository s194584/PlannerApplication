package planner.presentation;

import io.cucumber.java.an.E;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import planner.app.Employee;
import planner.app.PlannerApplication;
import planner.app.Project;
import planner.app.User;
import planner.presentation.prompts.Editor;
import planner.presentation.prompts.EditorController;

import java.io.IOException;

public class AdminScreenController {
    @FXML private Button addEmployeeBtn;
    @FXML private Button removeEmployeeBtn;
    @FXML private Button createProjectBtn;
    @FXML private TextField projectField;
    @FXML private Button cancelProjectBtn;
    @FXML private Button editProjectBtn;
    @FXML private ListView employeeList;
    @FXML private TableView<Project> projectTable;
    @FXML private TableColumn<Project,String> projectNameCol;
    @FXML private TableColumn projectIDCol;
    @FXML private TableColumn<Project,String> projectActCol;
    @FXML private TableColumn<Project,String> projectManCol;

    private PlannerApplication plannerApplication;

    @FXML
    public void initialize(){

        // Make button react dynamically
        cancelProjectBtn.disableProperty().bind(projectTable.getSelectionModel().selectedItemProperty().isNull());
        editProjectBtn.disableProperty().bind(projectTable.getSelectionModel().selectedItemProperty().isNull());
        removeEmployeeBtn.disableProperty().bind(employeeList.getSelectionModel().selectedItemProperty().isNull());

        // Formats the Project table for automated insertion
        projectNameCol.setCellValueFactory(data -> new SimpleStringProperty("" + data.getValue().getInformation().getName()));
        projectIDCol.setCellValueFactory(new PropertyValueFactory("projectID"));
        projectManCol.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getProjectManager().getInitials()));
        projectActCol.setCellValueFactory(data -> new SimpleStringProperty("" + data.getValue().getNumberOfActivities()));
    }

    public void setPlannerApplication(PlannerApplication plannerApplication) {
        this.plannerApplication = plannerApplication;
        refresh();
    }

    void refresh(){
        // Loads the PlannerApplication's employees into the employee list, except Admin
        ObservableList<String> startEmployees = employeeList.getItems();
        for (User u : plannerApplication.getUsers()) {
            if(!u.getInitials().equals("000")){
                startEmployees.add(u.getInitials());
            }
        }

        // Loads the PlannerApplication's projects
        ObservableList<Project> startProjects = projectTable.getItems();
        startProjects.addAll(plannerApplication.getProjects());
    }

    @FXML
    void assignProjectManager() {
        try {
            String employee = employeeList.getSelectionModel().getSelectedItem().toString();
            Project project =  projectTable.getSelectionModel().getSelectedItem();
            plannerApplication.assignProjManToProject(employee, project.getProjectID());
            projectTable.refresh();
            projectTable.getSelectionModel().clearSelection();
            employeeList.getSelectionModel().clearSelection();
        } catch (Exception ex) {
            showAlertMessage("Please select an employee and a project");
        }
    }

    @FXML
    void addEmployee() {
        TextInputDialog td = createInputBox("Enter the initials of the employee you wish to add.");
        if(!td.showAndWait().isPresent()){
            return;
        }
        try {
            plannerApplication.addUser(new Employee(td.getEditor().getText()));
            employeeList.getItems().add(td.getEditor().getText());}
        catch (Exception e) {
            showAlertMessage(e.getMessage());
        }

    }

    @FXML
    void cancelProject() {
        try {
            Project project =  projectTable.getSelectionModel().getSelectedItem();
            plannerApplication.removeProject(project);
            projectTable.getItems().remove(project);
            projectTable.getSelectionModel().clearSelection();
        }
        catch (Exception e) {
            showAlertMessage("Please select the project you wish to cancel");
        }
    }

    @FXML
    void createProject() {
        TextInputDialog td = createInputBox("Enter the name of the project");
        if(!td.showAndWait().isPresent()){
            return;
        }
        try {
            Project project = new Project(td.getEditor().getText());
            plannerApplication.addProject(project);
            projectTable.getItems().add(project);
        }
        catch (Exception e) {
            showAlertMessage(e.getMessage());
        }
    }

    @FXML
    void removeEmployee() {
        try {
            String employee = employeeList.getSelectionModel().getSelectedItem().toString();
            plannerApplication.removeUser(plannerApplication.getUser(employee));
            employeeList.getItems().remove(employee);
            projectTable.refresh();
            employeeList.getSelectionModel().clearSelection();
        }
        catch (Exception e) {
            showAlertMessage("Please select the user you wish to remove");
        }
    }

    @FXML
    void editProjectByMouse(MouseEvent event) {
        if(event.getButton().equals(MouseButton.PRIMARY)) {
            if (event.getClickCount() == 2||editProjectBtn.isPressed()) {
                editProject();
            }
        }
    }

    @FXML
    void editProject(){
        Project project = projectTable.getSelectionModel().getSelectedItem();
        Editor editor = new Editor(project,plannerApplication);
        projectTable.refresh();
        employeeList.getSelectionModel().clearSelection();
    }

    public void showAlertMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR, message);
        alert.showAndWait();
    }

    public TextInputDialog createInputBox(String header){
        TextInputDialog td = new TextInputDialog();
        td.setHeaderText(header);
        return td;
    }
}
