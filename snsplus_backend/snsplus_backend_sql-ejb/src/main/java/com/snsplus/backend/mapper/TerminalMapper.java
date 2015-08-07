/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.mapper;

import com.snsplus.backend.client.dto.TerminalDTO;
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
public interface TerminalMapper {
    
    @Mappings({
        @Mapping(source = "ciudad", target = "ciudadDTO")})
    TerminalDTO terminalToTerminalDTO(Terminal terminal);
    
    List<TerminalDTO> terminalesToTerminalDTOs(List<Terminal> terminales);
}
