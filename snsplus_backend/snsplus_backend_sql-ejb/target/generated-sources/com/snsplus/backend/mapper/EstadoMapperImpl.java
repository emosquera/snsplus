package com.snsplus.backend.mapper;

import com.snsplus.backend.client.dto.CiudadDTO;
import com.snsplus.backend.client.dto.EstadoDTO;
import com.snsplus.backend.client.dto.TerminalDTO;
import com.snsplus.backend.model.Ciudad;
import com.snsplus.backend.model.Estado;
import com.snsplus.backend.model.Terminal;
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
public class EstadoMapperImpl implements EstadoMapper {

    @Override
    public EstadoDTO estadoToEstadoDTO(Estado estado) {
        if ( estado == null ) {
            return null;
        }

        EstadoDTO estadoDTO = new EstadoDTO();

        estadoDTO.setPaisDTO( estado.getPais() );
        estadoDTO.setCiudadDTOs( ciudadesToCiudadDTOs( estado.getCiudades() ) );
        estadoDTO.setId( estado.getId() );
        estadoDTO.setAbreviatura( estado.getAbreviatura() );
        estadoDTO.setEstado( estado.getEstado() );
        estadoDTO.setFechaRegistro( estado.getFechaRegistro() );
        estadoDTO.setFechaModificacion( estado.getFechaModificacion() );
        estadoDTO.setVersion( estado.getVersion() );

        return estadoDTO;
    }

    @Override
    public List<CiudadDTO> ciudadesToCiudadDTOs(List<Ciudad> ciudades) {
        if ( ciudades == null ) {
            return null;
        }

        List<CiudadDTO> list_ = new ArrayList<CiudadDTO>();

        for ( Ciudad ciudad : ciudades ) {
            list_.add( ciudadToCiudadDTO( ciudad ) );
        }

        return list_;
    }

    @Override
    public CiudadDTO ciudadToCiudadDTO(Ciudad ciudad) {
        if ( ciudad == null ) {
            return null;
        }

        CiudadDTO ciudadDTO_ = new CiudadDTO();

        ciudadDTO_.setTerminalDTOs( terminalesToTerminalDTOs( ciudad.getTerminales() ) );
        ciudadDTO_.setId( ciudad.getId() );
        ciudadDTO_.setAbreviatura( ciudad.getAbreviatura() );
        ciudadDTO_.setCiudad( ciudad.getCiudad() );
        ciudadDTO_.setEstadoDTO( ciudad.getEstadoDTO() );
        ciudadDTO_.setFechaRegistro( ciudad.getFechaRegistro() );
        ciudadDTO_.setFechaModificacion( ciudad.getFechaModificacion() );
        ciudadDTO_.setVersion( ciudad.getVersion() );

        return ciudadDTO_;
    }

    @Override
    public TerminalDTO terminalToTerminalDTO(Terminal terminal) {
        if ( terminal == null ) {
            return null;
        }

        TerminalDTO terminalDTO = new TerminalDTO();

        terminalDTO.setNombre( terminal.getNombre() );
        terminalDTO.setId( terminal.getId() );
        terminalDTO.setAbreviatura( terminal.getAbreviatura() );
        terminalDTO.setFechaRegistro( terminal.getFechaRegistro() );
        terminalDTO.setFechaModificacion( terminal.getFechaModificacion() );
        terminalDTO.setCiudadDTO( terminal.getCiudadDTO() );
        terminalDTO.setVersion( terminal.getVersion() );

        return terminalDTO;
    }

    @Override
    public List<TerminalDTO> terminalesToTerminalDTOs(List<Terminal> terminales) {
        if ( terminales == null ) {
            return null;
        }

        List<TerminalDTO> list_ = new ArrayList<TerminalDTO>();

        for ( Terminal terminal : terminales ) {
            list_.add( terminalToTerminalDTO( terminal ) );
        }

        return list_;
    }

}
