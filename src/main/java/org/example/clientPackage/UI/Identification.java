package org.example.clientPackage.UI;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.util.Stack;

public class Identification extends Application {
    private StackPane root = new StackPane();
    private Scene scene = new Scene(root);
    private HBox identification = new HBox();


    public static void goUI(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Rectangle win = new Rectangle();

        identification.getChildren().add(win);
        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
        stage.setWidth(Math.max(800, bounds.getWidth() * 0.85));
        stage.setHeight(Math.max(600, bounds.getHeight() * 0.85));
        stage.setMinWidth(600);
        stage.setMinHeight(400);

        stage.setScene(scene);
        stage.show();
    }
}
