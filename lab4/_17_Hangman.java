package lab04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class _17_Hangman extends Application {

	@Override
	public void start(Stage pStage) {
		
		double arcX = 50;
		double arcY = 20;
		double pad = 20;
		double h = 200;
		double w = 100;
		double ropeLen = 10;
		double headR = 20;
		double bodyH = 80;
		double limbxy = 40;
		
		Pane p = new Pane();
		
		// TODO Auto-generated method stub
		Arc base = new Arc(pad + arcX, pad+h+arcY, arcX, arcY, 0, 180);
		base.setFill(null);
		base.setType(ArcType.OPEN);
		base.setStroke(Color.BLACK);
		p.getChildren().add(base);
		
		Line pillar = new Line(pad+arcX, pad+h, pad+arcX, pad);
		p.getChildren().add(pillar);
		
		Line hundluwch = new Line(pad+arcX, pad, pad+arcX+w, pad);
		p.getChildren().add(hundluwch);
		
		Line rope = new Line(pad+arcX+w, pad, pad+arcX+w, pad+ropeLen);
		p.getChildren().add(rope);
		
		Line lhand = new Line(pad+arcX+w, pad+ropeLen+headR, pad+arcX+w+limbxy+headR/2, pad+ropeLen+headR+limbxy+headR/2);
		p.getChildren().add(lhand);
		
		Line rhand = new Line(pad+arcX+w, pad+ropeLen+headR, pad+arcX+w-limbxy-headR/2, pad+ropeLen+headR+limbxy+headR/2);
		p.getChildren().add(rhand);
		
		Circle head = new Circle(pad + arcX + w, pad + ropeLen+headR, headR);
		head.setStroke(Color.BLACK);
		head.setFill(Color.WHITE);
		p.getChildren().add(head);
		
		Line body = new Line(pad+arcX+w, pad+ropeLen+2*headR, pad+arcX+w, pad+ropeLen+2*headR+bodyH);
		p.getChildren().add(body);
		
		Line lleg = new Line(pad+arcX+w, pad+ropeLen+2*headR+bodyH, pad+arcX+w+limbxy, pad+ropeLen+2*headR+bodyH+limbxy);
		p.getChildren().add(lleg);
		
		Line rleg = new Line(pad+arcX+w, pad+ropeLen+2*headR+bodyH, pad+arcX+w-limbxy, pad+ropeLen+2*headR+bodyH+limbxy);
		p.getChildren().add(rleg);
		
		Scene scene = new Scene(p, pad*2 + w + limbxy + arcX, pad*2 + h + arcY);
		pStage.setScene(scene);
		pStage.setTitle("Hangman");
		pStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}


}
