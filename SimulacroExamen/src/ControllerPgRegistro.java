
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.*;


public class ControllerPgRegistro {
    @FXML
    private TextField TxtCodigo;

    @FXML
    private TextField TxtNombre;

    @FXML
    private TextField TxtCedula;

    @FXML
    private TextField TxtTelefono;

    @FXML
    private TextField TxtHora;

    @FXML
    private ComboBox CbMedico;

    @FXML
    private ComboBox CbEspecialidad;

    @FXML
    private ComboBox CbEstado;

    @FXML
    private DatePicker DPFecha;

    @FXML
    private TextArea TxtAMotivo;

    @FXML
    private Label LblMensaje;

    @FXML
    private Button BtnGuardar;

    @FXML
    private Button BtnLimpiar;

    @FXML
    public void initialize(){
        CbMedico.getItems().addAll("Saul Fabre", "Andy Paulino", "John Santo","Angel Gonzalez", "Haniel Suarez");
        CbEspecialidad.getItems().addAll("NeuroCirujano", "General", "Oftalmologo", "Nutriologo");
        CbEstado.getItems().addAll("Programada", "Atendida", "Cancelada");

    }

    @FXML
    public void AccionGuardar(ActionEvent event){
        Guardar();
    }

    @FXML
    public void AccionLimpiar(ActionEvent event){
        Limpiar();
    }

    public void Guardar(){
        try {
            if(TxtCodigo.getText().isEmpty()){
                LblMensaje.setText("Error. El codigo no puede estar vacio");
                return;

            }
              if(TxtNombre.getText().isEmpty()){
                LblMensaje.setText("Error. El nombre no puede estar vacio");
                return;

            }
             
              if(TxtCedula.getText().isEmpty()){
                LblMensaje.setText("Error. El telefono no puede estar vacio");
                return;

            }
              if(TxtTelefono.getText().isEmpty()){
                LblMensaje.setText("Error. El telefono no puede estar vacio");
                return;

            }
              if(TxtHora.getText().isEmpty()){
                LblMensaje.setText("Error. La hora no puede estar vacia");
                return;

            }
            if(CbMedico.getValue()==null){
                LblMensaje.setText("Error. no ha elegido un medico");
            }
             if(CbEspecialidad.getValue()==null){
                LblMensaje.setText("Error. no ha elegido una Especialidad");
                return;
            }
             if(CbEstado.getValue()==null){
                LblMensaje.setText("Error. no ha elegido un Estado");
                return;
            }
            if(DPFecha.getValue()==null){
                LblMensaje.setText("Error. no ha ingresado la fecha");
                return;
            }
              if(TxtAMotivo.getText().isEmpty()){
                LblMensaje.setText("Error. no ha ingresado el Motivo de su consulta");
                return;
              }

              String codigo = TxtCodigo.getText();
              String paciente = TxtNombre.getText();
              String cedula = TxtCedula.getText();
              String hora = TxtHora.getText();
              String telefono = TxtTelefono.getText();
              String medico = String.valueOf(CbMedico.getValue());
              String especialidad = String.valueOf(CbEspecialidad.getValue());
              String estado = String.valueOf(CbEstado.getValue());
              String fecha = String.valueOf(DPFecha.getValue());
              String motivo = TxtAMotivo.getText();

              ArchivoUtils.LeerCita(new Cita(codigo,paciente,cedula,telefono,medico, especialidad, fecha, hora, motivo, estado));
              LblMensaje.setText("Cita agendada correctamente");

        } catch (Exception e) {
            System.out.println("Error al guradar estudiante"+ e.getMessage());
        }

        
    }

    public void Limpiar(){
            TxtAMotivo.clear();
            TxtCedula.clear();
            TxtCodigo.clear();
            TxtNombre.clear();
            TxtHora.clear();
            TxtTelefono.clear();
            CbEspecialidad.setValue(null);
            CbEstado.setValue(null);
            CbMedico.setValue(null);
            DPFecha.setValue(null);

            LblMensaje.setText("Pantalla limpiada correctamente");

        }

   
    
    
    
    
    
    
    
    
    
}
