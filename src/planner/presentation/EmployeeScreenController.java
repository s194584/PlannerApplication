package planner.presentation;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import planner.app.Employee;
import planner.app.PlannerApplication;
import planner.app.ProjectManager;
import planner.app.User;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Locale;

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

        if(currentUser instanceof ProjectManager){
            managerBtn.setDisable(false);
        }else{
            managerBtn.setDisable(true);
        }
        weekNumLabel.setText(""+Calendar.getInstance().get(Calendar.WEEK_OF_YEAR));



    }
}
