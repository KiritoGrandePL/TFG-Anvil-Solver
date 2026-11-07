package io.github.KiritoGrandePL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    public static void main (String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/TFG_Anvil_Rewritten.fxml"));
        Scene scene = new Scene(root);
        String cssAnvilActions = this.getClass().getResource("/AnvilActions.css").toExternalForm();
        scene.getStylesheets().add(cssAnvilActions);

        primaryStage.setScene(scene);
        primaryStage.setTitle("TFG Anvil Solver");
        primaryStage.show();
    }
}