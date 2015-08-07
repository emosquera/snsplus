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
public class IndicadorFaseDTO extends IndicadorDTO{
    private FaseDTO padreDTO;

    public FaseDTO getPadreDTO() {
        if (padreDTO == null) {
            padreDTO = new FaseDTO();
        }
        return padreDTO;
    }

    public void setPadreDTO(FaseDTO padreDTO) {
        this.padreDTO = padreDTO;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("IndicadorFaseDTO{ fase = ").append(padreDTO).                
                append('}').toString();
    }
    
}
