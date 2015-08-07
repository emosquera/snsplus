package com.snsplus.backend.mapper;

import com.snsplus.backend.client.dto.TipoUnidadTransporteDTO;
import com.snsplus.backend.client.dto.UnidadTransporteDTO;
import com.snsplus.backend.model.TipoUnidadTransporte;
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
public class TipoUnidadTransporteMapperImpl implements TipoUnidadTransporteMapper {

    @Override
    public List<TipoUnidadTransporteDTO> tiposUnidadTransporteToTipoUnidadTransporteDTOs(List<TipoUnidadTransporte> tiposUnidadTrasnporte) {
        if ( tiposUnidadTrasnporte == null ) {
            return null;
        }

        List<TipoUnidadTransporteDTO> list = new ArrayList<TipoUnidadTransporteDTO>();

        for ( TipoUnidadTransporte tipoUnidadTransporte : tiposUnidadTrasnporte ) {
            list.add( tipoUnidadTransporteToTipoUnidadTransporteDTO( tipoUnidadTransporte ) );
        }

        return list;
    }

    @Override
    public TipoUnidadTransporteDTO tipoUnidadTransporteToTipoUnidadTransporteDTO(TipoUnidadTransporte tipoUnidadTrasnporte) {
        if ( tipoUnidadTrasnporte == null ) {
            return null;
        }

        TipoUnidadTransporteDTO tipoUnidadTransporteDTO_ = new TipoUnidadTransporteDTO();

        tipoUnidadTransporteDTO_.setId( tipoUnidadTrasnporte.getId() );
        tipoUnidadTransporteDTO_.setDescripcion( tipoUnidadTrasnporte.getDescripcion() );
        if ( tipoUnidadTrasnporte.getUnidadTransporteDTOs() != null ) {
            tipoUnidadTransporteDTO_.setUnidadTransporteDTOs( new ArrayList<UnidadTransporteDTO>( tipoUnidadTrasnporte.getUnidadTransporteDTOs() ) );
        }
        tipoUnidadTransporteDTO_.setFechaRegistro( tipoUnidadTrasnporte.getFechaRegistro() );
        tipoUnidadTransporteDTO_.setFechaModificacion( tipoUnidadTrasnporte.getFechaModificacion() );
        tipoUnidadTransporteDTO_.setVersion( tipoUnidadTrasnporte.getVersion() );

        return tipoUnidadTransporteDTO_;
    }

}
