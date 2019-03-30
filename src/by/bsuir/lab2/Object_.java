package by.bsuir.lab2;

import javafx.scene.layout.GridPane;

public class Object_ {
	
	protected Integer weight;
	protected Student student;
	
	public Object_() {
		weight=0;
	}
	
	public void nextCoffee(GridPane root) {
		student=new Student();
		student.nextCoffee(root);
	}
	
	public void nexTeapot(GridPane root) {
		student=new Student();
		student.nextTeapot(root);
	}
	


}

