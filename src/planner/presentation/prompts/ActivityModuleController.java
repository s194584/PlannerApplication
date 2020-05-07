package planner.presentation.prompts;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import planner.app.*;

import java.util.List;

public class ActivityModuleController {

    @FXML private TableView<Employee> employeeTable;
    @FXML private TableColumn<Employee, String> empCol;
    @FXML private TableColumn<Employee, String> noActCol;
    @FXML private TextField searchEmp;
    @FXML private Button assignToAct;

    private PlannerApplication plannerApplication;

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
    void assignToAct(){

    }
}
