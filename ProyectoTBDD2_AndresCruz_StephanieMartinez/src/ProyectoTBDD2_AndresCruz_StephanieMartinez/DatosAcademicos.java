package ProyectoTBDD2_AndresCruz_StephanieMartinez;

public class DatosAcademicos {

    String gradoObtenido;
    String especializacion;
    boolean estudianteActivo;
    String otrosEstudios;

    public DatosAcademicos() {
    }

    public DatosAcademicos(String estudioAlacanzado, String especializacion, boolean estudianteActivo, String otrosEstudios) {
        this.gradoObtenido = estudioAlacanzado;
        this.especializacion = especializacion;
        this.estudianteActivo = estudianteActivo;
        this.otrosEstudios = otrosEstudios;
    }

    public String getGradoObtenido() {
        return gradoObtenido;
    }

    public void setGradoObtenido(String gradoObtenido) {
        this.gradoObtenido = gradoObtenido;
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
