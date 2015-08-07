package com.snsplus.backend.mapper;

import com.snsplus.backend.client.dto.EmpresaDTO;
import com.snsplus.backend.client.dto.EquipoSupervivenciaDTO;
import com.snsplus.backend.client.dto.MarcaUnidadTransporteDTO;
import com.snsplus.backend.client.dto.ModeloUnidadTransporteDTO;
import com.snsplus.backend.client.dto.PersonaDTO;
import com.snsplus.backend.client.dto.RutaDTO;
import com.snsplus.backend.client.dto.TipoUnidadTransporteDTO;
import com.snsplus.backend.client.dto.UnidadTransporteDTO;
import com.snsplus.backend.client.dto.VueloDTO;
import com.snsplus.backend.model.Empresa;
import com.snsplus.backend.model.EquipoSupervivencia;
import com.snsplus.backend.model.MarcaUnidadTransporte;
import com.snsplus.backend.model.ModeloUnidadTransporte;
import com.snsplus.backend.model.TipoUnidadTransporte;
import com.snsplus.backend.model.UnidadTransporte;
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
public class UnidadTransporteMapperImpl implements UnidadTransporteMapper {

    @Override
    public List<UnidadTransporteDTO> unidadesTransporteToUnidadTransporteDTOs(List<UnidadTransporte> unidadesTrasporte) {
        if ( unidadesTrasporte == null ) {
            return null;
        }

        List<UnidadTransporteDTO> list = new ArrayList<UnidadTransporteDTO>();

        for ( UnidadTransporte unidadTransporte : unidadesTrasporte ) {
            list.add( unidadTransporteToUnidadTransporteDTO( unidadTransporte ) );
        }

        return list;
    }

    @Override
    public UnidadTransporteDTO unidadTransporteToUnidadTransporteDTO(UnidadTransporte unidadTrasporte) {
        if ( unidadTrasporte == null ) {
            return null;
        }

        UnidadTransporteDTO unidadTransporteDTO_ = new UnidadTransporteDTO();

        if ( unidadTrasporte.getRutas() != null ) {
            unidadTransporteDTO_.setRutaDTOs( new ArrayList<RutaDTO>( unidadTrasporte.getRutas() ) );
        }
        unidadTransporteDTO_.setEquipoSupervivenciaDTOs( equiposSupervivenciaToEquipoSupervivenciaDTOs( unidadTrasporte.getEquiposSupervivencia() ) );
        unidadTransporteDTO_.setKilosPermitidos( unidadTrasporte.getKilosPermitidos() );
        unidadTransporteDTO_.setMarcaUnidadTransporteDTO( unidadTrasporte.getMarcaUnidadTransporteDTO() );
        unidadTransporteDTO_.setFechaRegistro( unidadTrasporte.getFechaRegistro() );
        unidadTransporteDTO_.setEmpresaDTO( unidadTrasporte.getEmpresaDTO() );
        unidadTransporteDTO_.setVencimientoCertificado( unidadTrasporte.getVencimientoCertificado() );
        unidadTransporteDTO_.setMatricula( unidadTrasporte.getMatricula() );
        unidadTransporteDTO_.setVersion( unidadTrasporte.getVersion() );
        unidadTransporteDTO_.setId( unidadTrasporte.getId() );
        unidadTransporteDTO_.setTipoUnidadTransporteDTO( unidadTrasporte.getTipoUnidadTransporteDTO() );
        unidadTransporteDTO_.setColor( unidadTrasporte.getColor() );
        unidadTransporteDTO_.setCantidadPasajerosPermitidos( unidadTrasporte.getCantidadPasajerosPermitidos() );
        unidadTransporteDTO_.setPropietario( unidadTrasporte.getPropietario() );
        unidadTransporteDTO_.setFechaModificacion( unidadTrasporte.getFechaModificacion() );
        unidadTransporteDTO_.setModeloUnidadTransporteDTO( unidadTrasporte.getModeloUnidadTransporteDTO() );
        unidadTransporteDTO_.setSerial( unidadTrasporte.getSerial() );

        return unidadTransporteDTO_;
    }

    @Override
    public List<EquipoSupervivenciaDTO> equiposSupervivenciaToEquipoSupervivenciaDTOs(List<EquipoSupervivencia> equiposSupervivencia) {
        if ( equiposSupervivencia == null ) {
            return null;
        }

        List<EquipoSupervivenciaDTO> list_ = new ArrayList<EquipoSupervivenciaDTO>();

        for ( EquipoSupervivencia equipoSupervivencia : equiposSupervivencia ) {
            list_.add( equipoSupervivenciaToEquipoSupervivenciaDTO( equipoSupervivencia ) );
        }

        return list_;
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

    @Override
    public MarcaUnidadTransporteDTO marcaUnidadTransporteToMarcaUnidadTransporteDTO(MarcaUnidadTransporte marcaUnidadTransporte) {
        if ( marcaUnidadTransporte == null ) {
            return null;
        }

        MarcaUnidadTransporteDTO marcaUnidadTransporteDTO = new MarcaUnidadTransporteDTO();

        marcaUnidadTransporteDTO.setId( marcaUnidadTransporte.getId() );
        marcaUnidadTransporteDTO.setAbreviatura( marcaUnidadTransporte.getAbreviatura() );
        marcaUnidadTransporteDTO.setDescripcion( marcaUnidadTransporte.getDescripcion() );
        if ( marcaUnidadTransporte.getUnidadTransporteDTOs() != null ) {
            marcaUnidadTransporteDTO.setUnidadTransporteDTOs( new ArrayList<UnidadTransporteDTO>( marcaUnidadTransporte.getUnidadTransporteDTOs() ) );
        }
        marcaUnidadTransporteDTO.setFechaRegistro( marcaUnidadTransporte.getFechaRegistro() );
        marcaUnidadTransporteDTO.setFechaModificacion( marcaUnidadTransporte.getFechaModificacion() );
        marcaUnidadTransporteDTO.setFabricante( marcaUnidadTransporte.getFabricante() );
        marcaUnidadTransporteDTO.setVersion( marcaUnidadTransporte.getVersion() );

        return marcaUnidadTransporteDTO;
    }

    @Override
    public ModeloUnidadTransporteDTO modeloUnidadTransporteToModeloUnidadTrasporteDTO(ModeloUnidadTransporte modeloUnidadTransporte) {
        if ( modeloUnidadTransporte == null ) {
            return null;
        }

        ModeloUnidadTransporteDTO modeloUnidadTransporteDTO = new ModeloUnidadTransporteDTO();

        modeloUnidadTransporteDTO.setId( modeloUnidadTransporte.getId() );
        modeloUnidadTransporteDTO.setAbreviatura( modeloUnidadTransporte.getAbreviatura() );
        modeloUnidadTransporteDTO.setDescripcion( modeloUnidadTransporte.getDescripcion() );
        if ( modeloUnidadTransporte.getUnidadTransporteDTOs() != null ) {
            modeloUnidadTransporteDTO.setUnidadTransporteDTOs( new ArrayList<UnidadTransporteDTO>( modeloUnidadTransporte.getUnidadTransporteDTOs() ) );
        }
        modeloUnidadTransporteDTO.setFechaRegistro( modeloUnidadTransporte.getFechaRegistro() );
        modeloUnidadTransporteDTO.setFechaModificacion( modeloUnidadTransporte.getFechaModificacion() );
        modeloUnidadTransporteDTO.setVersion( modeloUnidadTransporte.getVersion() );

        return modeloUnidadTransporteDTO;
    }

    @Override
    public TipoUnidadTransporteDTO tipoUnidadTransporteToTipoUnidadTransporteDTO(TipoUnidadTransporte tipoUnidadTransporte) {
        if ( tipoUnidadTransporte == null ) {
            return null;
        }

        TipoUnidadTransporteDTO tipoUnidadTransporteDTO = new TipoUnidadTransporteDTO();

        tipoUnidadTransporteDTO.setId( tipoUnidadTransporte.getId() );
        tipoUnidadTransporteDTO.setDescripcion( tipoUnidadTransporte.getDescripcion() );
        if ( tipoUnidadTransporte.getUnidadTransporteDTOs() != null ) {
            tipoUnidadTransporteDTO.setUnidadTransporteDTOs( new ArrayList<UnidadTransporteDTO>( tipoUnidadTransporte.getUnidadTransporteDTOs() ) );
        }
        tipoUnidadTransporteDTO.setFechaRegistro( tipoUnidadTransporte.getFechaRegistro() );
        tipoUnidadTransporteDTO.setFechaModificacion( tipoUnidadTransporte.getFechaModificacion() );
        tipoUnidadTransporteDTO.setVersion( tipoUnidadTransporte.getVersion() );

        return tipoUnidadTransporteDTO;
    }

    @Override
    public EmpresaDTO empresaToEmpresaDTO(Empresa empresa) {
        if ( empresa == null ) {
            return null;
        }

        EmpresaDTO empresaDTO = new EmpresaDTO();

        empresaDTO.setNombre( empresa.getNombre() );
        empresaDTO.setId( empresa.getId() );
        empresaDTO.setRif( empresa.getRif() );
        empresaDTO.setFechaRegistro( empresa.getFechaRegistro() );
        empresaDTO.setFechaModificacion( empresa.getFechaModificacion() );
        if ( empresa.getPersonaDTOs() != null ) {
            empresaDTO.setPersonaDTOs( new ArrayList<PersonaDTO>( empresa.getPersonaDTOs() ) );
        }
        empresaDTO.setDireccionPrincipal( empresa.getDireccionPrincipal() );
        empresaDTO.setVersion( empresa.getVersion() );

        return empresaDTO;
    }

}
