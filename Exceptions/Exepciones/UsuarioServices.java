public class UsuarioServices {
    public static void ValidarEstudiante(String Nombre, int edad, double indice)throws EstudianteValidartor{
        
        if(Nombre.isEmpty()){
         throw new EstudianteValidartor("Error: El nombre no puede estar vacío.");
        }
        else{
            System.out.println("Nombre Valido");
        }
    
    if(edad < 18 || edad > 100){
            throw new EstudianteValidartor("Error: La edad debe ser mayor o igual a 18 años y menor que 100 años");
        }
        else{
        System.out.println("Edad Valida");
    }
    
     if(indice < 0.00 || indice > 4.00){
            throw new EstudianteValidartor("Error: El índice debe estar entre 0 y 4.");
        }
        else{
            System.out.println("Indice Valida");
        }
    }
}
