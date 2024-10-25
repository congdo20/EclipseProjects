package testfx;

import javafx.application.Application;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.stage.StageStyle;

public class TestFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button btn = new Button();
		btn.setText("Say 'Hello World'");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("Hello World!");
			}
		});
		
		
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		
		Scene scene = new Scene(root, 300, 250);
		
		primaryStage.setTitle("Hello World!");
		primaryStage.setScene(scene);
		primaryStage.initStyle(StageStyle.DECORATED);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}

}
