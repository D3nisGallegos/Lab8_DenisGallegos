/*Clase para el objeto MAESTROS.
 */
package lab8_denisgallegos;

import java.util.ArrayList;


public class Maestros extends Personas{
    
    private double salario;
    private ArrayList clases = new ArrayList();

    public Maestros() {
        super();
    }

    public Maestros(double salario, String nombre, String apellido, int edad, String genero) {
        super(nombre, apellido, edad, genero);
        this.salario = salario;
    }
    
    //MUTADORES: 
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList getClases() {
        return clases;
    }

    public void setClases(ArrayList clases) {
        this.clases = clases;
    }
    
    //MA: 
    public String toStringMaestros(){
        return toStringPersonas()+", Salario: "+salario;
    }
    
}//Fin de la clase.
