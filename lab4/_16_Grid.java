package lab04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class _16_Grid extends Application {

	@Override
	public void start(Stage pStage) {
		// TODO Auto-generated method stub
		Pane p = new Pane();
		drawHorizontalLine(p, 1);
		drawHorizontalLine(p, 2);
		drawVerticalLine(p, 1);
		drawVerticalLine(p, 2);
		
		Scene scene = new Scene(p, 100, 100);
		pStage.setScene(scene);
		pStage.setTitle("Grid");
		pStage.show();
		
	}
	
	private void drawHorizontalLine(Pane p, int i) {
		Line l = new Line();
//		l.startXProperty().bind(p.h);
		l.endXProperty().bind(p.widthProperty());
		
		l.startYProperty().bind(p.heightProperty().divide(3).multiply(i));
		l.endYProperty().bind(p.heightProperty().divide(3).multiply(i));
		l.setStroke(Color.BLUE);
		p.getChildren().add(l);
		
	}
	
	private void drawVerticalLine(Pane p, int i) {
		Line l = new Line();
		l.startXProperty().bind(p.widthProperty().divide(3).multiply(i));
		l.endXProperty().bind(p.widthProperty().divide(3).multiply(i));
		
		l.endYProperty().bind(p.heightProperty());
//		l.setFill(Color.RED);
		l.setStroke(Color.RED);
		p.getChildren().add(l);
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}


}
