package laptrinhnangcao;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackPaneDemo extends Application{
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("OK"));
        pane.getChildren().add(new Button("Cancel"));
        Scene scene = new Scene(pane, 200, 50);
        primaryStage.setTitle("StackPane Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
