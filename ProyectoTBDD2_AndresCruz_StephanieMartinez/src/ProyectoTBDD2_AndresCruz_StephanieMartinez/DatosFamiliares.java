package ProyectoTBDD2_AndresCruz_StephanieMartinez;

public class DatosFamiliares {

    String parentesco;
    String id;

    public DatosFamiliares(String parentesco, String id) {
        this.parentesco = parentesco;
        this.id = id;
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
