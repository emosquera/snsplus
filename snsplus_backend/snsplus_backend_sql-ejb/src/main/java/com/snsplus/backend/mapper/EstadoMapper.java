/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.mapper;

import com.snsplus.backend.client.dto.CiudadDTO;
import com.snsplus.backend.client.dto.EstadoDTO;
import com.snsplus.backend.client.dto.TerminalDTO;
import com.snsplus.backend.model.Ciudad;
import com.snsplus.backend.model.Estado;
import com.snsplus.backend.model.Terminal;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author conamerica15
 */
@Mapper(componentModel = "cdi")
public interface EstadoMapper {

    @Mappings({
        @Mapping(source = "ciudades", target = "ciudadDTOs"),
        @Mapping(source = "pais", target = "paisDTO")})
    EstadoDTO estadoToEstadoDTO(Estado estado);
    
    List<CiudadDTO> ciudadesToCiudadDTOs (List<Ciudad> ciudades);
    
    @Mappings({
        @Mapping(source = "terminales", target = "terminalDTOs")})
    CiudadDTO ciudadToCiudadDTO(Ciudad ciudad);
    
    TerminalDTO terminalToTerminalDTO(Terminal terminal);
    
    List<TerminalDTO> terminalesToTerminalDTOs(List<Terminal> terminales);
}
