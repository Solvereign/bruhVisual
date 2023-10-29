package lab04;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class _07_Display0sAnd1s extends Application {

	private Random rand = new Random();
	@Override
	public void start(Stage pStage) {
		// TODO Auto-generated method stub
		GridPane p = new GridPane();
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				int a = rand.nextInt(2);
				TextField tf = new TextField("h");
				tf.setMaxWidth(25);
				tf.setText("" + a);
				p.add(tf, i, j);
			}
		}
		
		Scene scene = new Scene(p);
		pStage.setScene(scene);
		pStage.setTitle("Display 10x10 matrix");
		pStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
