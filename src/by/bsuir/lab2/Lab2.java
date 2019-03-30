package by.bsuir.lab2;


import javafx.application.Application;
import javafx.stage.Stage;

public class Lab2 extends Application {
	
	private MyGridPane grid;
	private static final String NAME_TITLE = "Lab2";
	

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) {
        grid=new MyGridPane();
    	
        grid.workGridPane();
    	
    	primaryStage.setScene(grid.getScene());	
        primaryStage.setTitle(NAME_TITLE);        
        primaryStage.show();		
	}

}