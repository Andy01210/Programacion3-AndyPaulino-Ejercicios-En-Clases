import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;;

public class App extends Application{

    @Override
    public void start(Stage primaryStage){

        try {

            Parent root = FXMLLoader.load(getClass().getResource("ViewPgPrincipal.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.setTitle("Registro de citas");
            primaryStage.show();
        
            
        } catch (Exception e) {
            e.printStackTrace();
        }

       

    }
    public static void main(String[] args) throws Exception {
        launch();
    }
}
