/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.dto;

import com.snsplus.backend.client.enums.TipoFase;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author conamerica15
 */
@XmlRootElement(name = "fase")
public class FaseDTO extends GeneralDTO{
    private String descripcion;
    private List<CargoDTO> cargoDTOs;
    private TipoFase tipo;
    private OperacionDTO operacionDTO;
    private int orden;
    private List<IndicadorFaseDTO> indicadorFaseDTO;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public TipoFase getTipo() {
        return tipo;
    }

    public void setTipo(TipoFase tipo) {
        this.tipo = tipo;
    }

    public OperacionDTO getOperacionDTO() {
        if (operacionDTO == null) {
            operacionDTO = new OperacionDTO();
        }
        return operacionDTO;
    }

    public void setOperacionDTO(OperacionDTO operacionDTO) {
        this.operacionDTO = operacionDTO;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public List<IndicadorFaseDTO> getIndicadorFaseDTO() {
        if (indicadorFaseDTO == null) {
            indicadorFaseDTO = new ArrayList<>();
        }
        return indicadorFaseDTO;
    }

    public void setIndicadorFaseDTO(List<IndicadorFaseDTO> indicadorFaseDTO) {
        this.indicadorFaseDTO = indicadorFaseDTO;
    }

    @Override
    public String toString() {
        return new StringBuilder().
                append("FaseDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", descripcion = ").append(descripcion).
                append(", tipo = ").append(tipo).
                append(", operacion = ").append(operacionDTO).
                append(", orden = ").append(orden).
                append('}').toString();
    }
    
    
}
