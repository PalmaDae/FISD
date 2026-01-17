package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class  JavaFXExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label textLabel = new Label("Порядочное текстовое поле");
        Button myButton = new Button("Аккуратная кнопка");

        VBox root = new VBox(10);
        root.getChildren().addAll(textLabel, myButton);

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setTitle("Ровное окно");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
