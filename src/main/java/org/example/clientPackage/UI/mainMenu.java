package org.example.clientPackage.UI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.control.ScrollPane;




public class mainMenu extends Application {
    private BorderPane root = new BorderPane();
    private Scene scene = new Scene(root);
    private VBox chats = new VBox();
    private ScrollPane scrollPane = new ScrollPane(chats);
    @Override
    public void start(Stage stage) throws Exception {
        root.setCenter(scrollPane);

        //подргрузка данных из бд
        for (int i = 0; i < 50; i++){
            var r = new Rectangle(700,100);
            r.setFill(Color.LIGHTBLUE);
            r.setStroke(Color.BLACK);
            chats.getChildren().add(r);
            r.setOnMouseClicked(event -> {
                //реалезация перехода на чат
            });
        }


        stage.setScene(scene);
        stage.show();
    }
    public static void goUI(String[] args){
        launch(args);
    }
}
