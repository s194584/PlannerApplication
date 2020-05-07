package planner.presentation.prompts;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import planner.app.Information;

import java.time.format.DateTimeFormatter;

public class InformationEditorController {

    @FXML private TextField nameField;
    @FXML private DatePicker startPicker;
    @FXML private DatePicker endPicker;
    @FXML private TextArea descriptionField;
    @FXML private Button confirmBtn;
    @FXML private Button cancelBtn;
    private Information information;
    public Boolean hasResult =false;

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
}
