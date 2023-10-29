package lab04;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.*;

public class _01_DisplayImages extends Application {

	@Override
	public void start(Stage pStage) {
		GridPane p = new GridPane();
		p.setPadding(new Insets(10, 10, 10, 10));
		p.setAlignment(Pos.CENTER);
		p.setHgap(5);
		p.setVgap(5);
		
		Image img1 = new Image("images/first/1.jpg");
		Image img2 = new Image("images/first/2.jpg");
		Image img3 = new Image("images/first/3.jpg");
		Image img4 = new Image("images/first/4.jpg");
		
		ImageView imgv1 = new ImageView(img1);
		ImageView imgv2 = new ImageView(img2);
		ImageView imgv3 = new ImageView(img3);
		ImageView imgv4 = new ImageView(img4);
		
		imgv1.setFitHeight(200);
		imgv1.setFitWidth(200);
		imgv2.setFitHeight(200);
		imgv2.setFitWidth(200);
		imgv3.setFitHeight(200);
		imgv3.setFitWidth(200);
		imgv4.setFitHeight(200);
		imgv4.setFitWidth(200);
				
		p.add(imgv1, 0, 0);
		p.add(imgv2, 1, 0);
		p.add(imgv3, 0, 1);
		p.add(imgv4, 1, 1);
		
		Scene scene = new Scene(p);
		
		pStage.setScene(scene);
		pStage.setTitle("Four images");
		pStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
