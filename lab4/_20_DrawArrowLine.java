package lab04;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class _20_DrawArrowLine extends Application {
		
	Random rand = new Random();
	@Override
	public void start(Stage pStage) {
		// TODO Auto-generated method stub
		Pane p = new Pane();
		
		_20_DrawArrowLine.drawArrowLine(rand.nextInt(500), rand.nextInt(500), rand.nextInt(500), rand.nextInt(500), p);
		
		Scene scene = new Scene(p, 500, 500);
		pStage.setScene(scene);
		pStage.setTitle("Draw Arrow Line");
		pStage.show();
		
	}
	
	public static void drawArrowLine(double startX, double startY, double endX, double endY, Pane p) {
		Line body = new Line(startX, startY, endX, endY);
		double rad = Math.atan2(startY-endY, startX-endX);
		double len = 10;
		Line left = new Line(endX, endY,
				endX + Math.cos(rad + Math.PI/4)*len, endY + Math.sin( rad + Math.PI/4)*len);
		Line right = new Line(endX, endY,
				endX + Math.cos(rad - Math.PI/4)*len, endY + Math.sin( rad - Math.PI/4)*len);

		p.getChildren().addAll(body, left, right);
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	
}
