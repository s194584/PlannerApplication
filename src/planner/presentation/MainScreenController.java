package planner.presentation;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import planner.app.Admin;
import planner.app.PlannerApplication;
import planner.app.User;

import java.io.IOException;

public class MainScreenController {
    @FXML VBox mainContainer;
    @FXML Button logoutBtn;
    @FXML Label initialsLabel;

    private PlannerApplication plannerApplication;

    @FXML
    void logout() throws IOException {
        Scene scene = logoutBtn.getScene();
        Stage stage = (Stage) scene.getWindow();

        FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("/fxml/LoginScreen.fxml"));
        Parent loginScreen = loginLoader.load();
        LoginScreenController lsc = loginLoader.getController();
        lsc.setPlannerApplication(plannerApplication);

        stage.setScene(new Scene(loginScreen));
        stage.centerOnScreen();
    }

    public void loadPlannerApplication(PlannerApplication plannerApplication) throws IOException {
        this.plannerApplication = plannerApplication;
        User currentUser = plannerApplication.getCurrentUser();

        Parent content = null;
        if(currentUser instanceof Admin) {
            // Load Admin scene if User is admin
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AdminScreen.fxml"));
            content = loader.load();

            AdminScreenController asc = loader.getController();
            asc.setPlannerApplication(plannerApplication);
        } else{
            // Load the employee scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/EmployeeScreen.fxml"));
            content = loader.load();

            EmployeeScreenController esc = loader.getController();
            esc.loadPlannerApplication(plannerApplication);
        }

        // Adds the loaded scene into the Main Screen
        mainContainer.getChildren().add(0,content);
        initialsLabel.setText(currentUser.getInitials());
    }
}
