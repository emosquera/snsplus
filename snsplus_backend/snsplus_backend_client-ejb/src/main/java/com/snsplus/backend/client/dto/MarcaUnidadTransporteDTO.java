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
@XmlRootElement(name = "marca_unidad_transporte")
public class MarcaUnidadTransporteDTO extends GeneralDTO{
    private String abreviatura;
    private String descripcion;
    private String fabricante;
    private List<UnidadTransporteDTO> unidadTransporteDTOs;

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public List<UnidadTransporteDTO> getUnidadTransporteDTOs() {
        if (unidadTransporteDTOs == null) {
            unidadTransporteDTOs = new ArrayList<>();
        }
        return unidadTransporteDTOs;
    }

    public void setUnidadTransporteDTOs(List<UnidadTransporteDTO> unidadTransporteDTOs) {
        this.unidadTransporteDTOs = unidadTransporteDTOs;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("MarcaUnidadTransporteDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", abreviatura = ").append(abreviatura).
                append(", descripcion = ").append(descripcion).
                append(", fabricante = ").append(fabricante).
                append('}').toString();
    }
    
}
