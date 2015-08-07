/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.dto;

/**
 *
 * @author conamerica15
 */
public class TripulanteVueloDTO extends GeneralDTO{
    private VueloDTO vueloDTO;
    private PersonaDTO personaDTO;
    private CargoDTO cargoDTO;
    private Boolean responsable;

    public VueloDTO getVueloDTO() {
        if (vueloDTO == null) {
            vueloDTO = new VueloDTO();
        }
        return vueloDTO;
    }

    public void setVueloDTO(VueloDTO vueloDTO) {
        this.vueloDTO = vueloDTO;
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
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("TripulanteVueloDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", vueloDTO = ").append(vueloDTO).
                append(", persona = ").append(personaDTO).
                append(", cargoDTO = ").append(cargoDTO).
                append(", responsable = ").append(responsable).
                append('}').toString();
    }
}
