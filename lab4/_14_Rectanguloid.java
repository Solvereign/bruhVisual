package lab04;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class _14_Rectanguloid extends Application {

	@Override
	public void start(Stage pStage){
		// TODO Auto-generated method stub
		Pane p = new Pane();
		
		// horizontal 
		drawLine(p, 2, 1, -1, 1);
		drawLine(p, 1, 2, -2, 2);
		drawLine(p, 2, -2, -1, -2);
		drawLine(p, 1, -1, -2, -1);
		
		// vertical
		drawLine(p, 1, 2, 1, -1);
		drawLine(p, 2, 1, 2, -2);
		drawLine(p, -2, 2, -2, -1);
		drawLine(p, -1, 1, -1, -2);
		
		// diagonal
		drawLine(p, 1, 2, 2, 1);
		drawLine(p, -2, 2, -1, 1);
		drawLine(p, 1, -1, 2, -2);
		drawLine(p, -2, -1, -1, -2);
		
		Scene scene = new Scene(p, 200, 200);
		pStage.setScene(scene);
		pStage.setTitle("Rectanguloid");
		pStage.show();
	}

	/*
	 * xi, yi ni eyreg baiwal zuun deed talaas ymar neg zaid
	 * surug baiwal baruun dood talaas ymar neg zaid:
	 * 1 uyd togtmol utga
	 * 2 uyd width, heigth-s hamaarah utga
	 * 
	 */
	private void drawLine(Pane p, int x1, int y1, int x2, int y2) {
		
		DoubleProperty xx = new SimpleDoubleProperty();
		xx.bind(p.widthProperty());
		DoubleProperty yy = new SimpleDoubleProperty();
		yy.bind(p.heightProperty());
		
//		double lenx = xx.divide(8).doubleValue();
//		double leny = yy.divide(8).doubleValue();
		double lenx = 50;
		double leny = 50;
		Line l = new Line();
		switch(x1) {
		case -2:
			l.startXProperty().bind(xx.subtract(lenx));
			break;
		case -1:
			l.startXProperty().bind(xx.subtract(20));
			break;
		case 1:
			l.setStartX(20);
			break;
		case 2:
			l.setStartX(lenx);
			break;
		default:
			break;
		}
		
		switch(x2) {
		case -2:
			l.endXProperty().bind(xx.subtract(lenx));
			break;
		case -1:
			l.endXProperty().bind(xx.subtract(20));
			break;
		case 1:
			l.setEndX(20);
			break;
		case 2:
			l.setEndX(lenx);
			break;
		default:
			break;
		}
		
		switch(y1) {
		case -2:
			l.startYProperty().bind(yy.subtract(leny));
			break;
		case -1:
			l.startYProperty().bind(yy.subtract(20));
			break;
		case 1:
			l.setStartY(20);
			break;
		case 2:
			l.setStartY(leny);
			break;
		default:
			break;
		}
		
		switch(y2) {
		case -2:
			l.endYProperty().bind(yy.subtract(leny));
			break;
		case -1:
			l.endYProperty().bind(yy.subtract(20));
			break;
		case 1:
			l.setEndY(20);
			break;
		case 2:
			l.setEndY(leny);
			break;
		default:
			break;
		}
		
		p.getChildren().add(l);
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
