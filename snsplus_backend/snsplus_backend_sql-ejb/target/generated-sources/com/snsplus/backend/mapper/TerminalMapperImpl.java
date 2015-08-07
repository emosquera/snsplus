package com.snsplus.backend.mapper;

import com.snsplus.backend.client.dto.TerminalDTO;
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
public class TerminalMapperImpl implements TerminalMapper {

    @Override
    public TerminalDTO terminalToTerminalDTO(Terminal terminal) {
        if ( terminal == null ) {
            return null;
        }

        TerminalDTO terminalDTO = new TerminalDTO();

        terminalDTO.setCiudadDTO( terminal.getCiudad() );
        terminalDTO.setNombre( terminal.getNombre() );
        terminalDTO.setId( terminal.getId() );
        terminalDTO.setAbreviatura( terminal.getAbreviatura() );
        terminalDTO.setFechaRegistro( terminal.getFechaRegistro() );
        terminalDTO.setFechaModificacion( terminal.getFechaModificacion() );
        terminalDTO.setVersion( terminal.getVersion() );

        return terminalDTO;
    }

    @Override
    public List<TerminalDTO> terminalesToTerminalDTOs(List<Terminal> terminales) {
        if ( terminales == null ) {
            return null;
        }

        List<TerminalDTO> list = new ArrayList<TerminalDTO>();

        for ( Terminal terminal : terminales ) {
            list.add( terminalToTerminalDTO( terminal ) );
        }

        return list;
    }

}
