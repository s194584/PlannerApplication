package planner.presentation;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import planner.app.*;

import java.io.IOException;
import java.util.Calendar;

public class EmployeeScreenController {
    @FXML private Label weekNumLabel;
    @FXML private Button managerBtn;
    @FXML private TableView<?> activityTable;
    @FXML private TableColumn<?, ?> nameCol;
    @FXML private TableColumn<?, ?> idCol;
    @FXML private TableColumn<?, ?> descriptionCol;
    @FXML private TableColumn<?, ?> etaCol;
    @FXML private TableColumn<?, ?> timeUsedCol;
    @FXML private TableColumn<?, ?> endDateCol;

    private User currentUser;
    private PlannerApplication plannerApplication;


    public void loadPlannerApplication(PlannerApplication plannerApplication) {
        this.plannerApplication = plannerApplication;
        currentUser = plannerApplication.getCurrentUser();
        System.out.println(currentUser);
        if(currentUser instanceof ProjectManager){
            managerBtn.setDisable(false);
        }else{
            managerBtn.setDisable(true);
        }
        weekNumLabel.setText(""+Calendar.getInstance().get(Calendar.WEEK_OF_YEAR));
    }

    public void showManagerScreen() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ProjectManagerScreen.fxml"));
        Parent content = loader.load();
        ProjectManagerScreenController pmsc = loader.getController();
        pmsc.loadPlannerApplication(plannerApplication);

        VBox mainContainer = (VBox) managerBtn.getScene().getRoot();
        mainContainer.getChildren().remove(0);
        mainContainer.getChildren().add(0, content);

    }
}
