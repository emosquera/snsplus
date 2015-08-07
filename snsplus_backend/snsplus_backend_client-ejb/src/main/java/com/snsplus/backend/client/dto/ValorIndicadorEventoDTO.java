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
public class ValorIndicadorEventoDTO extends ValorIndicadorDTO{
    private EventoOperacionDTO padre;

    public EventoOperacionDTO getPadre() {
        if (padre == null) {
            padre = new EventoOperacionDTO();
        }
        return padre;
    }

    public void setPadre(EventoOperacionDTO padre) {
        this.padre = padre;
    }
        
    @Override
    public String toString() {
        return new StringBuilder().
                append("ValorIndicadorEventoDTO{ padre = ").append(padre).                
                append('}').toString();
    }
}
