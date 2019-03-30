package by.bsuir.lab2;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.geometry.HPos;

public class MyGridPane {
	private Scene scene;
	private GridPane root;
	private Student stud;
	
	public MyGridPane() {

    	root = new GridPane();    		
    	scene = new Scene(root, 400, 150);
    	stud = new Student();
	}
	
	public void workGridPane() {
		
		GridPane.setMargin(stud.getLabel(), new Insets(25));
		root.getColumnConstraints().add(new ColumnConstraints(200));
		root.getColumnConstraints().add(new ColumnConstraints(150));
		root.getRowConstraints().add(new RowConstraints(35));
    	root.getRowConstraints().add(new RowConstraints(35));
    	root.getRowConstraints().add(new RowConstraints(35));
    	root.getRowConstraints().add(new RowConstraints(35));
    	root.setHalignment(stud.getLabel(),HPos.RIGHT);
    	root.add(stud.getLabel(), 0, 0);
		root.add(stud.getTextField(), 1, 0);
		root.add(stud.getButton1(), 1, 1);

		stud.enterName(root);				
		stud.makeCoffee(root);
	}
	
	public Scene getScene() {
		return scene;
	}	

}
