package ProyectoTBDD2_AndresCruz_StephanieMartinez;

public class DatosSanitarios {

    boolean alergias;
    boolean pRespiratorios;
    boolean pCardiacos;
    boolean pMentales;

    public DatosSanitarios(boolean alergias, boolean pRespiratorios, boolean pCardiacos, boolean pMentales) {
        this.alergias = alergias;
        this.pRespiratorios = pRespiratorios;
        this.pCardiacos = pCardiacos;
        this.pMentales = pMentales;
    }

    public boolean isAlergias() {
        return alergias;
    }

    public void setAlergias(boolean alergias) {
        this.alergias = alergias;
    }

    public boolean ispRespiratorios() {
        return pRespiratorios;
    }

    public void setpRespiratorios(boolean pRespiratorios) {
        this.pRespiratorios = pRespiratorios;
    }

    public boolean ispCardiacos() {
        return pCardiacos;
    }

    public void setpCardiacos(boolean pCardiacos) {
        this.pCardiacos = pCardiacos;
    }

    public boolean ispMentales() {
        return pMentales;
    }

    public void setpMentales(boolean pMentales) {
        this.pMentales = pMentales;
    }
}
