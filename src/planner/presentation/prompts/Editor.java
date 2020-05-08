package planner.presentation.prompts;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import planner.app.*;

import java.io.IOException;
import java.util.List;

public class Editor {
    boolean hasResult;
    Stage stage = new Stage();

    public Editor(Workable workable, PlannerApplication plannerApplication) {
        FXMLLoader loader = null;
        try{
            loader = new FXMLLoader(getClass().getResource("/fxml/prompts/Editor.fxml"));
            HBox root = loader.load();
            EditorController ec = loader.getController();
            ec.setInformation(workable.getInformation());
            ec.setWorkable(workable);
            ec.loadPlannerApplication(plannerApplication);
            if(workable instanceof Project || workable instanceof AbsenceActivity){
                root.getChildren().remove(1);
                root.getChildren().remove(1);
            }
            stage.setScene(new Scene(root));
            stage.showAndWait();
            hasResult = ec.hasResult;
        }catch(IOException e){
            System.out.println( e.getMessage());
            System.out.println("InformationEditor FXML not found");
        }
    }

    public boolean hasResult() {
        return hasResult;
    }
}
