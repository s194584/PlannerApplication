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
    private User user;

    @FXML
    void logout() throws IOException {
        Scene scene = logoutBtn.getScene();
        Stage stage = (Stage) scene.getWindow();

        FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("/fxml/loginScreen.fxml"));
        Parent loginScreen = loginLoader.load();
        LoginScreenController lsc = loginLoader.getController();
        lsc.setPlannerApplication(plannerApplication);

        stage.setScene(new Scene(loginScreen));
    }

    public void loadPlannerApplication(PlannerApplication plannerApplication) throws IOException {
        this.plannerApplication = plannerApplication;
        user = plannerApplication.getCurrentUser();

        Parent content = null;
        if(user instanceof Admin) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AdminScreen.fxml"));
            content = loader.load();

            AdminScreenController asc = loader.getController();
            asc.setPlannerApplication(plannerApplication);
        } else{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/EmployeeScreen.fxml"));
            content = loader.load();

            EmployeeScreenController esc = loader.getController();
            esc.loadPlannerApplication(plannerApplication);
        }


        mainContainer.getChildren().add(0,content);
        initialsLabel.setText(user.getInitials());
    }


    @FXML
    void debug(KeyEvent event) {
        if(event.getCode() == KeyCode.Q){
            plannerApplication.getUsers().stream().forEach(u -> System.out.print(u+u.getInitials() + ", "));
            System.out.println();
        }
    }


}
