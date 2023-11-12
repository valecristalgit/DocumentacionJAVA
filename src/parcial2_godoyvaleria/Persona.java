/*
Super-Clase Persona
 */
package parcial2_godoyvaleria;

import java.util.Date;

/**
 *
 * @author
 */
public class Persona {
    //Nota de Profesor Pablo Giordano: la clase Persona seria conveniente que sea una clase del tipo abstracta
    //Inicializo las variables pertenecientes a la clase
    int id;
    String apellido;
    String nombres;
    Date fechaNacimiento;
    
    //Realizo un consttructosr vacío y otro completo
    
    public Persona(){
        this.setId(0);
        this.setApellido("");
        this.setNombres("");
        this.setFechaNacimiento(null);
    }
    
    public Persona(int id, String apellido, String nombres, Date fechaNacimiento){
        this.setId(id);
        this.setApellido(apellido);
        this.setNombres(nombres);
        this.setFechaNacimiento(fechaNacimiento);
    }
    //Getters y Setters pertenecientes a la clase
    
        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    @Override
    public String toString(){
        return getApellido() + " " + getNombres();
    }
    
}
