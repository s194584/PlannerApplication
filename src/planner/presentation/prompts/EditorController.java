package planner.presentation.prompts;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import planner.app.*;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class EditorController {

    /* To Do:
    Assign employee
    Datoer
    Antal activiteter i angivet tidsrum
    Refactor så employee har activities. Det samme for project manager.
    Employee skal kunne registerer tid.
    Generelt skal employee virke (evt. planlægge egne aktiviteter.
    Projekt Manager overview (estimated time).
    * */

    @FXML private TextField nameField;
    @FXML private DatePicker startPicker;
    @FXML private DatePicker endPicker;
    @FXML private TextArea descriptionField;
    @FXML private Button confirmBtn;
    @FXML private Button cancelBtn;
    @FXML private TableView<Employee> employeeTable;
    @FXML private TableColumn<Employee, String> empCol;
    @FXML private TableColumn<Employee, String> noActCol;
    @FXML private Button assignToAct;


    private Information information;
    public Boolean hasResult =false;
    private Workable workable;
    PlannerApplication plannerApplication;

    public void initialize(){
        empCol.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getInitials()));
        noActCol.setCellValueFactory(data -> new SimpleStringProperty(("" + data.getValue().getNoOfActivities())));
    }

    public void loadPlannerApplication(PlannerApplication plannerApplication) {
        this.plannerApplication = plannerApplication;
        refresh();
    }

    void refresh(){
        List<User> users = plannerApplication.getUsers();
        ObservableList<Employee> startEmployees = employeeTable.getItems();
        for(int i =1 ; i<users.size(); i++){
            startEmployees.add((Employee) users.get(i));
        }
    }

    @FXML
    void cancel() {
        Stage win = (Stage) cancelBtn.getScene().getWindow();
        win.close();
    }

    @FXML
    void confirm() {
        information.setName(nameField.getText());
        information.setDescription(descriptionField.getText());
        try {
            information.setStartDate(startPicker.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        }catch (Exception e){
            System.out.println("No start date selected");
        }
        try {
            information.setEndDate(endPicker.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        }catch (Exception e){
            System.out.println("No end date selected");
        }
        hasResult = true;
        cancel();
    }

    public void setInformation(Information information) {
        this.information = information;
        nameField.setText(information.getName());
        descriptionField.setText(information.getDescription());
        startPicker.setPromptText(information.getStartDate());
        endPicker.setPromptText(information.getEndDate());
    }

    @FXML
    public void assignToAct(){

    }
}
