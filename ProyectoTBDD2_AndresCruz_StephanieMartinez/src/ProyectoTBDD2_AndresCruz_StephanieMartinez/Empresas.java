package ProyectoTBDD2_AndresCruz_StephanieMartinez;

public class Empresas {

    String cif;
    String nombre;
    String ceo;
    String direccion;
    String categoria;

    public Empresas(String cif, String nombre, String ceo, String direccion, String categoria) {
        this.cif = cif;
        this.nombre = nombre;
        this.ceo = ceo;
        this.direccion = direccion;
        this.categoria = categoria;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
