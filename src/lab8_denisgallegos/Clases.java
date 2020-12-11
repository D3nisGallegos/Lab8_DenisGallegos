/*Clase para el objeto CLASE.
 */
package lab8_denisgallegos;

public class Clases {
    
    private String nombre; 
    private String seccion; 
    private int edificio; 
    private int salon; 
    private String aire; 

    public Clases() {
    }

    public Clases(String nombre, String seccion, int edificio, int salon, String aire) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.edificio = edificio;
        this.salon = salon;
        this.aire = aire;
    }
    
    //MUTADORES: 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getEdificio() {
        return edificio;
    }

    public void setEdificio(int edificio) {
        this.edificio = edificio;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    public String getAire() {
        return aire;
    }

    public void setAire(String aire) {
        this.aire = aire;
    }
    
    //MA: 
    public String toStringClases(){
        return "Clase: "+nombre+", Seccion: "+seccion+", Edificio: "+edificio+", Aula: "+salon+", Aire: "+aire;
    }
    
    
    
}//Fin de la clase.
