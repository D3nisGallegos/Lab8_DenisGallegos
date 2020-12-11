/*Clase para el objeto CARRERAS
 */
package lab8_denisgallegos;


public class Carreras {
    
    private String nombre; 
    private String facultad; 
    private double costo; 
    private String jefe;

    public Carreras() {
    }

    public Carreras(String nombre, String facultad, double costo, String jefe) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.costo = costo;
        this.jefe = jefe;
    }
    
    //MUTADORES:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }
    
    //MA: 
    public String toStringCarreras(){
        return "Carrera: "+nombre+", Facultad: "+facultad+", Costo: "+costo+", Jefe: "+jefe;
    }
    
    
    
    
}//Fin de la clase. 
