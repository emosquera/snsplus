/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author conamerica15
 */
@XmlRootElement(name = "tripulacion")
public class TripulanteDTO extends GeneralDTO{
    private RutaDTO rutaDTO;
    private PersonaDTO personaDTO;
    private CargoDTO cargoDTO;
    private Boolean responsable;
    private List<VueloDTO> vueloDTOs;

    public RutaDTO getRutaDTO() {
        if (rutaDTO == null) {
            rutaDTO = new RutaDTO();
        }
        return rutaDTO;
    }

    public void setRutaDTO(RutaDTO rutaDTO) {
        this.rutaDTO = rutaDTO;
    }

    public PersonaDTO getPersonaDTO() {
        if (personaDTO == null) {
            personaDTO = new PersonaDTO();
        }
        return personaDTO;
    }

    public void setPersonaDTO(PersonaDTO personaDTO) {
        this.personaDTO = personaDTO;
    }

    public CargoDTO getCargoDTO() {
        if (cargoDTO == null) {
            cargoDTO = new CargoDTO();
        }
        return cargoDTO;
    }

    public void setCargoDTO(CargoDTO cargoDTO) {
        this.cargoDTO = cargoDTO;
    }

    public Boolean isResponsable() {
        return responsable;
    }

    public void setResponsable(Boolean responsable) {
        this.responsable = responsable;
    }

    public List<VueloDTO> getVueloDTOs() {
        if (vueloDTOs == null) {
            vueloDTOs = new ArrayList<>();
        }
        return vueloDTOs;
    }

    public void setVueloDTOs(List<VueloDTO> vueloDTOs) {
        this.vueloDTOs = vueloDTOs;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("TripulacionDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", ruta = ").append(rutaDTO).
                append(", persona = ").append(personaDTO).
                append(", cargo = ").append(cargoDTO).
                append(", responsable = ").append(responsable).
                append('}').toString();
    }
    
}
