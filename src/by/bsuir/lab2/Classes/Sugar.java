package by.bsuir.lab2.Classes;

import by.bsuir.lab2.Control.ActionButton;
import by.bsuir.lab2.Elements.Constancts;
import javafx.scene.layout.BorderPane;

public class Sugar extends Thing {
	private Constancts con;
	private Cup cup;
		
	public Sugar() {
		super();  
		cup=new Cup();
	}
	
	public void spreadOn(BorderPane root, ActionButton ab) {
		ab.btnSpreadOnSugar(root,this);
		double temp=weight*con.DENCITY_SUGAR;
		cup.setVolume(temp);		
	}
	
	public void next(BorderPane root, ActionButton ab) {
		cup.toFill(root, ab,con.SUGAR);
	}
}
