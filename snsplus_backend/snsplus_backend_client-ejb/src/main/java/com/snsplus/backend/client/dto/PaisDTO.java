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
@XmlRootElement(name = "pais")
public class PaisDTO extends GeneralDTO{
    private String pais;
    private String abreviatura;    
    private List<EstadoDTO> estadoDTOs;

    public PaisDTO() {
    }

    public PaisDTO(String pais, String abreviatura) {
        this.pais = pais;
        this.abreviatura = abreviatura;
    }

    public PaisDTO(PaisDTO p) {
        id = p.id;
        pais = p.pais;
        abreviatura = p.abreviatura;
        estadoDTOs = p.estadoDTOs;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public List<EstadoDTO> getEstadoDTOs() {
        if (estadoDTOs == null) {
            estadoDTOs = new ArrayList<>();
        }
        return estadoDTOs;
    }

    public void setEstadoDTOs(List<EstadoDTO> estadoDTOs) {
        this.estadoDTOs = estadoDTOs;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("PaisDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", pais = ").append(pais).
                append(", abreviatura = ").append(abreviatura).
                append('}').toString();
    }
    
}
