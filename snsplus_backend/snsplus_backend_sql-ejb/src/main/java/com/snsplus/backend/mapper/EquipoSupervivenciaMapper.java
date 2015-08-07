/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.mapper;

import com.snsplus.backend.client.dto.EquipoSupervivenciaDTO;
import com.snsplus.backend.model.EquipoSupervivencia;
import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author conamerica15
 */
@Mapper(componentModel = "cdi")
public interface EquipoSupervivenciaMapper {
    
    List<EquipoSupervivenciaDTO> equiposSupervivenciaToEquipoSupervivenciaDTOs (List<EquipoSupervivencia> equipoSUpervivenciaDTO);
    
   
    EquipoSupervivenciaDTO equipoSupervivenciaToEquipoSupervivenciaDTO(EquipoSupervivencia equipoSupervivencia);
}
