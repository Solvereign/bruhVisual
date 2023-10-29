package lab04;


import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class _11_SmileyFace extends Application {

	private double faceR = 100;
	private double noseL = faceR / 25;
	private double eyeR = faceR / 10;
	private double eyeEW = eyeR + eyeR;
	private double eyeEH = eyeR * 1.5;
	private double WIDTH = 300;
	private double HEIGHT = 300;
	
	@Override
	public void start(Stage pStage) {
		// TODO Auto-generated method stub
		Pane p = new Pane();
//		StackPane p = new StackPane();
		p.setPadding(new Insets(20));
		
		double centerX = WIDTH/2;
		double centerY = HEIGHT/2;
		
//		DoubleProperty centerX = new SimpleDoubleProperty();
//		centerX.bind(p.widthProperty().divide(2));
//		DoubleProperty centerY = new SimpleDoubleProperty();
//		centerY.bind(p.heightProperty().divide(2));
		
		Circle c = new Circle();
		c.setRadius(faceR);
		c.setCenterX(centerX);
		c.setCenterY(centerY);
		c.setStroke(Color.BLACK);
		c.setFill(Color.WHITE);
		
		p.getChildren().add(c);
		
		Polygon nose = new Polygon();
		nose.setFill(Color.WHITE);
		nose.setStroke(Color.BLACK);
		ObservableList<Double> list = nose.getPoints();
		list.add(centerX);
		list.add(centerY - 4 * noseL);
		list.add(centerX + 5 * noseL);
		list.add(centerY + 6 * noseL);
		list.add(centerX - 5 * noseL);
		list.add(centerY + 6 * noseL);
				
		p.getChildren().add(nose);
		
		p.getChildren().add(getEyeWhite(centerX + faceR/2 - eyeR, centerY - faceR/2 + eyeR));
		p.getChildren().add(getEye(centerX + faceR/2 - eyeR, centerY - faceR/2 + eyeR));
		p.getChildren().add(getEyeWhite(centerX - faceR/2 + eyeR, centerY - faceR/2 + eyeR));
		p.getChildren().add(getEye(centerX - faceR/2 + eyeR, centerY - faceR/2 + eyeR));
		
		Arc mouth = new Arc(centerX, centerY + 8 * noseL,
							faceR/2, eyeEW, 180, 180);
		mouth.setType(ArcType.OPEN);
		mouth.setFill(Color.WHITE);
		mouth.setStroke(Color.BLACK);
		p.getChildren().add(mouth);
		
		Scene scene = new Scene(p, WIDTH, HEIGHT);
		pStage.setScene(scene);
		pStage.setTitle("Smiley Face");
		pStage.show();
	}
	
	private Circle getEye(double x, double y) {
		Circle k = new Circle(x, y, eyeR);
		return k;
	}
	
	private Ellipse getEyeWhite(double x, double y) {
		Ellipse e = new Ellipse(x, y, eyeEW, eyeEH);
		e.setStroke(Color.BLACK);
		e.setFill(Color.WHITE);
		return e;
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	
}
