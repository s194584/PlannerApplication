package planner.presentation;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import planner.app.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Calendar;

public class EmployeeScreenController {
    @FXML private Label weekNumLabel;
    @FXML private Button managerBtn;
    @FXML private TableView<Activity> activityTable;
    @FXML private TableColumn<Activity, String> nameCol;
    @FXML private TableColumn<Activity, Integer> idCol;
    @FXML private TableColumn<Activity, String> descriptionCol;
    @FXML private TableColumn<Activity, Double> etaCol;
    @FXML private TableColumn<Activity, LocalDate> timeUsedCol;
    @FXML private TableColumn<Activity, Integer> endDateCol;

    private User currentUser;
    private PlannerApplication plannerApplication;

    @FXML
    public void initialize(){
        nameCol.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getInformation().getName()));
        descriptionCol.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getInformation().getDescription().length()>15 ?
                data.getValue().getInformation().getDescription().substring(0,14)+"...":data.getValue().getInformation().getDescription()));
        etaCol.setCellValueFactory(new PropertyValueFactory<>("estimatedTimeUsage"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        timeUsedCol.setCellValueFactory((data -> new SimpleObjectProperty<>(data.getValue().getInformation().getStartDate())));
        endDateCol.setCellValueFactory((data -> new SimpleObjectProperty<>(DateMapper.transformToWeekNumber(data.getValue().
                getInformation().getEndDate()))));
    }

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
        activityTable.getItems().addAll(plannerApplication.getActivitesAssignedTo(currentUser));
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

    private void refresh(){
        activityTable.getItems().clear();
        activityTable.getItems().addAll();
    }
}
