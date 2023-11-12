/*
Clase Especialidad representa a la especialidad de cada profecional.
 */
package parcial2_godoyvaleria;

import java.util.ArrayList;

/**
 *
 * @author
 */
public class Especialidad {
    //Inicializo atributos
    int id;
    String nombreEsp;
    ArrayList<Turno> turnos; 
    
    //Constructores
    public Especialidad(){
        this.setId(0);
        this.setNombreEsp("");
        this.setTurnos(new ArrayList<Turno>());
    }
    
    public Especialidad(int id, String nombreEsp, ArrayList<Turno> turList){
        this.setId(id);
        this.setNombreEsp(nombreEsp);
        this.setTurnos(turList);
    }
    
    public Especialidad(int id, String nombreEsp){
        this.setId(id);
        this.setNombreEsp(nombreEsp);
        this.setTurnos(new ArrayList<Turno>());
    }
    
    //Métodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEsp() {
        return nombreEsp;
    }

    public void setNombreEsp(String nombreEsp) {
        this.nombreEsp = nombreEsp;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }
}
