/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoTBDD2_AndresCruz_StephanieMartinez;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Faith
 */
public class TipoTrabajo {
    private ObjectId _id;
    private String NombreCategoria;
    private List<String> PuestosTrabajo;

    public TipoTrabajo() {
    }

    public TipoTrabajo(String NombreCategoria, List<String> PuestosTrabajo) {
        this.NombreCategoria = NombreCategoria;
        this.PuestosTrabajo = PuestosTrabajo;
    }
    
    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getNombreCategoria() {
        return NombreCategoria;
    }

    public void setNombreCategoria(String NombreCategoria) {
        this.NombreCategoria = NombreCategoria;
    }

    public List<String> getPuestosTrabajo() {
        return PuestosTrabajo;
    }

    public void setPuestosTrabajo(List<String> PuestosTrabajo) {
        this.PuestosTrabajo = PuestosTrabajo;
    }
    
    
}
