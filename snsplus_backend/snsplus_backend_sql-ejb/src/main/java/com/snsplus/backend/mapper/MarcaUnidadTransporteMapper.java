/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.mapper;

import com.snsplus.backend.client.dto.MarcaUnidadTransporteDTO;
import com.snsplus.backend.model.MarcaUnidadTransporte;
import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author conamerica15
 */
@Mapper(componentModel = "cdi")
public interface MarcaUnidadTransporteMapper {
    
    List<MarcaUnidadTransporteDTO> marcasUnidadTransporteToMarcaUnidadTransporteDTOs(List<MarcaUnidadTransporte> marcasUnidadTransporte);
    
    MarcaUnidadTransporteDTO marcaUnidadTransporteToMarcaUnidadTransporteDTO(MarcaUnidadTransporte marcaUnidadTransporte);
}
