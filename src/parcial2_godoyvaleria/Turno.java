/*
Clase Turno: al guardar dos objetos actúa como una clase que relaciona dos entidades.
 */
package parcial2_godoyvaleria;

import java.util.Date;

/**
 *
 * @author
 */
public class Turno {
    //Inicializo las variables pertenecientes a la clase
    int nro;
    Date fechaTurno;
    Paciente paciente;
    Empleado resCarga; // el empleado que registre el turno.
    

    //Realizo un consttructosr vacío y otro completo
    public Turno(){
        this.setNro(0);
        this.setFechaTurno(null);
        this.setPaciente(new Paciente());
        this.setResCarga(new Empleado());
    }

    public Turno(int nro, Date fecha, Paciente p, Empleado resCarga){
        this.setNro(nro);
        this.setFechaTurno(fecha);
        this.setPaciente(p);
        this.setResCarga(resCarga);
    }
    
    //Getters y Setters pertenecientes a la clase
    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Empleado getResCarga() {
        return resCarga;
    }

    public void setResCarga(Empleado resCarga) {
        this.resCarga = resCarga;
    }
    
    
}
