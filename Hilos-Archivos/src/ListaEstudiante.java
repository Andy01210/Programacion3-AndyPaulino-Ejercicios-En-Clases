import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class ListaEstudiante {
    Scanner leer = new Scanner(System.in);
 
    public void AgregarEstudiante(){
        System.out.println("Ingrese el nombre del estudiante");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la edad del estudiante");
        int edad = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese la matricula del estudiante");
        String matricula = leer.nextLine();
       try{
        FileWriter fw = new FileWriter("estudiante.txt", true);
        BufferedWriter writer = new BufferedWriter(fw);
        writer.write("Nombre del estudiante: "+nombre + "\n");
        writer.write("Matricula del estudiante: "+matricula + "\n");
        writer.write("Edad del estudiante: "+edad + "\n");
        writer.write("\n");
        writer.close();
        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        };
        


    }
    public void MostrarEstudiante(){
        try{
        FileReader read = new FileReader("estudiante.txt");
        BufferedReader buffer = new BufferedReader(read);
        String linea;
        while((linea = buffer.readLine())!= null){
            System.out.println(linea);
        }
    }catch(Exception e){
        System.out.println("Error: "+e.getMessage());
    }

    }
    
}
