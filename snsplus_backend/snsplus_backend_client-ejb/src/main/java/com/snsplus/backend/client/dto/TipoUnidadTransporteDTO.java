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
@XmlRootElement(name = "tipo_unidad_transporte")
public class TipoUnidadTransporteDTO extends GeneralDTO {

    private String descripcion;
    private List<UnidadTransporteDTO> unidadTransporteDTOs;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<UnidadTransporteDTO> getUnidadTransporteDTOs() {
        if (unidadTransporteDTOs == null) {
            unidadTransporteDTOs = new ArrayList<>();
        }
        return unidadTransporteDTOs;
    }

    public void setUnidadTransporteDTOs(List<UnidadTransporteDTO> UnidadTransporteDTOs) {
        this.unidadTransporteDTOs = UnidadTransporteDTOs;
    }

    @Override
    public String toString() {
        return new StringBuilder().
                append("TipoUnidadTransporteDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", descripcion = ").append(descripcion).
                append('}').toString();
    }
}
