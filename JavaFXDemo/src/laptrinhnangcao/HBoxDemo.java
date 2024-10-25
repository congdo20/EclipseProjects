package laptrinhnangcao;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxDemo extends Application {
    public void start(Stage primaryStage) {
        HBox root = new HBox();
        root.setSpacing(10);
        root.setPadding(new Insets(15, 20, 10, 10));
        

        Button btn1 = new Button("Button1");
        root.getChildren().add(btn1);

        Button btn2 = new Button("button2");
        btn2.setPrefSize(100, 100);
        root.getChildren().add(btn2);

        TextField textField = new TextField("TextField");
        textField.setPrefWidth(110);
        root.getChildren().add(textField);

        CheckBox checkBox = new CheckBox();
        root.getChildren().add(checkBox);

        RadioButton radioButton = new RadioButton("Radio Button");
        root.getChildren().add(radioButton);

        Scene scene = new Scene(root, 550, 250);
        primaryStage.setTitle("HBox Deme");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
