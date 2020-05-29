package ProyectoTBDD2_AndresCruz_StephanieMartinez;

public class DatosAcademicos {

    String estudioAlacanzado;
    String especializacion;
    boolean estudianteActivo;
    String otrosEstudios;

    public DatosAcademicos(String estudioAlacanzado, String especializacion, boolean estudianteActivo, String otrosEstudios) {
        this.estudioAlacanzado = estudioAlacanzado;
        this.especializacion = especializacion;
        this.estudianteActivo = estudianteActivo;
        this.otrosEstudios = otrosEstudios;
    }

    public String getEstudioAlacanzado() {
        return estudioAlacanzado;
    }

    public void setEstudioAlacanzado(String estudioAlacanzado) {
        this.estudioAlacanzado = estudioAlacanzado;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public boolean isEstudianteActivo() {
        return estudianteActivo;
    }

    public void setEstudianteActivo(boolean estudianteActivo) {
        this.estudianteActivo = estudianteActivo;
    }

    public String getOtrosEstudios() {
        return otrosEstudios;
    }

    public void setOtrosEstudios(String otrosEstudios) {
        this.otrosEstudios = otrosEstudios;
    }
}
