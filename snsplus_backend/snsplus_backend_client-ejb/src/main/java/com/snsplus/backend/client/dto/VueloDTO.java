/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.dto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author conamerica15
 */
@XmlRootElement(name = "vuelo")
public class VueloDTO extends GeneralDTO{
    private RutaDTO rutaDTO;
    private Calendar fecha;
    private List<TripulanteVueloDTO> tripulanteVueloDTOs;
    private List<EquipoSupervivenciaDTO> equipoSupervivenciaDTOs;
    private List<FaseOperacionVueloDTO> faseOperacionVueloDTOs;
    private List<EventoOperacionVueloDTO> eventoOperacionVueloDTOs;
    private String estatus;

    public RutaDTO getRutaDTO() {
        if (rutaDTO == null) {
            rutaDTO = new RutaDTO();
        }
        return rutaDTO;
    }

    public void setRutaDTO(RutaDTO rutaDTO) {
        this.rutaDTO = rutaDTO;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public List<TripulanteVueloDTO> getTripulanteVueloDTOs() {
        if (tripulanteVueloDTOs == null) {
            tripulanteVueloDTOs = new ArrayList<>();
        }
        return tripulanteVueloDTOs;
    }

    public void setTripulanteVueloDTOs(List<TripulanteVueloDTO> tripulanteVueloDTOs) {
        this.tripulanteVueloDTOs = tripulanteVueloDTOs;
    }

    public List<EquipoSupervivenciaDTO> getEquipoSupervivenciaDTOs() {
        if (equipoSupervivenciaDTOs == null) {
            equipoSupervivenciaDTOs = new ArrayList<>();
        }
        return equipoSupervivenciaDTOs;
    }

    public void setEquipoSupervivenciaDTOs(List<EquipoSupervivenciaDTO> equipoSupervivenciaDTOs) {
        this.equipoSupervivenciaDTOs = equipoSupervivenciaDTOs;
    }

    public List<FaseOperacionVueloDTO> getFaseOperacionVueloDTOs() {
        if (faseOperacionVueloDTOs == null) {
            faseOperacionVueloDTOs = new ArrayList<>();
        }
        return faseOperacionVueloDTOs;
    }

    public void setFaseOperacionVueloDTO(List<FaseOperacionVueloDTO> faseOperacionVueloDTOs) {
        this.faseOperacionVueloDTOs = faseOperacionVueloDTOs;
    }

    public List<EventoOperacionVueloDTO> getEventoOperacionVueloDTOs() {
        if (eventoOperacionVueloDTOs == null) {
            eventoOperacionVueloDTOs = new ArrayList<>();
        }
        return eventoOperacionVueloDTOs;
    }

    public void setEventoOperacionVueloDTOs(List<EventoOperacionVueloDTO> eventoOperacionVueloDTOs) {
        this.eventoOperacionVueloDTOs = eventoOperacionVueloDTOs;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("VueloDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", ruta = ").append(rutaDTO).
                append(", fecha = ").append(fecha).
                append(", estatus = ").append(estatus).
                append('}').toString();
    }
}
