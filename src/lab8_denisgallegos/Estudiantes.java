/*Clase para el objeto ESTUDIANTES
 */
package lab8_denisgallegos;


public class Estudiantes extends Personas{
    
    private int numcuenta;
    private Carreras carrera; 

    public Estudiantes() {
        super();
    }

    public Estudiantes(int numcuenta, Carreras carrera, String nombre, String apellido, int edad, String genero) {
        super(nombre, apellido, edad, genero);
        this.numcuenta = numcuenta;
        this.carrera = carrera;
    }
    
    public Estudiantes(int numcuenta, String nombre, String apellido, int edad, String genero) {
        super(nombre, apellido, edad, genero);
        this.numcuenta = numcuenta;
    }

    //MUTADORES: 
    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public Carreras getCarrera() {
        return carrera;
    }

    public void setCarrera(Carreras carrera) {
        this.carrera = carrera;
    }
    
    //MA: 
    public String toStringEstudiantes2(){
        return toStringPersonas()+", Cuenta: "+numcuenta;
    }
    
    
    
    
    
    
    
}//Fin de la clase.
