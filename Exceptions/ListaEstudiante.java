import java.util.ArrayList;
public class ListaEstudiante {
    ArrayList<Estudiante> Arreglo = new ArrayList<Estudiante>();
    public void Agregar(String nombre, int edad, double indice){
        Arreglo.add(new Estudiante(nombre, edad, indice));
    }  
    public void Listar(){
        for(Estudiante n : Arreglo){
            System.out.println("Nombre: "+n.getNombre());
            System.out.println("Edad: "+n.getEdad());
            System.out.println("Indice: "+ n.getEdad());
        }
    }  
}
