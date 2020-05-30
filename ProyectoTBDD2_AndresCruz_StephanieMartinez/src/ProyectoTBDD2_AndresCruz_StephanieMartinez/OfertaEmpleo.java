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
public class OfertaEmpleo {
    String codigo;
    int aexperiencia;
    double sueldo;
    boolean tiempocompleto;
    String puesto;
    int vacantes;
    String gradoobtenido;
    String sexo;
    int edadmin;
    ArrayList<Aplicante> aplicantes;

    public OfertaEmpleo() {
    }

    public OfertaEmpleo(String codigo, int aexperiencia, double sueldo, boolean tiempocompleto, String puestos, int vacantes, String gradoobtenido, String sexo, int edadmin) {
        this.codigo = codigo;
        this.aexperiencia = aexperiencia;
        this.sueldo = sueldo;
        this.tiempocompleto = tiempocompleto;
        this.puesto = puestos;
        this.vacantes = vacantes;
        this.gradoobtenido = gradoobtenido;
        this.sexo = sexo;
        this.edadmin = edadmin;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAexperiencia() {
        return aexperiencia;
    }

    public void setAexperiencia(int aexperiencia) {
        this.aexperiencia = aexperiencia;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isTiempocompleto() {
        return tiempocompleto;
    }

    public void setTiempocompleto(boolean tiempocompleto) {
        this.tiempocompleto = tiempocompleto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puestos) {
        this.puesto = puestos;
    }

    public int getVacantes() {
        return vacantes;
    }

    public void setVacantes(int vacantes) {
        this.vacantes = vacantes;
    }

    public String getGradoobtenido() {
        return gradoobtenido;
    }

    public void setGradoobtenido(String gradoobtenido) {
        this.gradoobtenido = gradoobtenido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdadmin() {
        return edadmin;
    }

    public void setEdadmin(int edadmin) {
        this.edadmin = edadmin;
    }

    public ArrayList<Aplicante> getAplicantes() {
        return aplicantes;
    }

    public void setAplicantes(ArrayList<Aplicante> aplicantes) {
        this.aplicantes = aplicantes;
    }
    
}
