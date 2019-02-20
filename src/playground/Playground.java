/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playground;


import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Michael
 */
public class Playground extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        VBox root = new VBox(5);
        root.setSpacing(20);
        
        //Texts
        //Text p = new Text("LinkedIn");
        //Text r = new Text("Reflexion");
        //Text d = new Text("Drop Shadow");
        
        root.getChildren().addAll(p,r,d);
        
        
        
        Scene scene = new Scene(root, 300, 250);

        
   
        // What to show
        stage.setTitle("Text Effects");
        //stage.setScene(scene); // Shows the scene with the blended objects
        stage.setScene(scene);
        stage.show();
    }
    
    static Node dropShadow() {
        Text t = new Text();
        t.setCache(true);
        t.setFill(Color.FIREBRICK);
        t.setText("Dropshadow Effect");
        t.setFont(Font.font("null", FontWeight.BOLD, 32));
        DropShadow ds = new Dropshadow();
        ds.setOffsetX(3.0);
        ds.setOffsetY(3.0);
        ds.setColor(Color.GRAY);
        t.setEffect(ds);
        
        return t;
        
    }
    
    /**
     *
     */

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
