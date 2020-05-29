/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoTBDD2_AndresCruz_StephanieMartinez;

import java.util.ArrayList;

/**
 *
 * @author andrescruz
 */
public class TipoTrabajo {
    String NombreCategoria;
    ArrayList<String> PuestosTrabajo;

    public TipoTrabajo(String NombreCategoria, ArrayList<String> PuestosTrabajo) {
        this.NombreCategoria = NombreCategoria;
        this.PuestosTrabajo = PuestosTrabajo;
    }

    public String getNombreCategoria() {
        return NombreCategoria;
    }

    public void setNombreCategoria(String NombreCategoria) {
        this.NombreCategoria = NombreCategoria;
    }

    public ArrayList<String> getPuestosTrabajo() {
        return PuestosTrabajo;
    }

    public void setPuestosTrabajo(ArrayList<String> PuestosTrabajo) {
        this.PuestosTrabajo = PuestosTrabajo;
    }
    
    
}
