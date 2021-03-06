package planner.presentation;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import planner.app.PlannerApplication;

// Ansvarlig: Christopher
public class LoginScreenController {
    @FXML
    Button loginButton;
    @FXML
    TextField loginField;

    PlannerApplication plannerApplication = new PlannerApplication();

    @FXML
    public void login() throws Exception {
        String enteredText = loginField.getText();


        if (plannerApplication.login(enteredText)) {
            Scene scene = loginButton.getScene();
            Stage stage = (Stage) scene.getWindow();

            // Loads the MainScreen
            FXMLLoader mainLoader = new FXMLLoader(getClass().getResource("/fxml/MainScreen.fxml"));
            Parent main = mainLoader.load();
            MainScreenController msc = mainLoader.getController();

            // Transfers the PlannerApplication for reference
            msc.loadPlannerApplication(plannerApplication);

            stage.setScene(new Scene(main));
            stage.centerOnScreen();
        }
    }

    public void setPlannerApplication(PlannerApplication plannerApplication) {
        this.plannerApplication = plannerApplication;
    }
}
