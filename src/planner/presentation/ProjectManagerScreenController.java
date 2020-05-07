package planner.presentation;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import planner.app.*;
import planner.presentation.prompts.InformationEditor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProjectManagerScreenController {
    @FXML private Button employeeBtn;
    @FXML private ComboBox<Project> projectComboBox;
    private PlannerApplication plannerApplication;
    @FXML private TableView<Activity> activityTable;
    @FXML private TableColumn<Activity, String> nameCol;
    @FXML private TableColumn<Activity, String> desCol;
    @FXML private TableColumn estCol;
    @FXML private TableColumn<Activity, String> empCol;
    @FXML private TableColumn<Activity, String> startCol;
    @FXML private TableColumn<Activity, String> endCol;
    @FXML private Button addActivityBtn;
    @FXML private Button editActivityBtn;
    @FXML private Button cancelActivityBtn;

    @FXML
    public void initialize(){
        addActivityBtn.setDisable(true);
        editActivityBtn.disableProperty().bind(activityTable.getSelectionModel().selectedItemProperty().isNull());
        cancelActivityBtn.disableProperty().bind(activityTable.getSelectionModel().selectedItemProperty().isNull());

        nameCol.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getName()));
        desCol.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getDescription().length()>15 ?
                data.getValue().getDescription().substring(0,14)+"...":data.getValue().getDescription()));
        estCol.setCellValueFactory(new PropertyValueFactory("estimatedTimeUsage"));
        startCol.setCellValueFactory((data -> new SimpleObjectProperty(data.getValue().getStartDate())));
        endCol.setCellValueFactory((data -> new SimpleObjectProperty(data.getValue().getEndDate())));
    }

    public void loadPlannerApplication(PlannerApplication plannerApplication) {
        this.plannerApplication = plannerApplication;
        User currentUser = plannerApplication.getCurrentUser();
        List<Project> projects = plannerApplication.getProjects();
        for (Project p : projects) {
            if(p.getProjectManager().equals(currentUser)){
                projectComboBox.getItems().add(p);
            }
        }
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

    @FXML
    void updateSelection(ActionEvent event) {
        if(projectComboBox.getSelectionModel().getSelectedItem()!=null){
            addActivityBtn.setDisable(false);
        }
        activityTable.getItems().clear();
        List<Activity> selectedProject = projectComboBox.getSelectionModel().getSelectedItem().getActivities();
        for (Activity a:selectedProject) {
            activityTable.getItems().add(a);
        }
    }

    @FXML
    void addActivity(ActionEvent event) {
        Activity newActivity = new Activity();
        InformationEditor ie = new InformationEditor(newActivity, plannerApplication);
        System.out.println(ie.hasResult()+ " Is the right");
        if(ie.hasResult()){
            projectComboBox.getValue().addActivity(newActivity);
            activityTable.getItems().add(newActivity);
            activityTable.refresh();
        }
    }

    @FXML
    void cancelActivity(ActionEvent event) {
        Activity activity = activityTable.getSelectionModel().getSelectedItem();
        projectComboBox.getValue().removeActivity(activity.getID());
        activityTable.getItems().remove(activity);
        activityTable.refresh();
        activityTable.getSelectionModel().clearSelection();
    }

    @FXML
    void editActivity() {
        Activity activity = activityTable.getSelectionModel().getSelectedItem();
        InformationEditor ie = new InformationEditor(activity, plannerApplication);
        activityTable.refresh();
        activityTable.getSelectionModel().clearSelection();
    }

    @FXML
    void editActivityByMouse(MouseEvent event){
            if(event.getButton().equals(MouseButton.PRIMARY) &&
                    event.getClickCount()==2 && !activityTable.getItems().isEmpty()){
                editActivity();
            }
    }
}
