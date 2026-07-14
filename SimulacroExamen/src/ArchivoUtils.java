import java.io.*;
import java.util.*;
import javafx.collections.*;

public class ArchivoUtils {

    public static void  LeerCita(Cita cita){
        try {
            FileWriter Archivo = new FileWriter("Citas.txt", true);
            BufferedWriter Writer = new BufferedWriter(Archivo);
            Writer.write(cita.getCodigo()+"_"+cita.getPaciente()+"_"+cita.getCedula()+"_"+cita.getTelefono()+"_"+cita.getMedico()+"_"+cita.getEspecialidad()+"_"+cita.getFecha()+"_"+cita.getHora()+"_"+cita.getMotivo()+"_"+cita.getEstado()+"_");
            Writer.write("\n");
            Writer.close();
            Archivo.close();
            
        } catch (Exception e){
            System.out.println("Error en la escritura del archivo"+ e.getMessage());
        }
    }

     public static void  SobreEscribirCitas(ObservableList<Cita> citas){
        try {
            FileWriter Archivo = new FileWriter("Citas.txt", false);
            BufferedWriter Writer = new BufferedWriter(Archivo);

            for(Cita cita : citas){
                Writer.write(cita.getCodigo()+"_"+cita.getPaciente()+"_"+cita.getCedula()+"_"+cita.getTelefono()+"_"+cita.getMedico()+"_"+cita.getEspecialidad()+"_"+cita.getFecha()+"_"+cita.getHora()+"_"+cita.getMotivo()+"_"+cita.getEstado()+"_");
                Writer.write("\n");
            }
            Writer.close();
            Archivo.close();
           
            
        } catch (Exception e){
            System.out.println("Error en la escritura del archivo"+ e.getMessage());
        }
    }

    public static ArrayList<Cita> CargarCita(){
        ArrayList<Cita> Lista = new ArrayList<>();
        try {
            FileReader reader = new FileReader("Citas.txt");
            BufferedReader Leer = new BufferedReader(reader);
            String linea;
            while((linea = Leer.readLine()) != null){
                String [] partes = linea.split("_");
                if(partes.length == 10){
                String codigo = partes[0];
                String paciente = partes[1];
                String cedula = partes[2];
                String telefono = partes[3];
                String medico = partes[4];
                String especialidad = partes[5];
                String fecha = partes[6];
                String hora = partes[7];
                String motivo = partes[8];
                String estado = partes[9];
                Lista.add(new Cita(codigo, paciente, cedula, telefono, medico, especialidad, fecha, hora, motivo, estado));
                }
                
            }
            Leer.close();
            reader.close();
            
        } catch (Exception e) {
            System.out.println("error al cargar la lista"+e.getMessage());
        }

        return Lista;
    }
    
}