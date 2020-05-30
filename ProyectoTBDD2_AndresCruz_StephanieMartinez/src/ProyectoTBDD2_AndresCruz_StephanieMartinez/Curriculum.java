package ProyectoTBDD2_AndresCruz_StephanieMartinez;

import java.util.ArrayList;

public class Curriculum {
    String Categoria;
    String puestoDeseado;
    int salarioEsperado;
    boolean contratoTiempoCompleto;
    ArrayList<String> idiomas = new ArrayList();

    public Curriculum() {
    }

    public Curriculum(String Categoria, String puestoDeseado, int salarioEsperado, boolean contratoTiempoCompleto) {
        this.Categoria = Categoria;
        this.puestoDeseado = puestoDeseado;
        this.salarioEsperado = salarioEsperado;
        this.contratoTiempoCompleto = contratoTiempoCompleto;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    public String getPuestoDeseado() {
        return puestoDeseado;
    }

    public void setPuestoDeseado(String puestoDeseado) {
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
