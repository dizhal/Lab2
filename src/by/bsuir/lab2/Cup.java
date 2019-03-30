package by.bsuir.lab2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Cup extends Object_{
	private double volume;
	private String contect;
	private static final String TO_FILL="Наполнить";
	private static final String QUESTION_COFFEE="Какое кофе вы хотите?";
	private static final String QUESTION_WATER="Введите объём воды";
	private static final String QUESTION_TEMPERATURE="Введите температуру воды";
	private static final String END="Кофе готово!!!";
	private Label question1_lb;
	private Label question2_lb;
	private Label content_lb;
	private Label volume_lb;
	private Label end_lb;
	private Button to_fill;
	private Coffee coffee;
	
	public Cup() {
		volume=0;
		contect="";
		to_fill=new Button(TO_FILL);
		content_lb=new Label();
		volume_lb=new Label();
		question1_lb=new Label();
		question2_lb=new Label();
		end_lb=new Label(END);
		coffee=new Coffee();
	}	
	
	public void toFill2(GridPane root) {
		to_fill.setOnAction(new EventHandler<ActionEvent>() {				
    	    public void handle(ActionEvent event) {
    	    	root.getChildren().clear();
    	    	question1_lb.setText(QUESTION_WATER);
    	    	GridPane.setMargin(question1_lb, new Insets(10));
    	    	root.add(question1_lb, 0, 0);
    	    	question2_lb.setText(QUESTION_TEMPERATURE);
    	    	GridPane.setMargin(question2_lb, new Insets(10));
    	    	root.add(question2_lb, 0, 1);
//    	    	Teapot teapot=new Teapot();
//    	    	GridPane.setMargin(teapot.getToFillBtn(), new Insets(10));
//    	    	root.add(teapot.getEnterWater(), 1, 0);
//    	    	root.add(teapot.getEnterTemperature(), 1, 1);
//    	    	root.add(teapot.getToFillBtn(), 0, 2);  
    	    	nexTeapot(root);
    	    	//teapot.toFillWater(root);
    		}		
    	});
	}
	
	public void toFill1(GridPane root) {
		to_fill.setOnAction(new EventHandler<ActionEvent>() {				
    	    public void handle(ActionEvent event) {
    	    	root.getChildren().clear();
    	    	question1_lb.setText(QUESTION_COFFEE);
    	    	GridPane.setMargin(question1_lb, new Insets(10));
    	    	root.add(question1_lb, 0, 0);
//    	    	root.add(coffee.getCappuccinoBtn(), 1, 0);
//    	    	root.add(coffee.getAmericanoBtn(), 1, 1);
//    	    	root.add(coffee.getLatteBtn(), 1, 2);
//    	    	root.add(coffee.getSelectBtn(), 1, 3); 
    	    	nextCoffee(root);
    	    	//coffee.select(root);
    		}		
    	});
	}
	
	public void toFill3(GridPane root) {
		to_fill.setOnAction(new EventHandler<ActionEvent>() {				
    	    public void handle(ActionEvent event) {
    	    	root.add(end_lb, 1, 2); 
    		}		
    	});
	}
	
	public Label getContectLabel() {
		return content_lb;
	}
	
	
	public Label getVolumeLabel() {
		return volume_lb;
	}
	
	public Button getButton() {
	    return to_fill;
	}
	
	public void setVolume(double volume_) {
		volume=volume_;
	}
	
	public void setContent(String contect_) {
		contect=contect_;
	}
	

}
