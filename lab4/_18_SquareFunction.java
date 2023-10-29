package lab04;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class _18_SquareFunction extends Application {

	@Override
	public void start(Stage pStage){
		// TODO Auto-generated method stub
		
		Pane p = new Pane(); 
		
		Polyline polyline = new Polyline();
		
		ObservableList<Double> list = polyline.getPoints();
		double scaleFactor = 0.0125;
		for (int x = -100; x <= 100; x++) {
			list.add(x + 200.0);
			list.add(200-scaleFactor * x * x);
		}
		_20_DrawArrowLine.drawArrowLine(20, 200, 380, 200, p);
		_20_DrawArrowLine.drawArrowLine(200, 280, 200, 20, p);
		
//		Label x = new Label("X");
		Text x = new Text(370, 190, "X");
		Text y = new Text(200, 15, "Y");
		
		p.getChildren().addAll(polyline, x, y);
		
		Scene scene = new Scene(p, 400, 300);
		
		pStage.setScene(scene);
		pStage.show();
		
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}


}
