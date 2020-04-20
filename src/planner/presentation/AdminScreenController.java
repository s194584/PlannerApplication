package planner.presentation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import planner.app.Employee;
import planner.app.PlannerApplication;
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
    void addEmployee() throws Exception {
        String text = employeeField.getText();
        try {
            plannerApplication.addUser(new Employee(text)); }
        catch (Exception e) {
            String msg = e.getMessage();
            Alert alert = new Alert(Alert.AlertType.ERROR, msg);
            alert.showAndWait();
        }


        plannerApplication.getUsers().stream().forEach(u -> System.out.print(u.getInitials() + ", "));
        System.out.println();
    }

    @FXML
    void assignProjectLeader(ActionEvent event) {

    }

    @FXML
    void cancelProject(ActionEvent event) {

    }

    @FXML
    void createProject(ActionEvent event) {

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

}
