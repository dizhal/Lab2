package by.bsuir.lab2.Classes;

import javafx.scene.control.TextField;
import by.bsuir.lab2.Control.ActionButton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;

public class Student {
	private ActionButton ab;
	private String nameStudent;
	private Thing object;
	private Sugar sugar;
	private Coffee coffee;
	private Teapot teapot;
	
	public Student() {
		ab=new ActionButton();
		nameStudent=" ";
		sugar=new Sugar();
		coffee=new Coffee();
		teapot=new Teapot();
	}

	
	public void makeCoffee(BorderPane root) {
		
		nameStudent=ab.btnEnter(root);
		ab.btnMakeCoffee(root);
		sugar.spreadOn(root,ab);
		coffee.select(root,ab);
		coffee.spreadOn(root,ab);
		teapot.toFillWater(root,ab);
	}
}


