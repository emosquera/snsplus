/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.mapper;

import com.snsplus.backend.client.dto.EmpresaDTO;
import com.snsplus.backend.client.dto.EquipoSupervivenciaDTO;
import com.snsplus.backend.client.dto.MarcaUnidadTransporteDTO;
import com.snsplus.backend.client.dto.ModeloUnidadTransporteDTO;
import com.snsplus.backend.client.dto.TipoUnidadTransporteDTO;
import com.snsplus.backend.client.dto.UnidadTransporteDTO;
import com.snsplus.backend.model.Empresa;
import com.snsplus.backend.model.EquipoSupervivencia;
import com.snsplus.backend.model.MarcaUnidadTransporte;
import com.snsplus.backend.model.ModeloUnidadTransporte;
import com.snsplus.backend.model.TipoUnidadTransporte;
import com.snsplus.backend.model.UnidadTransporte;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author conamerica15
 */
@Mapper(componentModel = "cdi")
public interface UnidadTransporteMapper {
    
    List<UnidadTransporteDTO> unidadesTransporteToUnidadTransporteDTOs (List<UnidadTransporte> unidadesTrasporte);
    
    @Mappings({
        @Mapping(source = "rutas", target = "rutaDTOs"),
        @Mapping(source = "equiposSupervivencia", target = "equipoSupervivenciaDTOs")
    })
    UnidadTransporteDTO unidadTransporteToUnidadTransporteDTO (UnidadTransporte unidadTrasporte);
    
    List<EquipoSupervivenciaDTO> equiposSupervivenciaToEquipoSupervivenciaDTOs(List<EquipoSupervivencia> equiposSupervivencia);
    
    EquipoSupervivenciaDTO equipoSupervivenciaToEquipoSupervivenciaDTO(EquipoSupervivencia equipoSupervivencia);
    
    MarcaUnidadTransporteDTO marcaUnidadTransporteToMarcaUnidadTransporteDTO(MarcaUnidadTransporte marcaUnidadTransporte);
    
    ModeloUnidadTransporteDTO modeloUnidadTransporteToModeloUnidadTrasporteDTO(ModeloUnidadTransporte modeloUnidadTransporte);
    
    TipoUnidadTransporteDTO tipoUnidadTransporteToTipoUnidadTransporteDTO(TipoUnidadTransporte tipoUnidadTransporte);
    
    EmpresaDTO empresaToEmpresaDTO(Empresa empresa);
}
