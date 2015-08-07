package com.snsplus.backend.mapper;

import com.snsplus.backend.client.dto.EmpresaDTO;
import com.snsplus.backend.client.dto.PersonaDTO;
import com.snsplus.backend.model.Empresa;
import java.util.ArrayList;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2015-06-19T10:45:07-0430",
    comments = "version: 1.0.0.Beta4, compiler: javac, environment: Java 1.7.0_80 (Oracle Corporation)"
)
@ApplicationScoped
public class EmpresaMapperImpl implements EmpresaMapper {

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
