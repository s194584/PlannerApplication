package planner.presentation.prompts;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import planner.app.DateMapper;
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
            information.setStartDate(DateMapper.transformToDate(startPicker.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))));
            information.setEndDate(DateMapper.transformToDate(endPicker.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))));
        }catch (Exception e){

        }
        hasResult = true;
        cancel();
    }

    public void setInformation(Information information) {
        this.information = information;
        nameField.setText(information.getName());
        descriptionField.setText(information.getDescription());
        startPicker.setPromptText(DateMapper.transformToString(information.getStartDate()));
        endPicker.setPromptText(DateMapper.transformToString(information.getEndDate()));
    }
}
