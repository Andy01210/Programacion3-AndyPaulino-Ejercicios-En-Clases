import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;


public class App extends Application{

    @Override
    public void start(Stage primaryStage){

            try {

                Parent root = FXMLLoader.load(getClass().getResource("ViewGenerador.fxml"));
                Scene scene = new Scene(root);

                primaryStage.setScene(scene);
                primaryStage.setTitle("Generador");
                primaryStage.show();
                
            } catch (Exception e) {
            }

    }
    public static void main(String[] args) throws Exception {
        launch();
    }
}
