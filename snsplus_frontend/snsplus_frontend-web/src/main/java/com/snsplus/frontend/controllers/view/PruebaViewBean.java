/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.frontend.controllers.view;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author conamerica15
 */
@Named(value = "pruebaViewBean")
@ViewScoped
public class PruebaViewBean implements Serializable{
    private String fechaFormateada;

    /**
     * Creates a new instance of PruebaViewBean
     */
    public PruebaViewBean() {
    }

    public String getFechaFormateada() {
        Calendar fechaActual = Calendar.getInstance();
        String fechaString = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy").format(fechaActual.getTime());
        fechaFormateada = fechaString;
        return fechaFormateada;
    }

    public void setFechaFormateada(String fechaFormateada) {
        this.fechaFormateada = fechaFormateada;
    }
    
}
