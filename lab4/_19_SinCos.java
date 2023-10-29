package lab04;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class _19_SinCos extends Application {

	@Override
	public void start(Stage pStage) {
		// TODO Auto-generated method stub
		Pane p = new Pane();
		
		Polyline sin = new Polyline();
		ObservableList<Double> list = sin.getPoints();
		double scaleFactor = 50;
		for (int x = -170; x <= 170; x++) {
			list.add(x + 200.0);
			list.add( scaleFactor * Math.sin((x / 100.0) * 2 * Math.PI) * (-1) + 100);
		}
		
		Polyline cos = new Polyline();
		ObservableList<Double> list2 = cos.getPoints();
		for (int x = -170; x <= 170; x++) {
			list2.add(x + 200.0);
			list2.add( scaleFactor * Math.cos((x / 100.0) * 2 * Math.PI) * (-1) + 100);
		}
		
		_20_DrawArrowLine.drawArrowLine(20, 100, 380, 100, p);
		_20_DrawArrowLine.drawArrowLine(200, 180, 200, 20, p);
		
		Text x = new Text(370, 90, "X");
		Text y = new Text(200, 15, "Y");
		Text zero = new Text(205, 110, "0");
		Text pi1 = new Text(250, 110, "\u03c0");
		Text pi2 = new Text(300, 110, "2\u03c0");
		Text pi3 = new Text(350, 110, "3\u03c0");
		
		Text pi11 = new Text(150, 110, "-\u03c0");
		Text pi22 = new Text(100, 110, "-2\u03c0");
		Text pi33 = new Text(50, 110, "-3\u03c0");
				
		p.getChildren().addAll(sin, cos, x, y, zero, pi1, pi2, pi3, pi11, pi22, pi33);
		Scene scene = new Scene(p, 400, 200);
		pStage.setScene(scene);
		pStage.setTitle("Sin and Cos");
		pStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
