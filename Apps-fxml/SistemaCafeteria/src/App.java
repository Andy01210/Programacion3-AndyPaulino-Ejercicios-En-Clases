
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;



public class App extends Application{

    @Override
    public void start(Stage primaryStage){

        try {
            Parent root = FXMLLoader.load(getClass().getResource("ViewCafeteria.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.setTitle("Sistema de cafeteria");
            primaryStage.show();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
    }
    public static void main(String[] args) throws Exception {
        launch();
    }
}
