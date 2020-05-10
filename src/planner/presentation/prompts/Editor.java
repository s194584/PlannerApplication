package planner.presentation.prompts;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import planner.app.*;

import java.io.IOException;

// Ansvarlig: Christopher
public class Editor {
    boolean hasResult;
    Stage stage = new Stage();

    public Editor(Workable workable, PlannerApplication plannerApplication) {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/prompts/Editor.fxml"));
            HBox root = loader.load();
            EditorController ec = loader.getController();
            ec.loadPlannerApplication(plannerApplication,workable);

            if(workable instanceof Project || workable instanceof AbsenceActivity){
                root.getChildren().remove(1);
                root.getChildren().remove(1);
            }
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.setTitle("Editor");
            stage.showAndWait();

            hasResult = ec.hasResult;
        }catch(IOException e){
            System.out.println( e.getMessage());
            System.out.println("Editor FXML not found");
        }
    }

    public boolean hasResult() {
        return hasResult;
    }
}
