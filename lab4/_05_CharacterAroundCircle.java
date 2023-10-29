package lab04;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class _05_CharacterAroundCircle extends Application {

	@Override
	public void start(Stage pStage) {
		// TODO Auto-generated method stub
		String str = new String("Welcome to java!");
		str = str.toUpperCase();
		
		Pane p = getPane(str);
		Scene scene = new Scene(p);
		
		pStage.setScene(scene);
		pStage.setTitle("chracters around");
		pStage.show();
		
	}
	
	private Pane getPane(String str) {
		Pane p = new Pane();
		p.setPadding(new Insets(20));
		double r = 50;
		int len = str.length();
		double deg = 360 / len;
		
		for(int i = 0; i < len; i++) {
//			DoubleProperty xx = p.widthProperty().divide(2);
			double x = r*1.5 + Math.cos(Math.toRadians(deg*i)) * r;
			double y = r *1.5+ Math.sin(Math.toRadians(deg*i)) * r;
		
			Text t = new Text(x, y, str.substring(i, i+1));
//			t.xProperty().bind(xx.add(Math.cos(Math.toRadians(deg*i))));
			t.xProperty().bind(
					p.widthProperty().divide(2).add(Math.cos(Math.toRadians(deg*i)) * r)
					);
			t.yProperty().bind(
					p.heightProperty().divide(2).add(Math.sin(Math.toRadians(deg*i)) * r)
					);
			
			t.setRotate(i*deg+90);
			p.getChildren().add(t);
		}
				
		return p;
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}


}
