/*
 Profesional es una clase que hereda de Persona y representa a los médicos del hospital.
 */
package parcial2_godoyvaleria;

import java.util.Date;
import java.util.TreeMap;


/**
 *
 * @author
 */
public class Profesional extends Persona{
    int nroMatriculo;
    TreeMap<Integer, Especialidad> especialidades;//Causa una relación de uno a muchos con especialidades
    
    public Profesional(int id, String apellido, String nombres, Date fechNac,int nroMatric, TreeMap<Integer, Especialidad> espList){
        super(id,apellido,nombres,fechNac);
        this.setNroMatriculo(nroMatric);
        this.setEspecialidades(espList);
    }

    public int getNroMatriculo() {
        return nroMatriculo;
    }

    public void setNroMatriculo(int nroMatriculo) {
        this.nroMatriculo = nroMatriculo;
    }

    public TreeMap<Integer, Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(TreeMap<Integer, Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public void agendarTurno(Especialidad esp, Turno t){
        //el primer if genera una lista de especialidades si el profecional aún no tiene una.
        if(getEspecialidades()==null){
            setEspecialidades(new TreeMap<Integer, Especialidad>());
        }
        //el segundondo if pregunta si esp existe en la lista entidades de este profesional.
        if(getEspecialidades().containsKey(esp.getId())){
            //Se crea la variable espProfesional donde se va a guardar esp
            Especialidad espProfesional = getEspecialidades().get(esp.getId());
            
            /*Se crea una variable entera, toma la cantidad de turnos que tiene esta especialidad,
            y le suma uno*/
            int nroOrdenSiguiente = espProfesional.getTurnos().size() + 1;
        
            /*el valor de nroOrdenSiguiente se lo agrega al numero de turno t*/
            t.setNro(nroOrdenSiguiente);
            
            //t es añadida a la lista de turnos de esp.
            espProfesional.getTurnos().add(t);
            //De esta manera los turnos se acomodan en orden de llegada en el arraylist de la clase especialidad.
        
        }else{
            // si esp no existe, se añade a la lista de especialidades de este profesional.
            getEspecialidades().put(esp.getId(), esp);
            
            //esta parte del código hace lo mismo para esp y t.
            Especialidad espProfesional = getEspecialidades().get(esp.getId());
            
            int nroOrdenSiguiente = espProfesional.getTurnos().size() + 1;
            t.setNro(nroOrdenSiguiente);
            
            espProfesional.getTurnos().add(t);
        }
    }
    
    /*Este método permite mostrar el nombre del profesional 
    que especialidades tiene y cuantos turnos tiene por especialidad.*/
    public void listarTurnosPorEspecialidad(){
        System.out.println("\nProfesional:" + toString());
        System.out.println("--------------------------------------");
        for(Especialidad espList:getEspecialidades().values()){
            System.out.println("Especialidad:" + espList.getNombreEsp().trim());
            System.out.println("--------------------------------------");
            for(int indexTurno=0;indexTurno<espList.getTurnos().size();indexTurno++){
                Turno t = espList.getTurnos().get(indexTurno);
                System.out.println("Turno Nro:" + t.getNro() + " Para: " + t.getPaciente().toString());
            }
            System.out.println("--------------------------------------");
            System.out.println("");
            System.out.println("");
        }
    }
}
