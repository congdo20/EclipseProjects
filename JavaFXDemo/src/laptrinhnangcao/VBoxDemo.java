package laptrinhnangcao;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxDemo extends Application {
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.setSpacing(10);
        root.setPadding(new Insets(15, 20, 10, 10));

        Button btn1 = new Button("Button 1");
        root.getChildren().add(btn1);
        
        Button btn2 = new Button("Button 2");
        btn2.setPrefSize(100, 100);
        root.getChildren().add(btn2);

        TextField textField = new TextField("TextField");
        textField.setPrefWidth(110);
        root.getChildren().add(textField);

        CheckBox checkBox = new CheckBox("Check Box");
        root.getChildren().add(checkBox);

        RadioButton radioButton = new RadioButton("Radio Button");
        root.getChildren().add(radioButton);


        Scene scene = new Scene(root, 550, 250);
        primaryStage.setTitle("VBox Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
