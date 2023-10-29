package lab04;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class _13_PieChart extends Application {
	
	private double start = 0;
	private double r = 80;
	
	@Override
	public void start(Stage pStage) {
		// TODO Auto-generated method stub
		Pane p = new Pane();
		p.setPadding(new Insets(20));

		drawPart(p, 20, "Project", Color.RED);
		drawPart(p, 10, "Quiz", Color.BLUE);
		drawPart(p, 30, "Midterm", Color.GREEN);
		drawPart(p, 40, "Final", Color.ORANGE);
		
		Scene scene = new Scene(p);
		pStage.setScene(scene);
		pStage.setTitle("Pie chart");
		pStage.show();
		
	}

	
	private void drawPart(Pane p, double percentage, String str, Color color) {
		double len = percentage/5 * 18;
				
		Arc a = new Arc(r, r, r, r, start, len);
		a.setStroke(Color.BLACK);
		a.setFill(color);
		a.setType(ArcType.ROUND);
		a.centerXProperty().bind(p.widthProperty().divide(2));
		a.centerYProperty().bind(p.heightProperty().divide(2));
		p.getChildren().add(a);
		
		str += " -- ";
		str += percentage;
		str += "%";
		Text t = new Text(str);
//		t.setX(Math.cos( Math.toRadians(percentage/4 + start/2) ) * r);
//		t.setY(Math.sin( Math.toRadians(percentage/4 + start/2) ) * r);
		t.xProperty().bind(p.widthProperty().divide(2).add(Math.cos( Math.toRadians(len/2 + start) ) * r).subtract(r/2));
		t.yProperty().bind(p.heightProperty().divide(2).subtract(Math.sin( Math.toRadians(len/2 + start) ) * r));
//		t.yProperty().bind(p.heightProperty().divide(2).subtract(Math.sin( Math.toRadians(percentage/2 + start) ) * r).subtract(t.getStrokeWidth()));
		p.getChildren().add(t);
		start += len;
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}


}
