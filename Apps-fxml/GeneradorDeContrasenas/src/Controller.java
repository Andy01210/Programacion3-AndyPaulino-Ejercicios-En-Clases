
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.event.*;
import javafx.fxml.FXML;
import java.util.*;


public class Controller {

    Random rdm = new Random();

    @FXML
    private TextField txtCantidad;

    @FXML
    private CheckBox ckNumeros;

    @FXML
    private CheckBox ckMayusculas;

    @FXML
    private CheckBox ckSimbolos;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnGuardar;

    @FXML
    private Label lblGenerada;

    @FXML
    private Label lblMensaje;

    @FXML
    public void AccionCalcular(ActionEvent event){
        generar();
    }

    @FXML
    public void MouseEntrar(MouseEvent event){
        lblMensaje.setText("Presione para generar");
    }
    @FXML
    public void MouseSalir(MouseEvent event){
        lblMensaje.setText("Esperando Informacion");
    }
    
    @FXML
    public void EnterCalcular(KeyEvent event){
        if(event.getCode()== KeyCode.ENTER){
            generar();
        }
    }

    @FXML
    public void AccionLimpiar(){
        txtCantidad.clear();
        lblGenerada.setText("");
        ckNumeros.setSelected(false);
        ckMayusculas.setSelected(false);
        ckSimbolos.setSelected(false);
        lblMensaje.setText("Programa limpiado Correctamente");
    }

    public void generar(){


        try {

            if(txtCantidad.getText().isEmpty()){
            lblGenerada.setText("Error. Debe ingresar la longitud de su password");
            return;
        }
            int longitud = Integer.parseInt(txtCantidad.getText());
            
            if(longitud <= 6){
                lblGenerada.setText("Error. el numero de caracteres es menor que 6");
                return;
            }

            String Caracteres = "abcdefghaijklmnopqrstuvwxyz";

            if(ckNumeros.isSelected()){
                Caracteres += "0123456789";
            }
             if(ckMayusculas.isSelected()){
                Caracteres += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            }

             if(ckSimbolos.isSelected()){
                Caracteres += "!@#$%&*?";
            }

            String Password = "";

            for(int i = 0; i < longitud; i ++){

                Password += Caracteres.charAt(rdm.nextInt(Caracteres.length()));
            }

            lblGenerada.setText("Proceso Finalizado. Su contrasena es: "+ Password);


            
        } catch (Exception e) {
        }
        



    }
    
    
    
    
    
    
}
