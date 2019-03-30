package by.bsuir.lab2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Sugar extends Object_ {
	private static final String NAME_BUTTON="Насыпать";
	private static final String SUGAR="сахар";
	private static final double DENCITY=0.72;
	private TextField weight_sugar_tf;
	private Button spread_on_btn;
	private Cup cup;
		
	public Sugar() {
		weight_sugar_tf=new TextField();
		spread_on_btn=new Button(NAME_BUTTON);
		cup=new Cup();
	}
	
	public void spreadOn(GridPane root) {
		spread_on_btn.setOnAction(new EventHandler<ActionEvent>() {		
    	    public void handle(ActionEvent event) {
    	    	weight=Integer.parseInt(weight_sugar_tf.getText());
    	    	double temp=weight*DENCITY;
    	    	cup.getVolumeLabel().setText("Объём - " +  temp + "мл");
    	    	cup.setVolume(temp);
    	    	cup.getContectLabel().setText("Содержимое - " + SUGAR);
    	    	cup.setContent(SUGAR);
    	    	root.getChildren().clear();
    	    	GridPane.setMargin(cup.getContectLabel(), new Insets(10));
    	    	GridPane.setMargin(cup.getVolumeLabel(), new Insets(10));
    	    	GridPane.setMargin(cup.getButton(), new Insets(10));
    	    	root.add(cup.getContectLabel(), 0, 0); 
    	    	root.add(cup.getVolumeLabel(), 0, 1); 
    	    	root.add(cup.getButton(), 0, 2);
    	    	cup.toFill1(root);
    		}		
    	});
	}

    public TextField getNameTextField() {
		return weight_sugar_tf;
	}
    
    public Button getButton() {
    	return spread_on_btn;
    }
}
