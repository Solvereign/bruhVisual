package lab04;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
//import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class _09_Fans extends Application {
	
	private double r = 50;
	private double fr = r*0.8;
	@Override
	public void start(Stage pStage){
		GridPane p = new GridPane();
		p.setPadding(new Insets(10));
		p.setVgap(20);
		p.setHgap(20);
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				p.add(getFanPane(), i, j);
			}
		}
		
		Scene scene = new Scene(p);
		pStage.setScene(scene);
		pStage.setTitle("Fans");
		pStage.show();
	}
	
	private Pane getFanPane() {
//		StackPane pane = new StackPane();
		Pane pane = new Pane();
		Circle circle = new Circle();
		circle.setRadius(r);
		circle.setCenterX(r);
		circle.setCenterY(r);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		pane.getChildren().add(circle);
		
		for(int i = 0; i < 4; i++) {
			Arc a = new Arc(r, r, fr, fr, (i*90+60), 45);
			a.setType(ArcType.ROUND);
			pane.getChildren().add(a);
		}
		
		
		return pane;
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}


}
