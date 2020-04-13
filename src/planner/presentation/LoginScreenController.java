package planner.presentation;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import planner.app.PlannerApplication;

public class LoginScreenController {
    @FXML
    Button loginButton;
    @FXML
    TextField loginField;

    PlannerApplication plannerApplication = new PlannerApplication();


    public void login(){
        System.out.println(plannerApplication.getUser(loginField.getText()).getLoginStatus());
        plannerApplication.login(loginField.getText());
        System.out.println(plannerApplication.getUser(loginField.getText()).getLoginStatus());
    }
}
