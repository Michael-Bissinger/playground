/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playground;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import static javafx.scene.text.FontWeight.BLACK;
import javafx.stage.Stage;

/**
 *
 * @author Michael
 */
public class Playground extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Group root = new Group();
        
        Line seesaw = new Line(60,340,340,140); 
        seesaw.setStroke(Color.BLACK);
        seesaw.setStrokeWidth(15);
        
        Circle cir = new Circle(70,280,40);
        cir.setStroke(Color.RED);
        cir.setFill(Color.ORANGE);
        
        Rectangle rec = new Rectangle(240,90,80,70);
        rec.setStroke(Color.GREEN);
        rec.setStrokeWidth(5);
        rec.setFill(Color.YELLOWGREEN);
        
        
        Scene scene = new Scene(root, 400, 400);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
