package planner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import planner.app.PlannerApplication;

public class Main extends Application {
    // To run javaFX; --module-path ${PATH_TO_FX11} --add-modules=javafx.controls,javafx.fxml
    // The resource folder has to be marked as such in project structure
    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/LoginScreen.fxml"));

        primaryStage.setTitle("Planner Application");
        primaryStage.setScene(new Scene(root));
        //primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("/pictures/plannericon.png"));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}