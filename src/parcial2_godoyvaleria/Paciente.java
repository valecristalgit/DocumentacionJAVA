/*
Clase que hereda de Persona nos permitirá generar pacientes
 */
package parcial2_godoyvaleria;

import java.util.Date;

/**
 *
 * @author 
 */
public class Paciente extends Persona{
    //Inicializo las variables pertenecientes a la clase
    int nroDocumento;
    String domicilio;
    String celular;
    String obraSocial;
    boolean activo;
    
    
    //Realizo un consttructosr vacío (con seters heredados y propios de esta clase) y otro constructor completo
    public Paciente(){
        this.setId(0);
        this.setApellido("");
        this.setNombres("");
        this.setFechaNacimiento(null);
        this.setNroDocumento(0);
        this.setDomicilio("");
        this.setCelular("");
        this.setObraSocial("");
        this.setActivo(false);
    }
    
    public Paciente(int id, String apellido, String nombres, Date fechNac,
             int nroDoc, String dom, String cel, String obraSocial, boolean activo){
        super(id,apellido,nombres,fechNac);
        this.setNroDocumento(nroDoc);
        this.setDomicilio(dom);
        this.setCelular(cel);
        this.setObraSocial(obraSocial);
        this.setActivo(activo);
    }
    //Getters y Setters pertenecientes a la clase

    public int getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}
