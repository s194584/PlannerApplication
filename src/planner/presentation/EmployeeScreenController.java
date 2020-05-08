package planner.presentation;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.util.converter.DoubleStringConverter;
import planner.app.*;
import planner.presentation.prompts.Editor;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Optional;

public class EmployeeScreenController {
    @FXML private Label weekNumLabel;
    @FXML private Button managerBtn;
    @FXML private Button registerBtn;
    @FXML private TableView<Activity> activityTable;
    @FXML private TableColumn<Activity, String> nameCol;
    @FXML private TableColumn<Activity, Integer> idCol;
    @FXML private TableColumn<Activity, String> descriptionCol;
    @FXML private TableColumn<Activity, Double> etaCol;
    @FXML private TableColumn<Activity, Double> timeUsedCol;
    @FXML private TableColumn<Activity, Integer> endDateCol;

    private Employee currentEmployee;
    private PlannerApplication plannerApplication;

    @FXML
    public void initialize(){
        registerBtn.disableProperty().bind(activityTable.getSelectionModel().selectedItemProperty().isNull());

        nameCol.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getInformation().getName()));
        descriptionCol.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getInformation().getDescription().length()>15 ?
                data.getValue().getInformation().getDescription().substring(0,14)+"...":data.getValue().getInformation().getDescription()));
        etaCol.setCellValueFactory(new PropertyValueFactory<>("estimatedTimeUsage"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("ID"));
        timeUsedCol.setCellValueFactory((data -> new SimpleDoubleProperty(currentEmployee.getRegisteredTime(data.
                getValue().getID())).asObject()));
        endDateCol.setCellValueFactory((data -> new SimpleObjectProperty<>(DateMapper.transformToWeekNumber(data.getValue().
                getInformation().getEndDate()))));
    }

    public void loadPlannerApplication(PlannerApplication plannerApplication) {
        this.plannerApplication = plannerApplication;
        currentEmployee = (Employee) plannerApplication.getCurrentUser();
        if(currentEmployee instanceof ProjectManager){
            managerBtn.setDisable(false);
        }else{
            managerBtn.setDisable(true);
        }
        weekNumLabel.setText(""+Calendar.getInstance().get(Calendar.WEEK_OF_YEAR));
        refresh();
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
        activityTable.getItems().addAll(currentEmployee.getActivities());
    }

    @FXML
    void registerAbsence() {
        AbsenceActivity aa = new AbsenceActivity();
        Editor editor = new Editor(aa,plannerApplication);
        if(editor.hasResult()){
            currentEmployee.assignActivity(aa);
        }
        refresh();
    }

    @FXML
    void registerTime() {
        TextInputDialog td = timeRegisterBox("Please enter used time [hr]");
        Optional<String> result = td.showAndWait();
        try {
            result.ifPresent(s -> currentEmployee.registerTime(activityTable.getSelectionModel().getSelectedItem().
                    getID(),Utiliy.roundDoubleToHalf(Double.parseDouble(s))));
        } catch(NumberFormatException e){
            showAlertMessage("Please enter a number!");
            registerTime();
        } catch (IllegalArgumentException e){
            showAlertMessage("Registered time cannot be negative");
            registerTime();
        }
        refresh();
    }

    public TextInputDialog timeRegisterBox(String header){
        TextInputDialog td = new TextInputDialog();
        td.getEditor().setTextFormatter(new TextFormatter<>(new DoubleStringConverter()));
        td.setHeaderText(header);
        return td;
    }

    public void showAlertMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR, message);
        alert.showAndWait();
    }
}
