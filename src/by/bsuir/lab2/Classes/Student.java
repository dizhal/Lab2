package by.bsuir.lab2.Classes;

import by.bsuir.lab2.Control.ActionButton;
import by.bsuir.lab2.Elements.Constancts;
import javafx.scene.layout.BorderPane;
import java.util.ArrayList;

public class Student {
	private String nameStudent;
	private StringBuffer condition;
	private Teapot teapot;
	private ArrayList<Sugar> listSugar;
	private ArrayList<Coffee> listCoffee;
	private Constancts con;
	
	public Student(StringBuffer name) {
		nameStudent=new String(name);
		condition=new StringBuffer(con.YES);
		teapot=new Teapot();
		listSugar=new ArrayList<Sugar>();
		listCoffee=new  ArrayList<Coffee>();
	}

	
	public void makeCoffee(BorderPane root,ActionButton ab) {
		ab.btnMakeCoffee(root);
		
		Sugar sugar=new Sugar();
        listSugar.add(sugar);
    	sugar.spreadOn(root,ab);
		ab.btnSelect1(root,this,sugar);	
	    sugar.next(root,ab);
	    
	    Coffee coffee=new Coffee();
	    listCoffee.add(coffee);
		coffee.select(root,ab);
		coffee.spreadOn(root,ab);
		ab.btnSelect2(root,this,coffee.getCoffee());	
		coffee.next(root,ab);
		
		teapot.toFillWater(root,ab);
		teapot.hateUp(root,ab);
		teapot.toPour(root,ab);
	}
	
	public void setCondition(StringBuffer temp) {
		condition.delete(0,2);
		condition.append(temp);
	}
	 
	public StringBuffer getCondition() {
		return condition;
	}
}


