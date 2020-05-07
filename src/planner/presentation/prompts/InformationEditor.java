package planner.presentation.prompts;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import planner.app.Activity;
import planner.app.Information;
import planner.app.PlannerApplication;

import java.io.IOException;

public class InformationEditor {
    boolean hasResult;
    Stage stage = new Stage();
    HBox moduleContainer = new HBox();

    public InformationEditor(Information information) {
        moduleContainer.setSpacing(10);
        moduleContainer.setPadding(new Insets(10,10,10,10));
        FXMLLoader loader = null;
        try{
            loader = new FXMLLoader(getClass().getResource("/fxml/prompts/informationEditor.fxml"));
            moduleContainer.getChildren().add(0,loader.load());
            InformationEditorController iec = loader.getController();
            iec.setInformation(information);
            stage.setScene(new Scene(moduleContainer));
            stage.showAndWait();
            hasResult = iec.hasResult;
        }catch(IOException e){
            System.out.println("InformationEditor FXML not found");
        }
    }

    public  InformationEditor(Activity activity,PlannerApplication pa){
        moduleContainer.setSpacing(10);
        moduleContainer.setPadding(new Insets(10,10,10,10));
        FXMLLoader loader = null;
        FXMLLoader loader1 = null;
        try{
            loader = new FXMLLoader(getClass().getResource("/fxml/prompts/informationEditor.fxml"));
            moduleContainer.getChildren().add(0,loader.load());
            loader1 = new FXMLLoader(getClass().getResource("/fxml/prompts/activityModule.fxml"));
            moduleContainer.getChildren().add(1,loader1.load());
            InformationEditorController iec = loader.getController();
            iec.setInformation(activity.getInformation());
            ActivityModuleController amc = loader1.getController();
            amc.loadPlannerApplication(pa);
            stage.setScene(new Scene(moduleContainer));
            stage.showAndWait();
            hasResult = iec.hasResult;
        }catch(IOException e){
            System.out.println("InformationEditor FXML not found");
        }
    }
    public boolean hasResult() {
        return hasResult;
    }
}
