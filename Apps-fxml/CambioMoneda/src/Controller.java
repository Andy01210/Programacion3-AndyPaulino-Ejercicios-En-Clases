
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.*;

public class Controller {

    @FXML
    private TextField txtMonto;

    @FXML
    private ComboBox cbMoneda;

    @FXML
    private Button btnConvertir;


    @FXML
    private Button btnLimpiar;

    @FXML
    private Label lblResultado;


    @FXML
    private Label lblMensaje;


    @FXML
    private void initialize(){
        cbMoneda.getItems().addAll("Dollar", "Euro");
        lblMensaje.setText("Esperando Informacion");
    }

    
    private void ejecutarConversion(){
        if(txtMonto.getText().isEmpty()){
            lblMensaje.setText("Error, aun no ha ingresado una cantidad para convertir");
        }

        if(cbMoneda.getValue() == null){
            lblMensaje.setText("Error, no ha elejido el tipo de moneda");
        }

        try {
            double monto = Double.parseDouble(txtMonto.getText());
            if(monto < 0){
                lblResultado.setText("Error. el monto debe ser mayor que 0");
            }

            double resultado = 0;
        if(cbMoneda.getValue().equals("Euro")){
            resultado = monto / 64.00;
            lblResultado.setText("El resultado de la conversion es: "+ resultado+ "EUR");
        }else{
            resultado = monto / 59.00;
            lblResultado.setText("El resultado de la conversion es: "+ resultado+ "USD");
        }
        } catch (Exception e){
        }
        
    }

    @FXML
    public void EnterConvertir(KeyEvent event){
        if (event.getCode() == KeyCode.ENTER) {
            ejecutarConversion();
        }
    }

    @FXML
    private void MouseActionEntrar(MouseEvent event){
        lblMensaje.setText("Presione para convertir");
    }

     @FXML
    private void MouseActionSalir(MouseEvent event){
        lblMensaje.setText("Esperando informacion");
    }

    @FXML
    private void BontonConvertir(ActionEvent event){
        ejecutarConversion();
    }

    @FXML
    private void BotonLimpiar(ActionEvent event){
        txtMonto.clear();
        lblMensaje.setText("Esperando informacion");
        lblResultado.setText("");
        cbMoneda.setValue(null);

    }
    }

    
    

