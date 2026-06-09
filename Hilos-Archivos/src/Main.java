import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        ListaEstudiante lista = new ListaEstudiante();
        int op =0;
        do { 
            System.out.println("\n\n\nBienvedino al sistema de almacenamiento de estudiantes.");
            System.out.println("1.Agregar Estudiante");
            System.out.println("2.Mostrar Estudiantes");
            System.out.println("3.Salir");
            op = leer.nextInt();
            leer.nextLine();
            switch(op){
                case 1:
                    lista.AgregarEstudiante();
                    break;
                case 2:
                    lista.MostrarEstudiante();
                    break;
                case 3:
                    System.out.println("Gracias por su participacion");
                    break;
            }

            
        } while (op!=3);
    }
    
}
