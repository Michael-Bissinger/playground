/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playground;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.BlendMode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Michael
 */
public class Playground extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        StackPane root = new StackPane();
        root.getChildren().add(blendModeObjects());
        
        Scene scene = new Scene(root, 300, 250);
        
        // Show everything
        stage.setTitle("Blended Shapes");
        stage.setScene(scene);
        stage.show();
    }
    
    static Node blendModeObjects() {
        Group g = new Group();
        
        Circle c = new Circle(50,50,25);
        c.setFill(Color.DARKCYAN);
        c.setBlendMode(BlendMode.MULTIPLY);
        
        Rectangle r = new Rectangle(50,50,50,50);
        r.setFill(Color.BLUEVIOLET);
        
        g.getChildren().addAll(r,c);
        return g;
                
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
