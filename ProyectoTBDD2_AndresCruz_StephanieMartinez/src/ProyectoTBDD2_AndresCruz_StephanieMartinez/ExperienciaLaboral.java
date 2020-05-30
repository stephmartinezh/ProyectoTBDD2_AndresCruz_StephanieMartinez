package ProyectoTBDD2_AndresCruz_StephanieMartinez;

public class ExperienciaLaboral {

    int aniosExperiencia;
    String trabajoAnterior;
    String puestoAnterior;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(int aniosExperencia, String trabajoAnterior, String puestoAnterior) {
        this.aniosExperiencia = aniosExperencia;
        this.trabajoAnterior = trabajoAnterior;
        this.puestoAnterior = puestoAnterior;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTrabajoAnterior() {
        return trabajoAnterior;
    }

    public void setTrabajoAnterior(String trabajoAnterior) {
        this.trabajoAnterior = trabajoAnterior;
    }

    public String getPuestoAnterior() {
        return puestoAnterior;
    }

    public void setPuestoAnterior(String puestoAnterior) {
        this.puestoAnterior = puestoAnterior;
    }
}
