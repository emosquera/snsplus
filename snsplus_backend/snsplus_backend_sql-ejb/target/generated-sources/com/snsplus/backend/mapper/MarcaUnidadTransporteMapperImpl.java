package com.snsplus.backend.mapper;

import com.snsplus.backend.client.dto.MarcaUnidadTransporteDTO;
import com.snsplus.backend.client.dto.UnidadTransporteDTO;
import com.snsplus.backend.model.MarcaUnidadTransporte;
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
public class MarcaUnidadTransporteMapperImpl implements MarcaUnidadTransporteMapper {

    @Override
    public List<MarcaUnidadTransporteDTO> marcasUnidadTransporteToMarcaUnidadTransporteDTOs(List<MarcaUnidadTransporte> marcasUnidadTransporte) {
        if ( marcasUnidadTransporte == null ) {
            return null;
        }

        List<MarcaUnidadTransporteDTO> list = new ArrayList<MarcaUnidadTransporteDTO>();

        for ( MarcaUnidadTransporte marcaUnidadTransporte : marcasUnidadTransporte ) {
            list.add( marcaUnidadTransporteToMarcaUnidadTransporteDTO( marcaUnidadTransporte ) );
        }

        return list;
    }

    @Override
    public MarcaUnidadTransporteDTO marcaUnidadTransporteToMarcaUnidadTransporteDTO(MarcaUnidadTransporte marcaUnidadTransporte) {
        if ( marcaUnidadTransporte == null ) {
            return null;
        }

        MarcaUnidadTransporteDTO marcaUnidadTransporteDTO_ = new MarcaUnidadTransporteDTO();

        marcaUnidadTransporteDTO_.setId( marcaUnidadTransporte.getId() );
        marcaUnidadTransporteDTO_.setAbreviatura( marcaUnidadTransporte.getAbreviatura() );
        marcaUnidadTransporteDTO_.setDescripcion( marcaUnidadTransporte.getDescripcion() );
        if ( marcaUnidadTransporte.getUnidadTransporteDTOs() != null ) {
            marcaUnidadTransporteDTO_.setUnidadTransporteDTOs( new ArrayList<UnidadTransporteDTO>( marcaUnidadTransporte.getUnidadTransporteDTOs() ) );
        }
        marcaUnidadTransporteDTO_.setFechaRegistro( marcaUnidadTransporte.getFechaRegistro() );
        marcaUnidadTransporteDTO_.setFechaModificacion( marcaUnidadTransporte.getFechaModificacion() );
        marcaUnidadTransporteDTO_.setFabricante( marcaUnidadTransporte.getFabricante() );
        marcaUnidadTransporteDTO_.setVersion( marcaUnidadTransporte.getVersion() );

        return marcaUnidadTransporteDTO_;
    }

}
