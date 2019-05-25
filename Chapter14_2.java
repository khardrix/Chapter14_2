/*********************************************************************************************************************
 *********************************************************************************************************************
 *****                                          Chapter 14: Problem 2                                            *****
 *****___________________________________________________________________________________________________________*****
 *****                       2. Using 4 lines, draw an asterisk in the middle of the pane.                       *****
 *********************************************************************************************************************
 *********************************************************************************************************************/

// IMPORTS of needed tools and plug-ins
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;

public class Chapter14_2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){

        Pane pane = new Pane();

        Line l1, l2, l3, l4;

        l1 = new Line(0,0,500,500);
        l2 = new Line(0,500,500,0);
        l3 = new Line(0,250,500,250);
        l4 = new Line(250,0,250,500);

        pane.getChildren().addAll(l1, l2, l3, l4);
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Chapter 14, Problem 2: Draw an Asterisk with Four Lines");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
