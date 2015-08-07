/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.frontend.controllers.session;

import com.snsplus.backend.client.dto.VueloDTO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Time;

/**
 *
 * @author conamerica15
 */
@Named(value = "vueloSessionBean")
@SessionScoped
public class VueloSessionBean implements Serializable {
    private VueloDTO vueloSeleccionado;
    private Time horaLLegada;
    /**
     * Creates a new instance of VueloSessionBean
     */
    public VueloSessionBean() {
    }

    public VueloDTO getVuelo() {
        return vueloSeleccionado;
    }

    public void setVuelo(VueloDTO vuelo) {
        this.vueloSeleccionado = vuelo;
    }

    public Time getHoraLLegada() {
        horaLLegada = new Time(vueloSeleccionado.getRutaDTO().getHoraSalida().getTime() + vueloSeleccionado.getRutaDTO().getTiempoRuta().getTime());        
        return horaLLegada;
    }

    public void setHoraLLegada(Time horaLLegada) {
        this.horaLLegada = horaLLegada;
    }
    
}
