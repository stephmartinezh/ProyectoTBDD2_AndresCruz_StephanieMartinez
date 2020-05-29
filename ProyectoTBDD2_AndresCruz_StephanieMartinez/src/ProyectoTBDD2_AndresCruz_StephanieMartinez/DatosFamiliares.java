package ProyectoTBDD2_AndresCruz_StephanieMartinez;

public class DatosFamiliares {

    String nombre;
    String parentesco;
    String id;

    public DatosFamiliares(String nombre, String parentesco, String id) {
        this.nombre = nombre;
        this.parentesco = parentesco;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
