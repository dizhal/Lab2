package by.bsuir.lab2;

import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;

public class Coffee extends Object_{
	private String coffee;
	private static final String CAPPUCCINO="Капучино";
	private static final String AMERICANO="Американо";
	private static final String LATTE="Латте";
	private static final String SELECT="Выбрать";
	private static final String SPREAD_ON="Насыпать";
	private static final String QUESTION_WEIGHT_COFFEE="Введите массу кофе в граммах";
	private static final String COFFEE="кофе";
	private static final double DENCITY=0.56;
	private RadioButton cappuccino_btn;
	private RadioButton americano_btn;
	private RadioButton latte_btn;
	private Button select_btn;
	private ToggleGroup group;
	private Button spread_on_btn;
	private Label question_lb;
	private TextField weight_coffee_tf;
	
	public Coffee() {
		cappuccino_btn=new RadioButton(CAPPUCCINO);
		americano_btn=new RadioButton(AMERICANO);
		latte_btn=new RadioButton(LATTE);
		select_btn=new Button(SELECT);
		spread_on_btn=new Button(SPREAD_ON);
		group=new ToggleGroup();
		cappuccino_btn.setToggleGroup(group);
		americano_btn.setToggleGroup(group);
		latte_btn.setToggleGroup(group);
		question_lb=new Label(QUESTION_WEIGHT_COFFEE);
		weight_coffee_tf=new TextField();
	}
	
	public void select(GridPane root) {	
		select_btn.setOnAction(new EventHandler<ActionEvent>() {			
    	    public void handle(ActionEvent event) {
    	    	RadioButton selection=(RadioButton) group.getSelectedToggle();
    	    	coffee=selection.getText();
    	    	root.getChildren().clear();
    	    	GridPane.setMargin(question_lb, new Insets(10));
    	    	root.add(question_lb, 0, 0);
    	    	root.add(weight_coffee_tf, 1, 0);
    	    	root.add(spread_on_btn, 1, 1);
    	    	spreadOn(root);
    		}		
    	});	
	}
	
	public void spreadOn(GridPane root) {
		spread_on_btn.setOnAction(new EventHandler<ActionEvent>() {	
    	    public void handle(ActionEvent event) {
    	    	weight=Integer.parseInt(weight_coffee_tf.getText());
    	    	double temp=weight*DENCITY;
    	    	Cup cup=new Cup();
    	    	cup.getVolumeLabel().setText("Объём - " +  temp + "мл");
    	    	cup.setVolume(temp);
    	    	cup.getContectLabel().setText("Содержимое - " + COFFEE + ' ' + coffee);
    	    	cup.setContent(COFFEE);
    	    	root.getChildren().clear();
    	    	GridPane.setMargin(cup.getContectLabel(), new Insets(10));
    	    	GridPane.setMargin(cup.getVolumeLabel(), new Insets(10));
    	    	GridPane.setMargin(cup.getButton(), new Insets(10));
    	    	root.add(cup.getContectLabel(), 0, 0); 
    	    	root.add(cup.getVolumeLabel(), 0, 1); 
    	    	root.add(cup.getButton(), 0, 2);
    	    	cup.toFill2(root);
    		}		
    	});		
	}

	public RadioButton getCappuccinoBtn() {
	    return cappuccino_btn;
	}
	
	public RadioButton getAmericanoBtn() {
	    return americano_btn;
	}
	
	public RadioButton getLatteBtn() {
	    return latte_btn;
	}
	
	public Button getSelectBtn() {
	    return select_btn;
	}

}
