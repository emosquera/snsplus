/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.dto;

import com.snsplus.backend.client.enums.DiaSemana;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author conamerica15
 */
@XmlRootElement(name = "itinerario_ruta")
public class ItinerarioRutaDTO extends GeneralDTO{
    private DiaSemana dia;
    private RutaDTO rutaDTO;

    public DiaSemana getDia() {
        return dia;
    }

    public void setDia(DiaSemana dia) {
        this.dia = dia;
    }

    public RutaDTO getRutaDTO() {
        if (rutaDTO == null) {
            rutaDTO = new RutaDTO();
        }
        return rutaDTO;
    }

    public void setRutaDTO(RutaDTO rutaDTO) {
        this.rutaDTO = rutaDTO;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("ItinerarioRutaDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", dia = ").append(dia).
                append(", ruta = ").append(rutaDTO).
                append('}').toString();
    }
}
