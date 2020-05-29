package ProyectoTBDD2_AndresCruz_StephanieMartinez;

import java.util.ArrayList;

public class Curriculum {

    ArrayList<String> puestoDeseado = new ArrayList();
    int salarioEsperado;
    boolean contratoTiempoCompleto;
    ArrayList<String> idiomas = new ArrayList();

    public Curriculum(int salarioEsperado, boolean contratoTiempoCompleto) {
        this.salarioEsperado = salarioEsperado;
        this.contratoTiempoCompleto = contratoTiempoCompleto;
    }

    public ArrayList<String> getPuestoDeseado() {
        return puestoDeseado;
    }

    public void setPuestoDeseado(ArrayList<String> puestoDeseado) {
        this.puestoDeseado = puestoDeseado;
    }

    public int getSalarioEsperado() {
        return salarioEsperado;
    }

    public void setSalarioEsperado(int salarioEsperado) {
        this.salarioEsperado = salarioEsperado;
    }

    public boolean isContratoTiempoCompleto() {
        return contratoTiempoCompleto;
    }

    public void setContratoTiempoCompleto(boolean contratoTiempoCompleto) {
        this.contratoTiempoCompleto = contratoTiempoCompleto;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }
}