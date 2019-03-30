package by.bsuir.lab2;

import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Student {
	private String name_string;
	private static final String QUESTION_NAME="Как тебя зовут?";
	private static final String FURTHET_BTN="Далее";
	private static final String MAKE_COFFEE_BTN="Сделать кофе";
	private static final String QUESTION_WEIGHT_SUGAR="Введите массу сахара в граммах";
	private TextField textfield;
	private Label label;
	private Label question_sugar_lb;
	private Button make_coffee_btn;
	private Button next_btn;
	private Object_ object;
	private Sugar sugar;
	private Coffee coffee;
	private Teapot teapot;
	
	public Student() {
		name_string=" ";
		textfield=new TextField();
		label=new Label(QUESTION_NAME);
		question_sugar_lb=new Label(QUESTION_WEIGHT_SUGAR);
		make_coffee_btn = new Button(MAKE_COFFEE_BTN);
		next_btn = new Button(FURTHET_BTN);
		sugar=new Sugar();
		coffee=new Coffee();
		teapot=new Teapot();
	}

	public void enterName(GridPane root){
		next_btn.setOnAction(new EventHandler<ActionEvent>() {
    	    public void handle(ActionEvent event) {
    	    	name_string=textfield.getText(); 
    	    	label.setText("Привет, " + name_string + "!!!");
    	    	root.getChildren().clear();
    	    	GridPane.setMargin(label, new Insets(10));
    	    	GridPane.setMargin(make_coffee_btn, new Insets(10));
    	    	root.setHalignment(make_coffee_btn,HPos.RIGHT);
    	    	root.add(label, 0, 0);   	    	
    	    	root.add(make_coffee_btn, 0, 1);
    		}		
    	});
	}
	
	public void makeCoffee(GridPane root) {
		make_coffee_btn.setOnAction(new EventHandler<ActionEvent>() {			
    	    public void handle(ActionEvent event) {
    	    	root.getChildren().clear();
    	    	GridPane.setMargin(question_sugar_lb, new Insets(10));
    	    	root.add(question_sugar_lb, 0, 0); 
    	    	root.add(sugar.getNameTextField(), 1, 0); 
    	    	root.add(sugar.getButton(), 1, 1);
    	    	sugar.spreadOn(root);
    		}		
    	});
	}
	
	public Label getLabel() {
		return label;
	}
	
    public TextField getTextField() {
		return textfield;
	}
    
    public Button getButton1() {
    	return next_btn;
    }
    
    public Button getButton2() {
    	return make_coffee_btn;
    }
    

	public void nextCoffee(GridPane root) {
		coffee.select(root);
		root.add(coffee.getCappuccinoBtn(), 1, 0);
    	root.add(coffee.getAmericanoBtn(), 1, 1);
    	root.add(coffee.getLatteBtn(), 1, 2);
    	root.add(coffee.getSelectBtn(), 1, 3); 
	}
	
	public void nextTeapot(GridPane root) {
		teapot.toFillWater(root);
		GridPane.setMargin(teapot.getToFillBtn(), new Insets(10));
    	root.add(teapot.getEnterWater(), 1, 0);
    	root.add(teapot.getEnterTemperature(), 1, 1);
    	root.add(teapot.getToFillBtn(), 0, 2); 
	}

}


