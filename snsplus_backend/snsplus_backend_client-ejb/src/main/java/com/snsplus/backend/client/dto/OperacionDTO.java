/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.dto;

import com.snsplus.backend.client.enums.EstatusOperacion;
import com.snsplus.backend.client.enums.TipoOperacion;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author conamerica15
 */
@XmlRootElement(name = "operacion")
public class OperacionDTO extends GeneralDTO{
    private String descripcion;
    private TipoOperacion tipo;
    private EstatusOperacion estatus;
    private List<FaseDTO> faseDTOs;
    private List<EventoDTO> eventoDTOs;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoOperacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoOperacion tipo) {
        this.tipo = tipo;
    }

    public EstatusOperacion getEstatus() {
        return estatus;
    }

    public void setEstatus(EstatusOperacion estatus) {
        this.estatus = estatus;
    }

    public List<FaseDTO> getFaseDTOs() {
        if (faseDTOs == null) {
            faseDTOs = new ArrayList<>();
        }
        return faseDTOs;
    }

    public void setFaseDTOs(List<FaseDTO> faseDTOs) {
        this.faseDTOs = faseDTOs;
    }

    public List<EventoDTO> getEventoDTOs() {
        if (eventoDTOs == null) {
            eventoDTOs = new ArrayList<>();
        }
        return eventoDTOs;
    }

    public void setEventoDTOs(List<EventoDTO> eventoDTOs) {
        this.eventoDTOs = eventoDTOs;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("OperacionDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", descripcion = ").append(descripcion).
                append(", tipo = ").append(tipo).
                append(", estatus = ").append(estatus).
                append('}').toString();
    }
}
