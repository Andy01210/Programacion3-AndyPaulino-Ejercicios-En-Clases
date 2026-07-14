import javafx.event.ActionEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;


public class ControllerPgConsultar {

    @FXML
    private TableView<Cita> TvTabla;

    @FXML
    private TableColumn  TcCodigo;

    @FXML
    private TableColumn  TcPaciente;

    @FXML
    private TableColumn  TcMedico;

    @FXML
    private TableColumn  TcEspecialidad;

    @FXML
    private TableColumn  TcFecha;

    @FXML
    private TableColumn  TcHora;

    @FXML
    private TableColumn  TcEstado;

    @FXML
    private Button BtnCargar;

    @FXML
    private Button  BtnCancelar;

    @FXML
    private Label LblMensaje;

    @FXML
    public void CargarCita(){
        ObservableList<Cita> lista = FXCollections.observableArrayList(ArchivoUtils.CargarCita());
        TvTabla.setItems(lista);
    }

    @FXML
    public void CambiarEstado(ActionEvent event){
        Cita citaSelec = TvTabla.getSelectionModel().getSelectedItem();
        if(citaSelec!= null){
            citaSelec.setEstado("Cancelada");
            ArchivoUtils.SobreEscribirCitas(TvTabla.getItems());
            LblMensaje.setText("Estado Cambiado. Cargue la tabla nuevamente");
            return;
        }
        else{
            LblMensaje.setText("Error. Seleccione una cita");
            return;
        }
    }

    @FXML
    public void initialize(){
        TcCodigo.setCellValueFactory(new PropertyValueFactory<>("Codigo"));
        TcPaciente.setCellValueFactory(new PropertyValueFactory<>("Paciente"));
        TcMedico.setCellValueFactory(new PropertyValueFactory<>("Medico"));
        TcEspecialidad.setCellValueFactory(new PropertyValueFactory<>("Especialidad"));
        TcFecha.setCellValueFactory(new PropertyValueFactory<>("Fecha"));
        TcHora.setCellValueFactory(new PropertyValueFactory<>("Hora"));
        TcEstado.setCellValueFactory(new PropertyValueFactory<>("Estado"));
      
    }
    
    
}
