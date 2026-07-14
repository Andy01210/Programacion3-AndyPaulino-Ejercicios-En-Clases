import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;


public class NavigationUtils {

    public static<T> T AbrirVEntana(String Ruta, String Titulo){

        try {
             FXMLLoader Loader = new FXMLLoader(NavigationUtils.class.getResource(Ruta));
             Scene scene = new Scene(Loader.load());
             Stage stage = new Stage();
             stage.setScene(scene);
             stage.setTitle(Titulo);
             stage.show();
             return Loader.getController();
            
        } catch (Exception e) {
            e.getStackTrace();
            return null;
        }

    
}
}

