package planner.presentation;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
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

    @FXML
    public void initialize(){
        nameCol.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getInformation().getName()));
        desCol.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getInformation().getDescription().length()>15 ?
                data.getValue().getInformation().getDescription().substring(0,14)+"...":data.getValue().getInformation().getDescription()));
        estCol.setCellValueFactory(new PropertyValueFactory("estimatedTimeUsage"));
//        projectNameCol.setCellValueFactory(data -> new SimpleStringProperty("" + data.getValue().getProjectName()));
//        projectIDCol.setCellValueFactory(new PropertyValueFactory("projectID"));
//        projectManCol.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getProjectManager().getInitials()));
//        projectActCol.setCellValueFactory(data -> new SimpleStringProperty("" + data.getValue().getNumberOfActivities()));
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
        activityTable.getItems().clear();
        List<Activity> selectedProject = projectComboBox.getSelectionModel().getSelectedItem().getActivities();
        for (Activity a:selectedProject) {
            activityTable.getItems().add(a);
        }
    }

    @FXML
    void addActivity(ActionEvent event) throws IOException {
        Activity newActivity = new Activity();
        InformationEditor ie = new InformationEditor(newActivity.getInformation());
        System.out.println(ie.hasResult()+ " Is the right");
        if(ie.hasResult()){
            projectComboBox.getValue().addActivity(newActivity);
            activityTable.getItems().add(newActivity);
            activityTable.refresh();
        }

    }

    private void showInformationEditor(Information information) throws IOException {

    }

    @FXML
    void cancelActivity(ActionEvent event) {

    }

    @FXML
    void editActivity(ActionEvent event) {

    }


}
