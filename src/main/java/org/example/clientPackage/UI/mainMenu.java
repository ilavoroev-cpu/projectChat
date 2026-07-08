package org.example.clientPackage.UI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.control.ScrollPane;




public class mainMenu extends Application {
    private BorderPane root = new BorderPane();
    private Scene scene = new Scene(root);
    private VBox chats = new VBox(15);
    private ScrollPane scrollPane = new ScrollPane(chats);
    @Override
    public void start(Stage stage) throws Exception {
        root.setCenter(scrollPane);
        chats.setPadding(new Insets(10, 8, 10, 8));
        //подргрузка данных из бд
        for (int i = 0; i < 50; i++){

            chats.getChildren().add(new Rectangle(300,400));
        }
        stage.setScene(scene);
        stage.show();
    }
    public static void goUI(String[] args){
        launch(args);
    }
}
