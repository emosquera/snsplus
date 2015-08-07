/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.dto;

import com.snsplus.backend.client.enums.TipoPadreIndicador;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author conamerica15
 */
@XmlRootElement(name = "valor_indicador")
public class ValorIndicadorDTO extends GeneralDTO{
    private IndicadorDTO indicadorDTO;
    private String valor; 
    private TipoPadreIndicador tipoPadre;    

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public IndicadorDTO getIndicadorDTO() {
        if (indicadorDTO == null) {
            indicadorDTO = new IndicadorDTO();
        }
        return indicadorDTO;
    }

    public void setIndicadorDTO(IndicadorDTO indicadorDTO) {
        this.indicadorDTO = indicadorDTO;
    }

    public TipoPadreIndicador getTipoPadre() {
        return tipoPadre;
    }

    public void setTipoPadre(TipoPadreIndicador tipoPadre) {
        this.tipoPadre = tipoPadre;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("ValorIndicadorDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", indicadorDTO = ").append(indicadorDTO).
                append(", valor = ").append(valor).
                append(", tipoPadre = ").append(tipoPadre).
                append('}').toString();
    }
}

