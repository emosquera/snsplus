package com.snsplus.backend.mapper;

import com.snsplus.backend.client.dto.CiudadDTO;
import com.snsplus.backend.client.dto.TerminalDTO;
import com.snsplus.backend.model.Ciudad;
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
public class CiudadMapperImpl implements CiudadMapper {

    @Override
    public CiudadDTO ciudadToCiudadDTO(Ciudad ciudad) {
        if ( ciudad == null ) {
            return null;
        }

        CiudadDTO ciudadDTO = new CiudadDTO();

        ciudadDTO.setEstadoDTO( ciudad.getEstado() );
        ciudadDTO.setTerminalDTOs( terminalesToTerminalDTOs( ciudad.getTerminales() ) );
        ciudadDTO.setId( ciudad.getId() );
        ciudadDTO.setAbreviatura( ciudad.getAbreviatura() );
        ciudadDTO.setCiudad( ciudad.getCiudad() );
        ciudadDTO.setFechaRegistro( ciudad.getFechaRegistro() );
        ciudadDTO.setFechaModificacion( ciudad.getFechaModificacion() );
        ciudadDTO.setVersion( ciudad.getVersion() );

        return ciudadDTO;
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

    @Override
    public TerminalDTO terminalToTerminalDTO(Terminal terminal) {
        if ( terminal == null ) {
            return null;
        }

        TerminalDTO terminalDTO_ = new TerminalDTO();

        terminalDTO_.setNombre( terminal.getNombre() );
        terminalDTO_.setId( terminal.getId() );
        terminalDTO_.setAbreviatura( terminal.getAbreviatura() );
        terminalDTO_.setFechaRegistro( terminal.getFechaRegistro() );
        terminalDTO_.setFechaModificacion( terminal.getFechaModificacion() );
        terminalDTO_.setCiudadDTO( terminal.getCiudadDTO() );
        terminalDTO_.setVersion( terminal.getVersion() );

        return terminalDTO_;
    }

}
