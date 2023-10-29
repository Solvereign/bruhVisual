package lab04;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class _03_Random3Card extends Application {

	@Override
	public void start(Stage pstage)  {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i <= 54; i++) {
			list.add(i);
		}
		
		java.util.Collections.shuffle(list);
		
		FlowPane p = new FlowPane();
		p.setHgap(10);
		p.setPadding(new Insets(10, 10, 10 ,10));
		p.getChildren().addAll(getImageView(list.get(0)), getImageView(list.get(1)), getImageView(list.get(2)) );
		Scene scene = new Scene(p);
		
		pstage.setScene(scene);
		pstage.setTitle("3 random cards");
		pstage.show();
	}
	
	private ImageView getImageView(int n) {
		String str = new String("/images/cards/");
		str += n;
		str += ".png";
		Image img = new Image(str);
		ImageView imgv = new ImageView(img);
		imgv.setFitWidth(125);
		imgv.setFitHeight(181);
		return imgv;
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
