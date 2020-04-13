package planner.presentation;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    Button loginButton;

    @FXML
    TextField loginField;



    public void login(){
        System.out.println(loginField.getText());
    }
}
