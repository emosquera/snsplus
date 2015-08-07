package com.snsplus.backend.mapper;

import com.snsplus.backend.client.dto.CargoDTO;
import com.snsplus.backend.client.dto.EventoDTO;
import com.snsplus.backend.client.dto.FaseDTO;
import com.snsplus.backend.client.dto.PersonaDTO;
import com.snsplus.backend.client.dto.TripulanteDTO;
import com.snsplus.backend.client.dto.VueloDTO;
import com.snsplus.backend.model.Cargo;
import com.snsplus.backend.model.Persona;
import com.snsplus.backend.model.Tripulante;
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
public class CargoMapperImpl implements CargoMapper {

    @Override
    public List<CargoDTO> cargosToCargoDTOs(List<Cargo> cargos) {
        if ( cargos == null ) {
            return null;
        }

        List<CargoDTO> list = new ArrayList<CargoDTO>();

        for ( Cargo cargo : cargos ) {
            list.add( ToCargoDTO( cargo ) );
        }

        return list;
    }

    @Override
    public CargoDTO ToCargoDTO(Cargo cargo) {
        if ( cargo == null ) {
            return null;
        }

        CargoDTO cargoDTO_ = new CargoDTO();

        cargoDTO_.setPersonaDTOs( personasToPersonaDTOs( cargo.getPersonas() ) );
        cargoDTO_.setId( cargo.getId() );
        if ( cargo.getEventoDTOs() != null ) {
            cargoDTO_.setEventoDTOs( new ArrayList<EventoDTO>( cargo.getEventoDTOs() ) );
        }
        if ( cargo.getFaseDTOs() != null ) {
            cargoDTO_.setFaseDTOs( new ArrayList<FaseDTO>( cargo.getFaseDTOs() ) );
        }
        cargoDTO_.setFechaRegistro( cargo.getFechaRegistro() );
        cargoDTO_.setFechaModificacion( cargo.getFechaModificacion() );
        cargoDTO_.setCargo( cargo.getCargo() );
        cargoDTO_.setVersion( cargo.getVersion() );

        return cargoDTO_;
    }

    @Override
    public List<PersonaDTO> personasToPersonaDTOs(List<Persona> personas) {
        if ( personas == null ) {
            return null;
        }

        List<PersonaDTO> list_ = new ArrayList<PersonaDTO>();

        for ( Persona persona : personas ) {
            list_.add( personaToPersonaDTO( persona ) );
        }

        return list_;
    }

    @Override
    public PersonaDTO personaToPersonaDTO(Persona persona) {
        if ( persona == null ) {
            return null;
        }

        PersonaDTO personaDTO_ = new PersonaDTO();

        personaDTO_.setTripulanteDTOs( tripulacionToTripulanteDTOs( persona.getTripulacion() ) );
        personaDTO_.setEmailCorporativo( persona.getEmailCorporativo() );
        personaDTO_.setEmailPersonal( persona.getEmailPersonal() );
        personaDTO_.setDocumentoIdentidad( persona.getDocumentoIdentidad() );
        personaDTO_.setFechaRegistro( persona.getFechaRegistro() );
        personaDTO_.setCargoDTO( persona.getCargoDTO() );
        personaDTO_.setEmpresaDTO( persona.getEmpresaDTO() );
        personaDTO_.setSegundoApellido( persona.getSegundoApellido() );
        personaDTO_.setPrimerNombre( persona.getPrimerNombre() );
        personaDTO_.setVersion( persona.getVersion() );
        personaDTO_.setId( persona.getId() );
        personaDTO_.setPrimerApellido( persona.getPrimerApellido() );
        personaDTO_.setDireccionHabitacion( persona.getDireccionHabitacion() );
        personaDTO_.setTelefonoHabitacion( persona.getTelefonoHabitacion() );
        personaDTO_.setSegundoNombre( persona.getSegundoNombre() );
        personaDTO_.setFechaModificacion( persona.getFechaModificacion() );
        personaDTO_.setNacionalidad( persona.getNacionalidad() );
        personaDTO_.setEstatus( persona.getEstatus() );
        personaDTO_.setTelefonoMovil( persona.getTelefonoMovil() );

        return personaDTO_;
    }

    @Override
    public List<TripulanteDTO> tripulacionToTripulanteDTOs(List<Tripulante> tripulacion) {
        if ( tripulacion == null ) {
            return null;
        }

        List<TripulanteDTO> list_ = new ArrayList<TripulanteDTO>();

        for ( Tripulante tripulante : tripulacion ) {
            list_.add( tripulanteToTripulanteDTO( tripulante ) );
        }

        return list_;
    }

    @Override
    public TripulanteDTO tripulanteToTripulanteDTO(Tripulante tripulante) {
        if ( tripulante == null ) {
            return null;
        }

        TripulanteDTO tripulanteDTO_ = new TripulanteDTO();

        tripulanteDTO_.setRutaDTO( tripulante.getRutaDTO() );
        tripulanteDTO_.setResponsable( tripulante.isResponsable() );
        tripulanteDTO_.setId( tripulante.getId() );
        if ( tripulante.getVueloDTOs() != null ) {
            tripulanteDTO_.setVueloDTOs( new ArrayList<VueloDTO>( tripulante.getVueloDTOs() ) );
        }
        tripulanteDTO_.setPersonaDTO( tripulante.getPersonaDTO() );
        tripulanteDTO_.setFechaRegistro( tripulante.getFechaRegistro() );
        tripulanteDTO_.setFechaModificacion( tripulante.getFechaModificacion() );
        tripulanteDTO_.setCargoDTO( tripulante.getCargoDTO() );
        tripulanteDTO_.setVersion( tripulante.getVersion() );

        return tripulanteDTO_;
    }

}
