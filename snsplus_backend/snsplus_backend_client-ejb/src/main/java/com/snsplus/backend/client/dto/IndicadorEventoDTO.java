/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.dto;

/**
 *
 * @author conamerica15
 */
public class IndicadorEventoDTO extends IndicadorDTO{
    private EventoDTO padreDTO;

    public EventoDTO getPadreDTO() {
        if (padreDTO == null) {
            padreDTO = new EventoDTO();
        }
        return padreDTO;
    }

    public void setPadreDTO(EventoDTO padreDTO) {
        this.padreDTO = padreDTO;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("IndicadorEventoDTO{ evento = ").append(padreDTO).                
                append('}').toString();
    }
}
