package lab04;

import javafx.application.Application;
//import javafx.beans.property.DoubleProperty;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class _10_Cylinder extends Application {

	private double xRad = 120;
	private double yRad = 60;
	private double height = 240;
	@Override
	public void start(Stage pStage){
		// TODO Auto-generated method stub
		Pane p = new Pane();
		p.setPadding(new Insets(20));
		
//		DoubleProperty p.widthProperty().divide(2) = null;
//		p.widthProperty().divide(2).bind(p.widthProperty().divide(2));
//		DoubleProperty p.heightProperty().divide(2) = null;
//		p.heightProperty().divide(2).bind(p.heightProperty().divide(2));
		
		Ellipse top = new Ellipse(0, 0, xRad, yRad);
		top.centerXProperty().bind(p.widthProperty().divide(2));
		top.centerYProperty().bind(p.heightProperty().divide(2).subtract(height/2));
		top.setFill(Color.WHITE);
		top.setStroke(Color.BLACK);
//		p.getChildren().add(top);
		
		Line leftLine = new Line();
		leftLine.startXProperty().bind(p.widthProperty().divide(2).subtract(xRad));
		leftLine.endXProperty().bind(p.widthProperty().divide(2).subtract(xRad));
		leftLine.startYProperty().bind(p.heightProperty().divide(2).subtract(height/2));
		leftLine.endYProperty().bind(p.heightProperty().divide(2).add(height/2));
		
		Line rightLine = new Line();
		rightLine.startXProperty().bind(p.widthProperty().divide(2).add(xRad));
		rightLine.endXProperty().bind(p.widthProperty().divide(2).add(xRad));
		rightLine.startYProperty().bind(p.heightProperty().divide(2).subtract(height/2));
		rightLine.endYProperty().bind(p.heightProperty().divide(2).add(height/2));
		
		
		Arc below = new Arc(0, 0, xRad, yRad, 180, 180);
		below.centerXProperty().bind(p.widthProperty().divide(2));
		below.centerYProperty().bind(p.heightProperty().divide(2).add(height/2));
		below.setType(ArcType.OPEN);
		below.setStroke(Color.BLACK);
		below.setFill(Color.WHITE);
		
		Arc dash = new Arc(0, 0, xRad, yRad, 0, 180);
		dash.centerXProperty().bind(p.widthProperty().divide(2));
		dash.centerYProperty().bind(p.heightProperty().divide(2).add(height/2));
		dash.getStrokeDashArray().addAll(6.0, 21.0);
		dash.setType(ArcType.OPEN);
		dash.setFill(Color.WHITE);
		dash.setStroke(Color.BLACK);
		p.getChildren().addAll(top, leftLine, rightLine, below, dash);
		
		Scene scene = new Scene(p);
		pStage.setScene(scene);
		pStage.setTitle("Cylinder");
		pStage.show();
		
//		arc.getStrokeDashArray().addAll(6.0, 21.0);
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}


}
