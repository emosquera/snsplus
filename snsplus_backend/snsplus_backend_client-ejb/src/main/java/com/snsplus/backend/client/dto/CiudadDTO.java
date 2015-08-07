/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author conamerica15
 */
@XmlRootElement(name = "ciudad")
public class CiudadDTO extends GeneralDTO{
    private String ciudad;
    private String abreviatura;
    @XmlTransient
    private EstadoDTO estadoDTO;
    private List<TerminalDTO> terminalDTOs;

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public EstadoDTO getEstadoDTO() {
        if (estadoDTO == null){
            estadoDTO = new EstadoDTO();
        }
        return estadoDTO;
    }

    public void setEstadoDTO(EstadoDTO estadoDTO) {
        this.estadoDTO = estadoDTO;
    }

    public List<TerminalDTO> getTerminalDTOs() {
        if (terminalDTOs == null) {
            terminalDTOs = new ArrayList<>();
        }
        return terminalDTOs;
    }

    public void setTerminalDTOs(List<TerminalDTO> terminalDTOs) {
        this.terminalDTOs = terminalDTOs;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("CiudadDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", estado= ").append(estadoDTO).
                append(", ciudad = ").append(ciudad).
                append(", abreviatura = ").append(abreviatura).
                append('}').toString();
    }

    public CiudadDTO() {
    }

    public CiudadDTO(String ciudad, String abreviatura, EstadoDTO estadoDTO) {
        this.ciudad = ciudad;
        this.abreviatura = abreviatura;
        this.estadoDTO = estadoDTO;
    }
    
}
