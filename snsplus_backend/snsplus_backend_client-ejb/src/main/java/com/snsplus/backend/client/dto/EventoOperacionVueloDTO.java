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
public class EventoOperacionVueloDTO extends EventoOperacionDTO{
    private VueloDTO padreVueloDTO;

    public VueloDTO getPadreVueloDTO() {
        if (padreVueloDTO == null) {
            padreVueloDTO = new VueloDTO();
        }
        return padreVueloDTO;
    }

    public void setPadreVueloDTO(VueloDTO padreVueloDTO) {
        this.padreVueloDTO = padreVueloDTO;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("EventoOperacionVueloDTO{ padreFaseEventoDTO = ").append(padreVueloDTO).                
                append('}').toString();
    }
}
