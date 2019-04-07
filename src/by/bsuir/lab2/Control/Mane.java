package by.bsuir.lab2.Control;


import by.bsuir.lab2.Classes.Student;
import by.bsuir.lab2.Elements.Constancts;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Mane extends Application {
	
	private Scene scene;
	private BorderPane root;
	private Constancts con;
	private Student stud;
	
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) {
        
        con=new Constancts();
        stud=new Student();
        root=new BorderPane();
        scene = new Scene(root, 400, 150);
        
        stud.makeCoffee(root);
        
        
    	primaryStage.setScene(scene);	
        primaryStage.setTitle(con.NAME_TITLE);        
        primaryStage.show();		
	}

}