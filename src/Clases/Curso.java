/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Date;

/**
 *
 * @author Ramirez
 */
public class Curso {
    private String curso_id;
    private String nivel;
    private String cuenta_id;
    private String escuela_id;
    private String destino_id;
    private String anio;
    private String monto_meta;
    private String fecha_viaje;
    private String curso_ruta;

    public Curso(String curso_id, String nivel, String cuenta_id, String escuela_id, String destino_id, String monto_meta, String fecha_viaje,String anio,String curso_ruta) {
        this.curso_id = curso_id;
        this.nivel = nivel;
        this.cuenta_id = cuenta_id;
        this.escuela_id = escuela_id;
        this.destino_id = destino_id;
        this.monto_meta = monto_meta;
        this.fecha_viaje = fecha_viaje;
        this.anio = anio;
        this.curso_ruta = curso_ruta;
    }

    public String getCurso_ruta() {
        return curso_ruta;
    }

    public void setCurso_ruta(String curso_ruta) {
        this.curso_ruta = curso_ruta;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    
    
    
    public String getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(String curso_id) {
        this.curso_id = curso_id;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getCuenta_id() {
        return cuenta_id;
    }

    public void setCuenta_id(String cuenta_id) {
        this.cuenta_id = cuenta_id;
    }

    public String getEscuela_id() {
        return escuela_id;
    }

    public void setEscuela_id(String escuela_id) {
        this.escuela_id = escuela_id;
    }

    public String getDestino_id() {
        return destino_id;
    }

    public void setDestino_id(String destino_id) {
        this.destino_id = destino_id;
    }

    public String getMonto_meta() {
        return monto_meta;
    }

    public void setMonto_meta(String monto_meta) {
        this.monto_meta = monto_meta;
    }

    public String getFecha_viaje() {
        return fecha_viaje;
    }

    public void setFecha_viaje(String fecha_viaje) {
        this.fecha_viaje = fecha_viaje;
    }
    
    
    
}
