/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoTBDD2_AndresCruz_StephanieMartinez;

/**
 *
 * @author andrescruz
 */
public class Aplicante {
    String idpersona;
    String seleccionado;

    public Aplicante(String idpersona, String seleccionado) {
        this.idpersona = idpersona;
        this.seleccionado = seleccionado;
    }

    public String getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(String idpersona) {
        this.idpersona = idpersona;
    }

    public String getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(String seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}
