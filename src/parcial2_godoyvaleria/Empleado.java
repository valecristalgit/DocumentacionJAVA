/*
Clase Empleado genera empleados que administran la información del hospital.
 */
package parcial2_godoyvaleria;

import java.util.Date;

/**
 *
 * @author
 */
public class Empleado extends Persona{
    //Inicializo atributos
    String cargo;
    //Constructores

    public Empleado() {
    }
    

    public Empleado(String cargo, int id, String apellido, String nombres, Date fechaNacimiento) {
        super(id, apellido, nombres, fechaNacimiento);
        this.setCargo(cargo);
    }
    
    //Métodos

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
