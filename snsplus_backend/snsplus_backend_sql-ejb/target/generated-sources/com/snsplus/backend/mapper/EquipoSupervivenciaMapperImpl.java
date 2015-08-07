package com.snsplus.backend.mapper;

import com.snsplus.backend.client.dto.EquipoSupervivenciaDTO;
import com.snsplus.backend.client.dto.UnidadTransporteDTO;
import com.snsplus.backend.client.dto.VueloDTO;
import com.snsplus.backend.model.EquipoSupervivencia;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2015-06-19T10:45:07-0430",
    comments = "version: 1.0.0.Beta4, compiler: javac, environment: Java 1.7.0_80 (Oracle Corporation)"
)
@ApplicationScoped
public class EquipoSupervivenciaMapperImpl implements EquipoSupervivenciaMapper {

    @Override
    public List<EquipoSupervivenciaDTO> equiposSupervivenciaToEquipoSupervivenciaDTOs(List<EquipoSupervivencia> equipoSUpervivenciaDTO) {
        if ( equipoSUpervivenciaDTO == null ) {
            return null;
        }

        List<EquipoSupervivenciaDTO> list = new ArrayList<EquipoSupervivenciaDTO>();

        for ( EquipoSupervivencia equipoSupervivencia : equipoSUpervivenciaDTO ) {
            list.add( equipoSupervivenciaToEquipoSupervivenciaDTO( equipoSupervivencia ) );
        }

        return list;
    }

    @Override
    public EquipoSupervivenciaDTO equipoSupervivenciaToEquipoSupervivenciaDTO(EquipoSupervivencia equipoSupervivencia) {
        if ( equipoSupervivencia == null ) {
            return null;
        }

        EquipoSupervivenciaDTO equipoSupervivenciaDTO_ = new EquipoSupervivenciaDTO();

        equipoSupervivenciaDTO_.setEquipo( equipoSupervivencia.getEquipo() );
        equipoSupervivenciaDTO_.setId( equipoSupervivencia.getId() );
        if ( equipoSupervivencia.getVueloDTOs() != null ) {
            equipoSupervivenciaDTO_.setVueloDTOs( new ArrayList<VueloDTO>( equipoSupervivencia.getVueloDTOs() ) );
        }
        if ( equipoSupervivencia.getUnidadTransporteDTOs() != null ) {
            equipoSupervivenciaDTO_.setUnidadTransporteDTOs( new ArrayList<UnidadTransporteDTO>( equipoSupervivencia.getUnidadTransporteDTOs() ) );
        }
        equipoSupervivenciaDTO_.setFechaRegistro( equipoSupervivencia.getFechaRegistro() );
        equipoSupervivenciaDTO_.setFechaModificacion( equipoSupervivencia.getFechaModificacion() );
        equipoSupervivenciaDTO_.setVersion( equipoSupervivencia.getVersion() );

        return equipoSupervivenciaDTO_;
    }

}
