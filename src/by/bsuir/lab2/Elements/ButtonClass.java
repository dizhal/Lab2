package by.bsuir.lab2.Elements;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class ButtonClass extends Constancts{
	public Button makeCoffee;
	public Button next;
	
	public Button select;
	public Button spreadOnSugar;
	public Button spreadOnCoffee;
	
	public Button toFillSugar;
	public Button toFillCoffee;
	public Button toFillWater1;
	public Button toFillWater2;
	
	public RadioButton cappuccino;
	public RadioButton americano;
	public RadioButton latte;
	public ToggleGroup group;
	
	public Button toPour;
	public Button hateUp;
	
	public ButtonClass() {
		makeCoffee= new Button(MAKE_COFFEE);
		next = new Button(FURTHET);
		toFillSugar=new Button(TO_FILL);
		toFillCoffee=new Button(TO_FILL);
		toFillWater1=new Button(TO_FILL_WITH_WATER);
		toFillWater2=new Button(TO_FILL);
		cappuccino=new RadioButton(CAPPUCCINO);
		americano=new RadioButton(AMERICANO);
		latte=new RadioButton(LATTE);
		group=new ToggleGroup();
		cappuccino.setToggleGroup(group);
		americano.setToggleGroup(group);
		latte.setToggleGroup(group);
		select=new Button(SELECT);
		spreadOnSugar=new Button(SPREAD_ON);
		spreadOnCoffee=new Button(SPREAD_ON);
		toPour=new Button(TO_POUR);
		hateUp=new Button(HEAT_UP);
	}
	
}
