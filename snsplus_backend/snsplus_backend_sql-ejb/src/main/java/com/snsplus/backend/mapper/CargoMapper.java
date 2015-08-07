/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.mapper;

import com.snsplus.backend.client.dto.CargoDTO;
import com.snsplus.backend.client.dto.EventoDTO;
import com.snsplus.backend.client.dto.PersonaDTO;
import com.snsplus.backend.client.dto.TripulanteDTO;
import com.snsplus.backend.model.Cargo;
import com.snsplus.backend.model.Evento;
import com.snsplus.backend.model.Persona;
import com.snsplus.backend.model.Tripulante;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author conamerica15
 */
@Mapper(componentModel = "cdi")
public interface CargoMapper {

    List<CargoDTO> cargosToCargoDTOs(List<Cargo> cargos);

    @Mappings({
        @Mapping(source = "personas", target = "personaDTOs")
    })
    CargoDTO ToCargoDTO(Cargo cargo);

    List<PersonaDTO> personasToPersonaDTOs(List<Persona> personas);

    @Mappings({
        @Mapping(source = "tripulacion", target = "tripulanteDTOs")})
    PersonaDTO personaToPersonaDTO(Persona persona);

    List<TripulanteDTO> tripulacionToTripulanteDTOs(List<Tripulante> tripulacion);

    TripulanteDTO tripulanteToTripulanteDTO(Tripulante tripulante);

}
