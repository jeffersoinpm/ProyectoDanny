/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heart.danny.proyectovacacionesdanny;

import java.io.Serializable;

/**
 *
 * @author jefferson
 */
public class Recuerdo implements Serializable{
    public String nombre;
    public String fechaRecuerdo;
    public String lugarRecuerdo;
    public String detalleRecuerdo;
    public Recuerdo(String nombre, String fechaReferencial,String lugar, String detalle){
        this.nombre=nombre;
        this.fechaRecuerdo=fechaReferencial;
        this.lugarRecuerdo=lugar;
        this.detalleRecuerdo=detalle;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaRecuerdo() {
        return fechaRecuerdo;
    }

    public void setFechaRecuerdo(String fechaRecuerdo) {
        this.fechaRecuerdo = fechaRecuerdo;
    }

    public String getLugarRecuerdo() {
        return lugarRecuerdo;
    }

    public void setLugarRecuerdo(String lugarRecuerdo) {
        this.lugarRecuerdo = lugarRecuerdo;
    }

    public String getDetalleRecuerdo() {
        return detalleRecuerdo;
    }

    public void setDetalleRecuerdo(String detalleRecuerdo) {
        this.detalleRecuerdo = detalleRecuerdo;
    }
    
}
