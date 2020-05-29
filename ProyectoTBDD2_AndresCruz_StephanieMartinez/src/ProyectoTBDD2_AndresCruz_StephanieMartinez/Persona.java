/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoTBDD2_AndresCruz_StephanieMartinez;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author andrescruz
 */
public class Persona {
    String id;
    String nombre;
    String apellido;
    String nacionalidad;
    String genero;
    Date fechanacimiento;
    String telefono;
    String correo;
    String direccion;
    ArrayList<DatosFamiliares> familiares = new ArrayList();
    DatosLegales datoslegales;
    Curriculum curriculum;
    ExperienciaLaboral experiencia;
    DatosAcademicos datosacademicos;
    DatosSanitarios datossanitarios;

    public Persona(String id,String nombre, String apellido, String nacionalidad, String genero, Date fechaNacimiento, String telefono, String correo, String direccion) {
        this.id=id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.fechanacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<DatosFamiliares> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(ArrayList<DatosFamiliares> familiares) {
        this.familiares = familiares;
    }

    public DatosLegales getDatoslegales() {
        return datoslegales;
    }

    public void setDatoslegales(DatosLegales datoslegales) {
        this.datoslegales = datoslegales;
    }

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    public ExperienciaLaboral getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(ExperienciaLaboral experiencia) {
        this.experiencia = experiencia;
    }

    public DatosAcademicos getDatosacademicos() {
        return datosacademicos;
    }

    public void setDatosacademicos(DatosAcademicos datosacademicos) {
        this.datosacademicos = datosacademicos;
    }

    public DatosSanitarios getDatossanitarios() {
        return datossanitarios;
    }

    public void setDatossanitarios(DatosSanitarios datossanitarios) {
        this.datossanitarios = datossanitarios;
    }
    
}
