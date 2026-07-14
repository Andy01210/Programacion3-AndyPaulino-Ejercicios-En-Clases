import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.stage.*;


public class ControllerPgPrincipal {

    @FXML
    private Menu MbCitas;

    

    @FXML
    public void AbrirRegistro(){
        ControllerPgRegistro controller = NavigationUtils.AbrirVEntana("ViewPgRegistro.fxml", "Registrar Cita");
    }

    @FXML
    public void AbrirConsultas(){
        ControllerPgConsultar controller = NavigationUtils.AbrirVEntana("ViewPgConsulta.fxml", "Consultar cita");
    }

    
}
