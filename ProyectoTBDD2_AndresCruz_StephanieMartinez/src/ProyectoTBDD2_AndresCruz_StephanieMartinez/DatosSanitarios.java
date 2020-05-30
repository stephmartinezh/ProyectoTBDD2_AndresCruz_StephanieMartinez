package ProyectoTBDD2_AndresCruz_StephanieMartinez;

public class DatosSanitarios {

    boolean alergias;
    boolean respiratorios;
    boolean cardiacos;
    boolean mentales;

    public DatosSanitarios() {
    }

    public DatosSanitarios(boolean alergias, boolean pRespiratorios, boolean pCardiacos, boolean pMentales) {
        this.alergias = alergias;
        this.respiratorios = pRespiratorios;
        this.cardiacos = pCardiacos;
        this.mentales = pMentales;
    }

    public boolean isAlergias() {
        return alergias;
    }

    public void setAlergias(boolean alergias) {
        this.alergias = alergias;
    }

    public boolean isRespiratorios() {
        return respiratorios;
    }

    public void setRespiratorios(boolean respiratorios) {
        this.respiratorios = respiratorios;
    }

    public boolean isCardiacos() {
        return cardiacos;
    }

    public void setCardiacos(boolean cardiacos) {
        this.cardiacos = cardiacos;
    }

    public boolean isMentales() {
        return mentales;
    }

    public void setMentales(boolean mentales) {
        this.mentales = mentales;
    }
}
