package planner.presentation.prompts;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.IntegerStringConverter;
import planner.app.*;

import java.time.LocalDate;
import java.util.List;

public class EditorController {

    /* To Do:
    Assign employee*
    Datoer*

    Antal activiteter i angivet tidsrum

    Refactor så employee har activities. Det samme for project manager.
    Employee skal kunne registerer tid.
    Generelt skal employee virke (evt. planlægge egne aktiviteter)

    Projekt Manager overview (estimated time) *
    * */

    @FXML private TextField nameField;
    @FXML private DatePicker startPicker;
    @FXML private DatePicker endPicker;
    @FXML private TextArea descriptionField;
    @FXML private TextField estimatedTimeField;
    @FXML private Button confirmBtn;
    @FXML private Button cancelBtn;
    @FXML private TableView<Employee> employeeTable;
    @FXML private ListView<Employee> assignedEmployees;
    @FXML private TableColumn<Employee, String> empCol;
    @FXML private TableColumn<Employee, String> noActCol;
    @FXML private TableColumn<Employee, Boolean> absenceCol;
    @FXML private Button assignToAct;


    private Information information;
    public Boolean hasResult = false;
    private Workable workable;
    PlannerApplication plannerApplication;

    public void initialize() {
        employeeTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        empCol.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getInitials()));
        noActCol.setCellValueFactory(data -> new SimpleStringProperty(("" + data.getValue().getActivities().size())));
        absenceCol.setCellValueFactory(data -> new SimpleBooleanProperty(data.getValue().isAvailable(startPicker.
                getValue(),endPicker.getValue())));

        estimatedTimeField.setTextFormatter(new TextFormatter<>(new DoubleStringConverter()));

        // Adding handlers on DatePickers to resetStyle
        startPicker.addEventHandler(MouseEvent.MOUSE_CLICKED,event -> {
            resetDateStyles();
        });
        endPicker.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            resetDateStyles();
        });
        startPicker.valueProperty().addListener((observableValue, date, t1) -> {
            employeeTable.refresh();
        });
        endPicker.valueProperty().addListener((observableValue, date, t1) -> {
            employeeTable.refresh();
        });
    }
    private void resetDateStyles(){
        startPicker.setStyle("");
        endPicker.setStyle("");
    }
    public void loadPlannerApplication(PlannerApplication plannerApplication) {
        this.plannerApplication = plannerApplication;
        if(workable instanceof Activity){
            estimatedTimeField.setText("" + ((Activity) workable).getEstimatedTimeUsage());
        }
        refresh();
    }

    void refresh() {
        List<User> users = plannerApplication.getUsers();
        employeeTable.getItems().clear();
        ObservableList<Employee> startEmployees = employeeTable.getItems();
        for (int i = 1; i < users.size(); i++) {
            startEmployees.add((Employee) users.get(i));
        }
        if(workable instanceof Activity) {
            Activity a = (Activity) workable;
            assignedEmployees.getItems().clear();
            assignedEmployees.getItems().addAll(plannerApplication.getEmployeesAssignedToActivity(a));

        }
        assignedEmployees.refresh();
    }

    @FXML
    void cancel() {
        Stage win = (Stage) cancelBtn.getScene().getWindow();
        win.close();
    }

    @FXML
    void confirm() {
        boolean validInput = true;

        try {
            double num = Double.parseDouble(estimatedTimeField.getText());
            ((Activity) workable).setEstimatedTimeUsage(Utiliy.roundDoubleToHalf(num));
        }catch(NumberFormatException e){
            // Nothing app breaking happens, when this error is thrown
        }

        information.setName(nameField.getText());
        information.setDescription(descriptionField.getText());

        if(startPicker.getValue()!=null){
            information.setStartDate(startPicker.getValue());
        }

        try {
            information.setEndDate(endPicker.getValue());
        } catch (IllegalArgumentException e) {
            validInput = false;
            String errorStyle = "-fx-background-color:#F44336";
            startPicker.setStyle(errorStyle);
            endPicker.setStyle(errorStyle);
        }
        if (validInput) {
            hasResult = true;
            cancel();
        }

    }

    public void setWorkable(Workable workable){
        this.workable = workable;
    }

    public void setInformation(Information information) {
        this.information = information;
        nameField.setText(information.getName());
        descriptionField.setText(information.getDescription());
        try {
            startPicker.setPromptText(DateMapper.transformToString(information.getStartDate()));
        } catch (NullPointerException e) {
            System.out.println("No start date");
        }
        try {
            endPicker.setPromptText(DateMapper.transformToString(information.getEndDate()));
        } catch (NullPointerException e) {
            System.out.println("No end date");
        }
    }

    @FXML
    public void assignToAct() {
        ObservableList<Employee> employeesToBe = employeeTable.getSelectionModel().getSelectedItems();
        Activity a = (Activity) workable;
        for (Employee e: employeesToBe) {
            e.assignActivity(a);
        }
        refresh();
    }
}
