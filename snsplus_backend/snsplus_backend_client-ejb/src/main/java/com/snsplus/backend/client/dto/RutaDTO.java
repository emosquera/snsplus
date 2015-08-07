/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.dto;

import com.snsplus.backend.client.enums.EstatusRuta;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author conamerica15
 */
@XmlRootElement(name = "ruta")
public class RutaDTO extends GeneralDTO{
    private String codigoRuta;
    private String descripcion;
    private EmpresaDTO empresaDTO;
    private UnidadTransporteDTO unidadTransporteDTO;
    private TerminalDTO terminalOrigenDTO;
    private TerminalDTO terminalDestinoDTO;
    private Time horaSalida;
    private Time tiempoRuta;
    private TerminalDTO terminalAlternativoDTO;
    private TipoRutaDTO tipoRutaDTO;
    private EstatusRuta estatus;
    private List<ItinerarioRutaDTO> ItinerarioRutaDTOs;
    private List<TripulanteDTO> tripulanteDTOs;

    public String getCodigoRuta() {
        return codigoRuta;
    }

    public void setCodigoRuta(String codigoRuta) {
        this.codigoRuta = codigoRuta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EmpresaDTO getEmpresaDTO() {
        if (empresaDTO == null){
            empresaDTO = new EmpresaDTO();
        }
        return empresaDTO;
    }

    public void setEmpresaDTO(EmpresaDTO empresaDTO) {
        this.empresaDTO = empresaDTO;
    }

    public UnidadTransporteDTO getUnidadTransporteDTO() {
        if (unidadTransporteDTO == null){
            unidadTransporteDTO = new UnidadTransporteDTO();
        }
        return unidadTransporteDTO;
    }

    public void setUnidadTransporteDTO(UnidadTransporteDTO unidadTransporteDTO) {
        this.unidadTransporteDTO = unidadTransporteDTO;
    }

    public TerminalDTO getTerminalOrigenDTO() {
        if (terminalOrigenDTO == null) {
            terminalOrigenDTO = new TerminalDTO();
        }
        return terminalOrigenDTO;
    }

    public void setTerminalOrigenDTO(TerminalDTO terminalOrigenDTO) {
        this.terminalOrigenDTO = terminalOrigenDTO;
    }

    public TerminalDTO getTerminalDestinoDTO() {
        if (terminalDestinoDTO == null) {
            terminalDestinoDTO = new TerminalDTO();
        }
        return terminalDestinoDTO;
    }

    public void setTerminalDestinoDTO(TerminalDTO terminalDestinoDTO) {
        this.terminalDestinoDTO = terminalDestinoDTO;
    }

    public Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Time getTiempoRuta() {
        return tiempoRuta;
    }

    public void setTiempoRuta(Time tiempoRuta) {
        this.tiempoRuta = tiempoRuta;
    }

    public TerminalDTO getTerminalAlternativoDTO() {
        if (terminalAlternativoDTO == null) {
            terminalAlternativoDTO = new TerminalDTO();
        }
        return terminalAlternativoDTO;
    }

    public void setTerminalAlternativoDTO(TerminalDTO terminalAlternativoDTO) {
        this.terminalAlternativoDTO = terminalAlternativoDTO;
    }

    public TipoRutaDTO getTipoRutaDTO() {
        if (tipoRutaDTO == null) {
            tipoRutaDTO = new TipoRutaDTO();
        }
        return tipoRutaDTO;
    }

    public void setTipoRutaDTO(TipoRutaDTO tipoRutaDTO) {
        this.tipoRutaDTO = tipoRutaDTO;
    }

    public EstatusRuta getEstatus() {
        return estatus;
    }

    public void setEstatus(EstatusRuta estatus) {
        this.estatus = estatus;
    }

    public List<ItinerarioRutaDTO> getItinerarioRutaDTOs() {
        if (ItinerarioRutaDTOs == null) {
            ItinerarioRutaDTOs = new ArrayList<>();
        }
        return ItinerarioRutaDTOs;
    }

    public void setItinerarioRutaDTOs(List<ItinerarioRutaDTO> ItinerarioRutaDTOs) {
        this.ItinerarioRutaDTOs = ItinerarioRutaDTOs;
    }

    public List<TripulanteDTO> getTripulanteDTOs() {
        if (tripulanteDTOs == null) {
            tripulanteDTOs = new ArrayList<>();
        }
        return tripulanteDTOs;
    }

    public void setTripulanteDTOs(List<TripulanteDTO> tripulanteDTOs) {
        this.tripulanteDTOs = tripulanteDTOs;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("RutaDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", codigoRuta = ").append(codigoRuta).
                append(", descripcion = ").append(descripcion).
                append(", empresa = ").append(empresaDTO).
                append(", unidadTransporte = ").append(unidadTransporteDTO).
                append(", terminalOrigen = ").append(terminalOrigenDTO).
                append(", terminalDestino = ").append(terminalDestinoDTO).
                append(", horaSalida = ").append(horaSalida).
                append(", tiempoRuta = ").append(tiempoRuta).
                append(", terminalAlternativo = ").append(terminalAlternativoDTO).
                append(", tipoRuta = ").append(tipoRutaDTO).
                append(", estatus = ").append(estatus).
                append('}').toString();
    }
    
}
