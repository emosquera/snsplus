/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.dto;

import com.snsplus.backend.client.enums.EstatusFaseEvento;
import com.snsplus.backend.client.enums.TipoOperacion;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author conamerica15
 */
@XmlRootElement(name = "evento_operacion")
public class EventoOperacionDTO extends GeneralDTO{
    private EventoDTO eventoDTO;
    private TipoOperacion tipoPadre;
    private EstatusFaseEvento estatus;
    private List<ValorIndicadorEventoDTO> valorIndicadorDTOs;

    public EventoDTO getEventoDTO() {
        if (eventoDTO == null) {
            eventoDTO = new EventoDTO();
        }
        return eventoDTO;
    }

    public void setEventoDTO(EventoDTO eventoDTO) {
        this.eventoDTO = eventoDTO;
    }

    public TipoOperacion getTipoPadre() {
        return tipoPadre;
    }

    public void setTipoPadre(TipoOperacion tipoPadre) {
        this.tipoPadre = tipoPadre;
    }

    public EstatusFaseEvento getEstatus() {
        return estatus;
    }

    public void setEstatus(EstatusFaseEvento estatus) {
        this.estatus = estatus;
    }

    public List<ValorIndicadorEventoDTO> getValorIndicadorDTOs() {
        if (valorIndicadorDTOs == null) {
            valorIndicadorDTOs = new ArrayList<>();
        }
        return valorIndicadorDTOs;
    }

    public void setValorIndicadorDTOs(List<ValorIndicadorEventoDTO> valorIndicadorDTOs) {
        this.valorIndicadorDTOs = valorIndicadorDTOs;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("FaseOperacionDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", eventoDTO = ").append(eventoDTO).
                append(", tipoPadre = ").append(tipoPadre).
                append(", estatus = ").append(estatus).                
                append('}').toString();
    }
    
}
