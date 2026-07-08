package org.example.clientPackage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class mainMenu extends Application {
    public BorderPane root = new BorderPane();
    public Scene scene = new Scene(root);
    @Override
    public void start(Stage stage) throws Exception {


        stage.setScene(scene);
        stage.show();
    }
    public static void goUI(String[] args){
        launch(args);
    }
}
