package org.example.clientPackage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.ScrollPane;


public class mainMenu extends Application {
    private ScrollPane scrollPane = new ScrollPane();
    private BorderPane root = new BorderPane();
    private Scene scene = new Scene(root);
    @Override
    public void start(Stage stage) throws Exception {
        root.setCenter(scrollPane);

        stage.setScene(scene);
        stage.show();
    }
    public static void goUI(String[] args){
        launch(args);
    }
}
