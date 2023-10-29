package lab04;

import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class _04_FiveTexts extends Application {
	
	Random rand = new Random();
	
	@Override
	public void start(Stage pStage) {
		FlowPane p = new FlowPane();
		p.setPadding(new Insets(20));
		
		for(int i = 0; i < 5; i++)
			p.getChildren().add(getLabel());
				
		Scene scene = new Scene(p, 300, 100);
		pStage.setScene(scene);
		pStage.setTitle("FiveTexts");
		pStage.show();
		
	}
	
	
	private Label getLabel() {
		Label lbl = new Label("Hello");
		double r = rand.nextDouble();
		double g = rand.nextDouble();
		double b = rand.nextDouble();
		
		lbl.setTextFill( Color.color(r, g, b));
		lbl.setFont(Font.font("Times New Roman",
				FontWeight.BOLD, FontPosture.ITALIC, 20));
		lbl.setRotate(90);
		return lbl;
		
	}
	public static void main(String[] args) {
		Application.launch(args);
	}

}
