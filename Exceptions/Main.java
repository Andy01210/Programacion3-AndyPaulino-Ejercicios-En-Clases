import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ListaEstudiante lista = new ListaEstudiante();
        Scanner leer = new Scanner(System.in);
        int op;
        do{
            System.out.println("1.Registrar Estudiante");
            System.out.println("2.Listar Estudiante");
            System.out.println("3.Salir");
            op = leer.nextInt();
            leer.nextLine();
        switch(op){
            case 1:
                 System.out.println("Ingrese el nombre del estudiante");
                 String Nombre = leer.nextLine();
                 System.out.println("La edad del estudiantee");
                 int Edad = leer.nextInt();
                 leer.nextLine();
                 System.out.println("Ingrese el indice del estudiante");
                 double indice = leer.nextDouble();
                 leer.nextLine();
                  try {
                        UsuarioServices.ValidarEstudiante(Nombre, Edad, indice);
                        lista.Agregar(Nombre, Edad, indice);
                         System.out.println("Estudiante registrado correctamente.");
            
                  } catch (EstudianteValidartor e){
                         System.out.println(e.getMessage());
                      }finally{
                         System.out.println("Proceso finalizado\n\n");
                      }
                
                 break;
            case 2:
                lista.Listar();
                break;
            case 3:
                System.out.println("Gracias por su participacion");
                break;
        }

        }while(op != 3);
    }
    }
    

