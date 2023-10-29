package lab04;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class _15_Stop extends Application {
	
	@Override
	public void start(Stage pStage) {
		// TODO Auto-generated method stub
		StackPane p = new StackPane();
		Polygon oct = new Polygon();
		
		oct.setFill(Color.RED);
		oct.setStroke(Color.BLACK);
		ObservableList<Double> list = oct.getPoints();
		
		double WIDTH = 200, HEIGHT = 200;
		double centerX = WIDTH/2, centerY = HEIGHT/2;
		double radius = 80;
		for(int i = 0; i < 8; i++) {
			list.add(centerX + radius * Math.cos((2 * i + 1) * Math.PI/8));
			list.add(centerY - radius * Math.sin((2 * i + 1) * Math.PI / 8));
		}
		p.getChildren().add(oct);
		
		Label label = new Label("STOP");
		label.setFont(Font.font("Times New Roman",
		FontWeight.NORMAL, FontPosture.REGULAR, 40));
		label.setTextFill(Color.WHITE);
		p.getChildren().add(label);
		
		Scene scene = new Scene(p, WIDTH, HEIGHT);
		pStage.setScene(scene);
		pStage.setTitle("Stop sign");
		pStage.show();
		
		
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}


}
