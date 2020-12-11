/*Clase para el objeto PERSONAS
 */
package lab8_denisgallegos;


public class Personas {
    
    private String nombre; 
    private String apellido; 
    private int edad; 
    private String genero; 

    public Personas() {
    }

    public Personas(String nombre, String apellido, int edad, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
    }
    
    //MUTADOREs: 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    //MA: 
    public String toStringPersonas(){
        return "Nombre: "+nombre+", Apellido: "+apellido+", Edad: "+edad+", Genero: "+genero; 
    }
    
    
    
    
    
}//Fin de la clase.
