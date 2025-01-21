/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.actividadevento.modelo;

import java.util.Date;

/**
 *
 * @author DAW1
 */
public class Evento {
    public static int numId;
    
    private String descripcion;
    private Date fecha;
    private String lugar;
    private String mayorEdad;
    private double coste;

    public Evento(String descripcion, Date fecha, String lugar, String mayorEdad, double coste) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.lugar = lugar;
        this.mayorEdad = mayorEdad;
        this.coste = coste;
        this.numId++;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(String mayorEdad) {
        this.mayorEdad = mayorEdad;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }
    
    
}
