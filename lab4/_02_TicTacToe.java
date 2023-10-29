package lab04;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class _02_TicTacToe extends Application {
		
	private Image o = new Image("images/xo/o.png");
	private Image x = new Image("images/xo/x.png");
	private Image empty = new Image("images/xo/empty.png");
	private Random rand = new Random();
	
	@Override
	public void start(Stage pstage) {
		GridPane p = new GridPane();
		p.setHgap(10); 
		p.setVgap(10);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				// -1, 0, 1 gesen ug. 0 baiwal hooson.
				int a = rand.nextInt(3)-1;
				p.add(getImageView(a), i, j);
			}
				
		}
		
		Scene scene = new Scene(p);
		
		pstage.setScene(scene);
		pstage.setTitle("Random x o");
		pstage.show();
		
	}
	
	private ImageView getImageView(int n) {
		ImageView imgv;
		if(n == -1)
			imgv = new ImageView(o);
		else if(n == 0)
			imgv = new ImageView(empty);
		else imgv = new ImageView(x);
		
		imgv.setFitHeight(200);
		imgv.setFitWidth(200);
		
		return imgv;
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
