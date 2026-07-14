
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.StackPane;
import javafx.fxml.FXMLLoader;


public class App extends Application{

    @Override
    public void start(Stage primaryStage){
        try {

        Parent root = FXMLLoader.load(getClass().getResource("ViewEscena1.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Klk");
        primaryStage.show();
            
        } catch (Exception e) {
        }
       

    }
    public static void main(String[] args) throws Exception {
        launch();
    }
}
