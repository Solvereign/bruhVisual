package lab04;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class _08_DisplayAllCards extends Application {

	@Override
	public void start(Stage pstage)  {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i <= 54; i++) {
			list.add(i);
		}
		
		java.util.Collections.shuffle(list);
		
//		FlowPane p = new FlowPane();
		GridPane p = new GridPane();
		p.setHgap(10);
		p.setVgap(10);
		p.setPadding(new Insets(10, 10, 10 ,10));
//		p.getChildren().addAll(getImageView(list.get(0)), getImageView(list.get(1)), getImageView(list.get(2)) );
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 6; j++) {
				p.add(getImageView(list.get(i*6 + j)), i, j);
			}
		}
		Scene scene = new Scene(p);
		
		pstage.setScene(scene);
		pstage.setTitle("all cards");
		pstage.show();
	}
	
	private ImageView getImageView(int n) {
		String str = new String("/images/cards/");
		str += n;
		str += ".png";
		Image img = new Image(str);
		ImageView imgv = new ImageView(img);
		imgv.setFitWidth(62);
		imgv.setFitHeight(90);
		return imgv;
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
