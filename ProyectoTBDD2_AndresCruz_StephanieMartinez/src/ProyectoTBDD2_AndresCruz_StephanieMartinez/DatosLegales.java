package ProyectoTBDD2_AndresCruz_StephanieMartinez;

public class DatosLegales {

    boolean esMayorEdad;
    boolean aPenales;
    boolean lConducir;
    boolean cMilitar;
    boolean casado;
    boolean visa;

    public DatosLegales() {
    }

    public DatosLegales(boolean esMayorEdad, boolean aPenales, boolean lConducir, boolean cMilitar, boolean casado, boolean visa) {
        this.esMayorEdad = esMayorEdad;
        this.aPenales = aPenales;
        this.lConducir = lConducir;
        this.cMilitar = cMilitar;
        this.casado = casado;
        this.visa = visa;
    }

    public boolean isEsMayorEdad() {
        return esMayorEdad;
    }

    public void setEsMayorEdad(boolean esMayorEdad) {
        this.esMayorEdad = esMayorEdad;
    }

    public boolean isaPenales() {
        return aPenales;
    }

    public void setaPenales(boolean aPenales) {
        this.aPenales = aPenales;
    }

    public boolean islConducir() {
        return lConducir;
    }

    public void setlConducir(boolean lConducir) {
        this.lConducir = lConducir;
    }

    public boolean iscMilitar() {
        return cMilitar;
    }

    public void setcMilitar(boolean cMilitar) {
        this.cMilitar = cMilitar;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public boolean isVisa() {
        return visa;
    }

    public void setVisa(boolean visa) {
        this.visa = visa;
    }
}
