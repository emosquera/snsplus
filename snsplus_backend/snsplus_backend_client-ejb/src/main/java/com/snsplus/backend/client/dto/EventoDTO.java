/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author conamerica15
 */
@XmlRootElement(name = "evento")
public class EventoDTO extends GeneralDTO{
    private String descripcion;
    private OperacionDTO operacionDTO;
    private List<IndicadorEventoDTO> indicadorEventoDTO;
    private List<CargoDTO> cargoDTOs;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public OperacionDTO getOperacionDTO() {
        if (operacionDTO == null){
            operacionDTO = new OperacionDTO();
        }
        return operacionDTO;
    }

    public void setOperacionDTO(OperacionDTO operacionDTO) {
        this.operacionDTO = operacionDTO;
    }

    public List<IndicadorEventoDTO> getIndicadorEventoDTO() {
        if (indicadorEventoDTO == null) {
            indicadorEventoDTO = new ArrayList<>();
        }
        return indicadorEventoDTO;
    }

    public void setIndicadorEventoDTO(List<IndicadorEventoDTO> indicadorEventoDTO) {
        this.indicadorEventoDTO = indicadorEventoDTO;
    }

    public List<CargoDTO> getCargoDTOs() {
        if (cargoDTOs == null) {
            cargoDTOs = new ArrayList<>();
        }
        return cargoDTOs;
    }

    public void setCargoDTOs(List<CargoDTO> cargoDTOs) {
        this.cargoDTOs = cargoDTOs;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("EventoDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", descripcion = ").append(descripcion).
                append(", operacion = ").append(operacionDTO).
                append('}').toString();
    }
}
