
/**
 * This program is a hello world for JavaFX
 * Author: SMondesire@stu.edu
 * Date: 11/29/2019
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Create an FX window to display Hello, Bobcats!
 * 
 * @author SMondesire@stu.edu
 *
 */
public class HelloFX extends Application {
	// Create the stage (canvas)
	public void start(Stage stage) {

		// Create a label that displays our message
		Label l = new Label("Hello, Bobcats!");

		// Add the label to the scene at 300,200 location
		Scene scene = new Scene(new StackPane(l), 300, 200);
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * Launch the GUI Window
	 * @param args String array of arguments. None used.
	 */
	public static void main(String[] args) {
		launch();
	}

}