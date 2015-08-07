package com.snsplus.backend.mapper;

import com.snsplus.backend.client.dto.ModeloUnidadTransporteDTO;
import com.snsplus.backend.client.dto.UnidadTransporteDTO;
import com.snsplus.backend.model.ModeloUnidadTransporte;
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
public class ModeloUnidadTransporteMapperImpl implements ModeloUnidadTransporteMapper {

    @Override
    public List<ModeloUnidadTransporteDTO> modelosUnidadTransporteToModeloUnidadTransporteDTOs(List<ModeloUnidadTransporte> modelosUnidadTransporte) {
        if ( modelosUnidadTransporte == null ) {
            return null;
        }

        List<ModeloUnidadTransporteDTO> list = new ArrayList<ModeloUnidadTransporteDTO>();

        for ( ModeloUnidadTransporte modeloUnidadTransporte : modelosUnidadTransporte ) {
            list.add( modeloUnidadTransporteToModeloUnidadTransporteDTO( modeloUnidadTransporte ) );
        }

        return list;
    }

    @Override
    public ModeloUnidadTransporteDTO modeloUnidadTransporteToModeloUnidadTransporteDTO(ModeloUnidadTransporte modeloUnidadTransporte) {
        if ( modeloUnidadTransporte == null ) {
            return null;
        }

        ModeloUnidadTransporteDTO modeloUnidadTransporteDTO_ = new ModeloUnidadTransporteDTO();

        modeloUnidadTransporteDTO_.setId( modeloUnidadTransporte.getId() );
        modeloUnidadTransporteDTO_.setAbreviatura( modeloUnidadTransporte.getAbreviatura() );
        modeloUnidadTransporteDTO_.setDescripcion( modeloUnidadTransporte.getDescripcion() );
        if ( modeloUnidadTransporte.getUnidadTransporteDTOs() != null ) {
            modeloUnidadTransporteDTO_.setUnidadTransporteDTOs( new ArrayList<UnidadTransporteDTO>( modeloUnidadTransporte.getUnidadTransporteDTOs() ) );
        }
        modeloUnidadTransporteDTO_.setFechaRegistro( modeloUnidadTransporte.getFechaRegistro() );
        modeloUnidadTransporteDTO_.setFechaModificacion( modeloUnidadTransporte.getFechaModificacion() );
        modeloUnidadTransporteDTO_.setVersion( modeloUnidadTransporte.getVersion() );

        return modeloUnidadTransporteDTO_;
    }

}
