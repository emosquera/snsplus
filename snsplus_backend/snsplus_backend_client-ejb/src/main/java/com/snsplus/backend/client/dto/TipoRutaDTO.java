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
@XmlRootElement(name = "tipo_ruta")
public class TipoRutaDTO extends GeneralDTO{
    private String tipoRuta;
    private String abreviatura;
    private List<RutaDTO> rutaDTOs;

    public String getTipoRuta() {
        return tipoRuta;
    }

    public void setTipoRuta(String tipoRuta) {
        this.tipoRuta = tipoRuta;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public List<RutaDTO> getRutaDTOs() {
        if (rutaDTOs == null) {
            rutaDTOs = new ArrayList<>();
        }
        return rutaDTOs;
    }

    public void setRutaDTOs(List<RutaDTO> rutaDTOs) {
        this.rutaDTOs = rutaDTOs;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("TipoRutaDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", tipoRuta = ").append(tipoRuta).
                append(", abreviatura = ").append(abreviatura).
                append('}').toString();
    }
    
}
