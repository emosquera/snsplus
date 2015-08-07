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
@XmlRootElement(name = "cargo")
public class CargoDTO extends GeneralDTO{
    private String cargo;
    private List<PersonaDTO> personaDTOs;
    private List<EventoDTO> eventoDTOs;
    private List<FaseDTO> faseDTOs;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public List<PersonaDTO> getPersonaDTOs() {
        if (personaDTOs == null) {
            personaDTOs = new ArrayList<>();
        }
        return personaDTOs;
    }

    public List<EventoDTO> getEventoDTOs() {
        if (eventoDTOs == null) {
            eventoDTOs = new ArrayList<>();
        }
        return eventoDTOs;
    }

    public void setEventoDTOs(List<EventoDTO> eventoDTOs) {
        this.eventoDTOs = eventoDTOs;
    }

    public List<FaseDTO> getFaseDTOs() {
        if (faseDTOs == null) {
            faseDTOs = new ArrayList<>();
        }
        return faseDTOs;
    }

    public void setFaseDTOs(List<FaseDTO> faseDTOs) {
        this.faseDTOs = faseDTOs;
    }

    public void setPersonaDTOs(List<PersonaDTO> personaDTOs) {
        this.personaDTOs = personaDTOs;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("CargoDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).                
                append(", cargo = ").append(cargo).
                append('}').toString();
    }
}
