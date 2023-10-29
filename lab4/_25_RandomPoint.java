package lab04;

import java.util.Arrays;
import java.util.Random;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class _25_RandomPoint extends Application {
	
	
	
	@Override
	public void start(Stage pStage) {

		double r = 100;
		Random rand = new Random();
		double pad = 20;
		
		Pane pane = new Pane();
		
		double angles[] = new double[5];
		for(int i = 0; i < 5; i++)
			angles[i] = rand.nextDouble(360);
		
		Arrays.sort(angles);
		
		Polygon durs = new Polygon();
		ObservableList<Double> list = durs.getPoints();
		for(double a: angles) {
			list.add(r + pad + r * Math.cos(Math.toRadians(a)));
			list.add(r + pad + r * Math.sin(Math.toRadians(a)));
		}
		durs.setFill(null);
		durs.setStroke(Color.BLACK);
		
		Circle c = new Circle(r + pad, r + pad, r);
		c.setStroke(Color.BLACK);
		c.setFill(null);
		pane.getChildren().addAll(c, durs);
		
		Scene scene = new Scene(pane, 2 * (pad + r), 2 * (pad + r));
		pStage.setScene(scene);
		pStage.setTitle("Random points on a circle");
		pStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}


}
