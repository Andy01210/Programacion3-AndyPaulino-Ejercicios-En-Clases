import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;


public class Main extends Application {

    @Override
public void start(Stage primaryStage)throws Exception{
try {
    Parent root = FXMLLoader.load(getClass().getResource("ViewConversroMoneda.fxml"));
     Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Conversor de monedas");
    primaryStage.show();

    
  
    
} catch (Exception e) {
}
     
}
    public static void main(String[] args) throws Exception {
        launch();
    }
}
