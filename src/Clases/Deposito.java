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
public class Deposito {
    private String deposito_id;
    private String cuenta_id;
    private String tipo_id;
    private String monto;
    private String estado;
    private String fecha;
    private String ruta_comprobante;

    public Deposito(String deposito_id, String cuenta_id, String tipo_id, String monto, String estado, String fecha, String ruta_comprobante) {
        this.deposito_id = deposito_id;
        this.cuenta_id = cuenta_id;
        this.tipo_id = tipo_id;
        this.monto = monto;
        this.estado = estado;
        this.fecha = fecha;
        this.ruta_comprobante = ruta_comprobante;
    }

    public String getDeposito_id() {
        return deposito_id;
    }

    public void setDeposito_id(String deposito_id) {
        this.deposito_id = deposito_id;
    }

    public String getCuenta_id() {
        return cuenta_id;
    }

    public void setCuenta_id(String cuenta_id) {
        this.cuenta_id = cuenta_id;
    }

    public String getTipo_id() {
        return tipo_id;
    }

    public void setTipo_id(String tipo_id) {
        this.tipo_id = tipo_id;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getRuta_comprobante() {
        return ruta_comprobante;
    }

    public void setRuta_comprobante(String ruta_comprobante) {
        this.ruta_comprobante = ruta_comprobante;
    }
    
    
}
