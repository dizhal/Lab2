package by.bsuir.lab2.Elements;

import javafx.scene.control.Label;

public class LabelClass extends Constancts {
	public Label nameStudent;
	
	public Label sugarRequest;
	
	public Label questionCoffee;
	public Label waterRequest;
	public Label temperatureRequest;
	public Label content;
	public Label volume;
	public Label end;
	
	public Label coffeeRequest;
	
	public LabelClass() {
		nameStudent=new Label(QUESTION_NAME);
		sugarRequest=new Label(REQUEST_FOR_SUGAR_WEIGHT);
		content=new Label(CONTENT);
		volume=new Label(VOLUME);
		questionCoffee=new Label(QUESTION_COFFEE);
		waterRequest=new Label(REQUEST_FOR_WATER);
		temperatureRequest=new Label(REQUEST_FOR_TEMPERATURE);
		end=new Label(END);
		coffeeRequest=new Label(REQUEST_FOR_COFFEE_WEIGHT);
		
	}
}
