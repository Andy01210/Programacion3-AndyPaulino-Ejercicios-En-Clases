public class Estudiante {
    private String Nombre;
    private int Edad;
    private double Indice;

    public Estudiante(){}
    public Estudiante(String n, int edad, double indice){
      setNombre(n);
        setEdad(edad);
        setIndice(indice);
    }


    public void setNombre(String nombre){Nombre = nombre;}
    public void setEdad(int edad){
        Edad = edad;}
    public void setIndice(double indice){Indice = indice;}
    public String getNombre(){return Nombre;}
    public int getEdad(){return Edad;}
    public double getIndice(){return Indice;}
    
}
