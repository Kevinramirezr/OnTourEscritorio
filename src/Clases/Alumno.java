/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Ramirez
 */
public class Alumno {
    
    private String alumno_id;
    private String cuenta_id;
    private String nombre;
    private String apellido;
    private String sexo;
    private String curso_id;

    public Alumno(String alumno_id, String cuenta_id, String nombre, String apellido, String sexo, String curso_id) {
        this.alumno_id = alumno_id;
        this.cuenta_id = cuenta_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.curso_id = curso_id;
    }

    public String getAlumno_id() {
        return alumno_id;
    }

    public void setAlumno_id(String alumno_id) {
        this.alumno_id = alumno_id;
    }

    public String getCuenta_id() {
        return cuenta_id;
    }

    public void setCuenta_id(String cuenta_id) {
        this.cuenta_id = cuenta_id;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(String curso_id) {
        this.curso_id = curso_id;
    }
    
    
    

    
    
}
