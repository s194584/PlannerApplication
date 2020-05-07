package planner.presentation.prompts;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Pair;
import planner.app.Information;

import java.io.IOException;

public class InformationEditor {
    boolean hasResult;

    public InformationEditor(Information information) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/prompts/infomationEditor.fxml"));
        Parent root2 = loader.load();
        InformationEditorController iec = loader.getController();
        iec.setInformation(information);
        stage.setScene(new Scene(root2));
        stage.showAndWait();
        hasResult = iec.hasResult;
    }

    public boolean hasResult() {
        return hasResult;
    }
}
