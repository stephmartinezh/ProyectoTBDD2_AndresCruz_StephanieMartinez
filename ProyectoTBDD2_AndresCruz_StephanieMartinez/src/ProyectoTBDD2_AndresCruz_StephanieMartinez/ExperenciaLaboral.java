package ProyectoTBDD2_AndresCruz_StephanieMartinez;

public class ExperenciaLaboral {

    int aniosExperencia;
    String trabajoAnterior;
    String puestoAnterior;

    public ExperenciaLaboral(int aniosExperencia, String trabajoAnterior, String puestoAnterior) {
        this.aniosExperencia = aniosExperencia;
        this.trabajoAnterior = trabajoAnterior;
        this.puestoAnterior = puestoAnterior;
    }

    public int getAniosExperencia() {
        return aniosExperencia;
    }

    public void setAniosExperencia(int aniosExperencia) {
        this.aniosExperencia = aniosExperencia;
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
