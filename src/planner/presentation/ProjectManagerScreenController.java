package planner.presentation;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import planner.app.PlannerApplication;

import java.io.IOException;

public class ProjectManagerScreenController {
    @FXML private Button employeeBtn;

    private PlannerApplication plannerApplication;

    public void loadPlannerApplication(PlannerApplication plannerApplication) {
        this.plannerApplication = plannerApplication;
    }


    public void showEmployeeScreen() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/EmployeeScreen.fxml"));
        Parent content = loader.load();
        EmployeeScreenController esc = loader.getController();
        esc.loadPlannerApplication(plannerApplication);

        VBox mainContainer = (VBox) employeeBtn.getScene().getRoot();
        mainContainer.getChildren().remove(0);
        mainContainer.getChildren().add(0, content);
    }

}
