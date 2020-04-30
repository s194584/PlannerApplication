package planner.presentation;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import planner.app.Employee;
import planner.app.PlannerApplication;
import planner.app.Project;
import planner.app.ProjectManager;

public class AdminScreenController {
    @FXML private Button addEmployeeBtn;
    @FXML private Button removeEmployeeBtn;
    @FXML private Button createProjectBtn;
    @FXML private TextField projectField;
    @FXML private Button cancelProjectBtn;
    @FXML private Button addProjectLeaderBtn;
    @FXML private TextField projEmployeeField;
    @FXML private TextField projProjectField;
    @FXML private ListView employeeList;
    @FXML private TableView projectTable;
    @FXML private TableColumn projectNameCol;
    @FXML private TableColumn projectIDCol;
    @FXML private TableColumn<Project,String> projectActCol;
    @FXML private TableColumn<Project,String> projectManCol;

    private PlannerApplication plannerApplication;

    @FXML
    public void initialize(){
        projectNameCol.setCellValueFactory(new PropertyValueFactory("projectName"));
        projectIDCol.setCellValueFactory(new PropertyValueFactory("projectID"));
        projectManCol.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getProjectManager().getInitials()));
        projectActCol.setCellValueFactory((data -> new SimpleStringProperty("" + data.getValue().getNoAct())));
    }

    public void setPlannerApplication(PlannerApplication plannerApplication) {
        this.plannerApplication = plannerApplication;
    }

    @FXML
    void assignProjectManager() {
        try {
            String employee = employeeList.getSelectionModel().getSelectedItem().toString();
            Project project = (Project) projectTable.getSelectionModel().getSelectedItem();
            plannerApplication.assignProjManToProject(employee, project.getProjectID());
            System.out.println("Assigned " + employee + " as project manager to " + project.getProjectID());
            projectTable.refresh();
        } catch (Exception ex) {
            showAlertMessage("Please select an employee and a project");
        }
    }

    @FXML
    void addEmployee() throws Exception {
        TextInputDialog td = showInputBox("Enter the initials of the employee you wish to add.");
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
        }
        catch (Exception e) {
            showAlertMessage("Please select the project you wish to cancel");
        }
    }

    @FXML
    void createProject() {
        TextInputDialog td = showInputBox("Enter the name of the project");

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
        }
        catch (Exception e) {
            showAlertMessage("Please select the user you wish to remove");
        }

    }

    public void showAlertMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR, message);
        alert.showAndWait();
    }

    public TextInputDialog showInputBox(String header){
        TextInputDialog td = new TextInputDialog();
        td.setHeaderText(header);
        td.showAndWait();
        return td;
    }
}
