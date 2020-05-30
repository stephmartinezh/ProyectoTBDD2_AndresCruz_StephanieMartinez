package ProyectoTBDD2_AndresCruz_StephanieMartinez;

import java.util.ArrayList;
import org.bson.types.ObjectId;

public class Empresas {
    ObjectId _id;
    String cif;
    String nombre;
    String ceo;
    String direccion;
    String categoria;
    ArrayList<OfertaEmpleo> ofertas;

    public Empresas() {
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public Empresas(String cif, String nombre, String ceo, String direccion, String categoria) {
        this.cif = cif;
        this.nombre = nombre;
        this.ceo = ceo;
        this.direccion = direccion;
        this.categoria = categoria;
    }

    public ArrayList<OfertaEmpleo> getOfertas() {
        return ofertas;
    }

    public void setOfertas(ArrayList<OfertaEmpleo> ofertas) {
        this.ofertas = ofertas;
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
