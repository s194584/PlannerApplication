package planner.presentation;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
import planner.presentation.prompts.ProjectEditorController;

import java.io.IOException;

public class AdminScreenController {
    @FXML private Button addEmployeeBtn;
    @FXML private Button removeEmployeeBtn;
    @FXML private Button createProjectBtn;
    @FXML private TextField projectField;
    @FXML private Button cancelProjectBtn;
    @FXML private Button editProjectBtn;
    @FXML private ListView employeeList;
    @FXML private TableView projectTable;
    @FXML private TableColumn<Project,String> projectNameCol;
    @FXML private TableColumn projectIDCol;
    @FXML private TableColumn<Project,String> projectActCol;
    @FXML private TableColumn<Project,String> projectManCol;

    private PlannerApplication plannerApplication;

    @FXML
    public void initialize(){
        projectNameCol.setCellValueFactory(data -> new SimpleStringProperty("" + data.getValue().getProjectName()));
        projectIDCol.setCellValueFactory(new PropertyValueFactory("projectID"));
        projectManCol.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getProjectManager().getInitials()));
        projectActCol.setCellValueFactory(data -> new SimpleStringProperty("" + data.getValue().getNumberOfActivities()));
    }

    public void setPlannerApplication(PlannerApplication plannerApplication) {
        this.plannerApplication = plannerApplication;
        refresh();
    }

    void refresh(){
        ObservableList<String> startEmployees = employeeList.getItems();
        for (User u : plannerApplication.getUsers()) {
            if(!u.getInitials().equals("000")){
                startEmployees.add(u.getInitials());
            }
        }

        ObservableList<Project> startProjects = projectTable.getItems();
        startProjects.addAll(plannerApplication.getProjects());
    }

    @FXML
    void assignProjectManager() {
        try {
            String employee = employeeList.getSelectionModel().getSelectedItem().toString();
            Project project = (Project) projectTable.getSelectionModel().getSelectedItem();
            plannerApplication.assignProjManToProject(employee, project.getProjectID());
            System.out.println("Assigned " + employee + " as project manager to " + project.getProjectID());
            projectTable.refresh();
            projectTable.getSelectionModel().clearSelection();
            employeeList.getSelectionModel().clearSelection();
        } catch (Exception ex) {
            showAlertMessage("Please select an employee and a project");
        }
    }

    @FXML
    void addEmployee() throws Exception {
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

        plannerApplication.getUsers().stream().forEach(u -> System.out.print(u.getInitials() + ", "));
        System.out.println();
    }

    @FXML
    void cancelProject() {
        try {
            Project project = (Project) projectTable.getSelectionModel().getSelectedItem();
            plannerApplication.removeProject(project);
            projectTable.getItems().remove(project);
            System.out.println("Cancelled project with id " + project.getProjectID());
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
            System.out.println("Added project with name " + project.getProjectName() + " and id " + project.getProjectID());
        }
        catch (Exception e) {
            showAlertMessage(e.getMessage());
        }

    }

    @FXML
    void removeEmployee() throws Exception {
        try {
            String employee = employeeList.getSelectionModel().getSelectedItem().toString();
            plannerApplication.removeUser(plannerApplication.getUser(employee));
            employeeList.getItems().remove(employee);
            plannerApplication.getUsers().stream().forEach(u -> System.out.print(u.getInitials() + ", "));
            System.out.println();
            projectTable.refresh();
            employeeList.getSelectionModel().clearSelection();
        }
        catch (Exception e) {
            showAlertMessage("Please select the user you wish to remove");
        }

    }

    @FXML
    void editProjectByMouse(MouseEvent event) throws IOException {
        if(event.getButton().equals(MouseButton.PRIMARY)) {
            if (event.getClickCount() == 2||editProjectBtn.isPressed()) {
                editProject();
            }
        }
    }

    @FXML
    void editProjectByBtn() throws IOException {
        editProject();
    }

    private void editProject() throws IOException {
        Project project = (Project) projectTable.getSelectionModel().getSelectedItem();
        showProjectEditor(project);
    }

    private void showProjectEditor(Project project) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/prompts/projectEditor.fxml"));
        Parent root2 = loader.load();
        ProjectEditorController pec = loader.getController();
        pec.setInformation(project.getInformation());

        stage.setScene(new Scene(root2));
        stage.showAndWait();
        projectTable.refresh();
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
