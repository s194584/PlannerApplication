package planner.presentation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import planner.app.Employee;
import planner.app.PlannerApplication;
import planner.app.Project;
import planner.app.User;

public class AdminScreenController {
    @FXML    private Button addEmployeeBtn;
    @FXML    private TextField employeeField;
    @FXML    private Button removeEmployeeBtn;
    @FXML    private Button createProjectBtn;
    @FXML    private TextField projectField;
    @FXML    private Button cancelProjectBtn;
    @FXML    private Button addProjectLeaderBtn;
    @FXML    private TextField projEmployeeField;
    @FXML    private TextField projProjectField;

    private PlannerApplication plannerApplication;

    public void setPlannerApplication(PlannerApplication plannerApplication) {
        this.plannerApplication = plannerApplication;
    }

    @FXML
    void assignProjectManager() {
        String employee = projEmployeeField.getText();
        int projectID = Integer.parseInt(projProjectField.getText());

        try {
            plannerApplication.assignProjManToProject(employee, projectID);
            System.out.println("Assigned " + employee + " as project manager to " + projectID);
        } catch (Exception ex) {
            showAlertMessage(ex.getMessage());
        }


    }

    @FXML
    void addEmployee() throws Exception {
        String text = employeeField.getText();
        try {
            plannerApplication.addUser(new Employee(text)); }
        catch (Exception e) {
            showAlertMessage(e.getMessage());
        }


        plannerApplication.getUsers().stream().forEach(u -> System.out.print(u.getInitials() + ", "));
        System.out.println();
    }

    @FXML
    void cancelProject() {
        int projectID = Integer.parseInt(projectField.getText());

        try {
            plannerApplication.removeProject(projectID);
            System.out.println("Cancelled project with id " + projectID);
        }
        catch (Exception e) {
            showAlertMessage(e.getMessage());
        }

    }

    @FXML
    void createProject() {
        String projectName = projectField.getText();

        Project project = new Project(projectName);
        try {
            plannerApplication.addProject(project);
            System.out.println("Added project with name " + projectName + " and id " + project.getID());
        }
        catch (Exception e) {
            showAlertMessage(e.getMessage());
        }

    }

    @FXML
    void removeEmployee() throws Exception {
        String text = employeeField.getText();
        try {
        plannerApplication.removeUser(new Employee(text)); }
        catch (Exception e) {
            String msg = e.getMessage();
            Alert alert = new Alert(Alert.AlertType.ERROR, msg);
            alert.showAndWait();
        }

        plannerApplication.getUsers().stream().forEach(u -> System.out.print(u.getInitials() + ", "));
        System.out.println();
    }

    public void showAlertMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR, message);
        alert.showAndWait();
    }
}
