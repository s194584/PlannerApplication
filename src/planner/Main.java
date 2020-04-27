package planner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import planner.app.Employee;
import planner.app.PlannerApplication;
import planner.app.Project;
import planner.app.User;

public class Main extends Application {
    // To run javaFX; --module-path ${PATH_TO_FX11} --add-modules=javafx.controls,javafx.fxml
    @Override
    public void start(Stage primaryStage) throws Exception{
        // The resource folder has to be marked as such in project structure

        PlannerApplication plannerApplication = new PlannerApplication();

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/loginScreen.fxml"));


        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}