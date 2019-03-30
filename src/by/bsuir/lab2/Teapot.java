package by.bsuir.lab2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Teapot extends Object_{
	private Integer volume;
	private Integer temperature;
	private static final String TO_POUR="Налить";
	private static final String TO_FILL_WITH_WATER="Наполнить водой";
	private static final String HEAT_UP="Нагреть";
	private static final String WATER="вода";
	private Button to_pour_btn;
	private Button to_fill_btn;
	private Button hate_up_btn;
	private TextField enter_water_tf;
	private TextField enter_temperature_tf;
	
	public Teapot() {
		volume=0;
		temperature=0;
		to_pour_btn=new Button(TO_POUR);
		to_fill_btn=new Button(TO_FILL_WITH_WATER);
		hate_up_btn=new Button(HEAT_UP);
		enter_water_tf=new TextField();
		enter_temperature_tf=new TextField();
	}

	public void toFillWater(GridPane root) {
		to_fill_btn.setOnAction(new EventHandler<ActionEvent>() {				
    	    public void handle(ActionEvent event) {
    	    	volume=Integer.parseInt(enter_water_tf.getText());
    	    	temperature=Integer.parseInt(enter_temperature_tf.getText());
    	    	root.add(hate_up_btn, 1, 2);
    	    	hateUp(root);
    		}		
    	});
	}
	
	public void hateUp(GridPane root) {
		hate_up_btn.setOnAction(new EventHandler<ActionEvent>() {				
    	    public void handle(ActionEvent event) {
    	    	GridPane.setMargin(to_pour_btn, new Insets(10));
    	    	root.add(to_pour_btn, 0, 3); 
    	    	toPour(root);
    		}		
    	});
	}
	
	public void toPour(GridPane root) {
		to_pour_btn.setOnAction(new EventHandler<ActionEvent>() {				
    	    public void handle(ActionEvent event) {
    	    	Cup cup=new Cup();
    	    	cup.setContent(WATER);
    	    	cup.setVolume(volume);
    	    	cup.getVolumeLabel().setText("Объём - " +  volume + "мл");
    	    	cup.getContectLabel().setText("Содержимое - " + WATER);
    	    	root.getChildren().clear();
    	    	GridPane.setMargin(cup.getContectLabel(), new Insets(10));
    	    	GridPane.setMargin(cup.getVolumeLabel(), new Insets(10));
    	    	GridPane.setMargin(cup.getButton(), new Insets(10));
    	    	root.add(cup.getContectLabel(), 0, 0); 
    	    	root.add(cup.getVolumeLabel(), 0, 1); 
    	    	root.add(cup.getButton(), 0, 2);
    	    	cup.toFill3(root);
    		}		
    	});
	}
	
	public TextField getEnterWater() {
		return enter_water_tf;
	}
	
	public TextField getEnterTemperature() {
		return enter_temperature_tf;
	}
	
	public Button getToFillBtn() {
		return to_fill_btn;
	}
}
