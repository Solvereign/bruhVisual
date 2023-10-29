package lab04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class _06_Checkboard extends Application {

	@Override
	public void start(Stage pStage) {
		// TODO Auto-generated method stub
//		GridPane p = new GridPane();
		double side = 40;
		Pane p = new Pane();
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				Rectangle r = new Rectangle(i*side, j*side, side, side);
				if((i + j) % 2 == 1)
					r.setFill(Color.BLACK);
				else r.setFill(Color.WHITE);
				p.getChildren().add(r);
			}
		}
		
		Scene scene = new Scene(p);
		pStage.setScene(scene);
		pStage.setTitle("Checkboard");
		pStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}


}
