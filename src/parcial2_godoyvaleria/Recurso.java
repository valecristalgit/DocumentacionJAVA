/*
Clase Recurso 
 */
package parcial2_godoyvaleria;

/**
 *
 * @author
 */
public class Recurso {
    //Inicializo las variables pertenecientes a la clase
    int id;
    String nombre;
    String tipoRecurso;
    String descripcion;    
    
    //Realizo un consttructosr vacío y otro completo
    public Recurso(){
    this.setId(0);
    this.setNombre("");
    this.setTipoRecurso("");
    this.setDescripcion("");
    }

    public Recurso(int id, String nombre, String tipoRecurso, String descripcion) {
        this.setId(id);
        this.setNombre(nombre);
        this.setTipoRecurso(tipoRecurso);
        this.setDescripcion(descripcion);
    }
    //Getters y Setters pertenecientes a la clase
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(String tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
