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
public class ValorIndicadorFaseDTO extends ValorIndicadorDTO{
    private FaseOperacionDTO padre;

    public FaseOperacionDTO getPadre() {
        if (padre == null) {
            padre = new FaseOperacionDTO();
        }
        return padre;
    }

    public void setPadre(FaseOperacionDTO padre) {
        this.padre = padre;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("ValorIndicadorFaseDTO{ padre = ").append(padre).                
                append('}').toString();
    }
}
