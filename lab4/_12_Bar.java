package lab04;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class _12_Bar extends Application {
	private double Rect10Percent = 40;
	private double RectWidth = 80;
	@Override
	public void start(Stage pStage) {
		// TODO Auto-generated method stub
		HBox b = new HBox();
		b.setPadding(new Insets(20));
		b.setSpacing(10);
//		b.setAlignment(Pos.BOTTOM_CENTER);
		b.getChildren().add(getVBox(20, "Project", Color.RED));
		b.getChildren().add(getVBox(10, "Quiz", Color.BLUE));
		b.getChildren().add(getVBox(30, "Midterm", Color.GREEN));
		b.getChildren().add(getVBox(40, "Final", Color.ORANGE));
		
		Scene scene = new Scene(b);
		pStage.setScene(scene);
		pStage.setTitle("Bar Chart");
		pStage.show();
	}
	
	private VBox getVBox(double percentage, String str, Color color) {
		VBox vb = new VBox();
		vb.setAlignment(Pos.BOTTOM_CENTER);
		str += " -- ";
		str += percentage;
		str += "%";
		vb.getChildren().add(new Text(str));
		
		Rectangle r = new Rectangle(0, 0, RectWidth, percentage/10 * Rect10Percent);
		r.setFill(color);
		r.setStroke(color);
		vb.getChildren().add(r);
		
		return vb;
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}


}
