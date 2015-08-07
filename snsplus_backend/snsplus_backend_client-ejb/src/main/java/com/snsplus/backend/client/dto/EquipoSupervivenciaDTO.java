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
@XmlRootElement(name = "equipo_supervivencia")
public class EquipoSupervivenciaDTO extends GeneralDTO{
    private String equipo;
    private List<UnidadTransporteDTO> unidadTransporteDTOs;
    private List<VueloDTO> vueloDTOs;

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public List<UnidadTransporteDTO> getUnidadTransporteDTOs() {
        if (unidadTransporteDTOs == null){
            unidadTransporteDTOs = new ArrayList<>();
        }
        return unidadTransporteDTOs;
    }

    public void setUnidadTransporteDTOs(List<UnidadTransporteDTO> unidadTransporteDTOs) {
        this.unidadTransporteDTOs = unidadTransporteDTOs;
    }

    public List<VueloDTO> getVueloDTOs() {
        if (vueloDTOs == null) {
            vueloDTOs = new ArrayList<>();
        }
        return vueloDTOs;
    }

    public void setVueloDTOs(List<VueloDTO> vueloDTOs) {
        this.vueloDTOs = vueloDTOs;
    }
    
    
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("EquipoSupervivenciaDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", equipo = ").append(equipo).
                append('}').toString();
    }
    
}
