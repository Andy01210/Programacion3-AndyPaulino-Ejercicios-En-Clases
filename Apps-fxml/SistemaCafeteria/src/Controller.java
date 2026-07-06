

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.event.*;



public class Controller{

@FXML
private TextField txtCliente;

@FXML
private ComboBox cbBebidas;

@FXML
private TextField txtCantidad;

@FXML
private CheckBox ckPostre;

@FXML
private Button btnCalcular;

@FXML
private Button btnLimpiar;

@FXML
private Label lblResultado;

@FXML
private Label lblMejoras;


@FXML
public void initialize(){
    cbBebidas.getItems().addAll("Café americano | RD$100 |","Cappuccino | RD$150 |","Chocolate caliente | RD$130 |","Jugo natural | RD$120 |");
    lblMejoras.setText("Esperando Informacion");
}



@FXML
public void MouseEntrar(MouseEvent event){
    lblMejoras.setText("Persione para continuar");

}
@FXML
public void MouseSalir(MouseEvent event){
    lblMejoras.setText("Esperando Informacion");
}
@FXML
public void BtnCalcular(ActionEvent event){
    calculo();
}
@FXML
public void EnterCalcular(KeyEvent event){
    if(event.getCode()== KeyCode.ENTER){
        calculo();
    }
}

@FXML
public void LimpriarAccion(ActionEvent event){
    lblMejoras.setText("Limpiado Correctamente");
    lblResultado.setText("");
    cbBebidas.setValue(null);
    txtCantidad.clear();
    txtCliente.clear();
    ckPostre.setSelected(false);
}


public void calculo(){
    try{
    if(txtCliente.getText().isEmpty()){
        lblResultado.setText("Error. El nombre no puede estar vacio");
        return;
    }
    if(cbBebidas.getValue()==null){
        lblResultado.setText("Error. no ha elejido una bebida");
        return;
    }
    int cantidad = Integer.parseInt(txtCantidad.getText());
    if(cantidad < 0){
        lblResultado.setText("Error, la cantidad de bebida no puede ser negativa");
        return;
    }

     if(cantidad == 0){
        lblResultado.setText("Error, la cantidad de bebida no puede ser negativa");
        return;
    }

    int PrecioACobrar;
    int PrecioPostre;

    if(cbBebidas.getValue().equals("Café americano | RD$100 |")){
        PrecioACobrar = 100;

    }else if(cbBebidas.getValue().equals("Cappuccino | RD$150 |")){
         PrecioACobrar = 150;

    }else if(cbBebidas.getValue().equals("Chocolate caliente | RD$130 |")){
         PrecioACobrar = 130;
        
    }else{
         PrecioACobrar = 120;
        
    }

    if(ckPostre.isSelected()){
        PrecioPostre =75;
    }else{
        PrecioPostre =0;
    }
    int resultado = PrecioACobrar * cantidad + PrecioPostre;

    lblResultado.setText("El monto a pagar es de : " + resultado +" DOP");
}catch(Exception e){

    lblResultado.setText("Error. Ingrese una cantidad válida (solo números enteros)");
    
}
}
}

