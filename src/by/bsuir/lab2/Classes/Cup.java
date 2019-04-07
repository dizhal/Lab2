package by.bsuir.lab2.Classes;

import by.bsuir.lab2.Control.ActionButton;
import by.bsuir.lab2.Elements.Constancts;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;

public class Cup extends Thing{
	private double volume;
	private String content;
	private Constancts con;
	
	public Cup() {
		con=new Constancts();
		volume=0;
		content="";
	}	
	
	
	public void toFill(BorderPane root, ActionButton ab, String contentTemp) {
		
		if(contentTemp==con.SUGAR) {
			content=contentTemp;
			ab.btnToFillSugar(root);
		}
		else if(contentTemp==con.COFFEE){
			content=contentTemp;
			ab.btnToFillCoffee(root);
		}
		else if(contentTemp==con.WATER) {
			content=contentTemp;
			ab.btnToFillWater2(root);
		}
		
	}
	
	public void setVolume(double temp) {
		volume=temp;
	}

}
