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
@XmlRootElement(name = "estado")
public class EstadoDTO extends GeneralDTO{
    private String estado;
    private String abreviatura;
    @XmlTransient
    private PaisDTO paisDTO;
    private List<CiudadDTO> ciudadDTOs;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public PaisDTO getPaisDTO() {
        if (paisDTO == null){
            paisDTO = new PaisDTO();
        }
        return paisDTO;
    }

    public void setPaisDTO(PaisDTO paisDTO) {
        this.paisDTO = paisDTO;
    }

    public List<CiudadDTO> getCiudadDTOs() {
        if (ciudadDTOs == null) {
            ciudadDTOs = new ArrayList<>();
        }
        return ciudadDTOs;
    }

    public void setCiudadDTOs(List<CiudadDTO> ciudadDTOs) {
        this.ciudadDTOs = ciudadDTOs;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("EstadoDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", pais = ").append(paisDTO).
                append(", estado = ").append(estado).
                append(", abreviatura = ").append(abreviatura).
                append('}').toString();
    }

    public EstadoDTO() {
    }

    public EstadoDTO(String estado, String abreviatura, PaisDTO paisDTO) {
        this.estado = estado;
        this.abreviatura = abreviatura;
        this.paisDTO = paisDTO;
    }

    public EstadoDTO(EstadoDTO e) {
        id = e.id;
        abreviatura = e.abreviatura;
        estado = e.estado;
        ciudadDTOs = e.ciudadDTOs;
    }
    
    
}
