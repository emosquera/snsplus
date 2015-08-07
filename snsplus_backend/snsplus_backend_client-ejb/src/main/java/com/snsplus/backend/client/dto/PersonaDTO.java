/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.dto;

import com.snsplus.backend.client.enums.EstatusPersona;
import com.snsplus.backend.client.enums.Nacionalidad;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author conamerica15
 */
@XmlRootElement(name = "persona")
public class PersonaDTO extends GeneralDTO{
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String documentoIdentidad;
    private Nacionalidad nacionalidad;
    private String direccionHabitacion;
    private String telefonoMovil;
    private String telefonoHabitacion;
    private String emailPersonal;
    private String emailCorporativo;
    private CargoDTO cargoDTO;
    private EmpresaDTO empresaDTO;
    private List<TripulanteDTO> tripulanteDTOs;
    private EstatusPersona estatus;
    

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccionHabitacion() {
        return direccionHabitacion;
    }

    public void setDireccionHabitacion(String direccionHabitacion) {
        this.direccionHabitacion = direccionHabitacion;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getTelefonoHabitacion() {
        return telefonoHabitacion;
    }

    public void setTelefonoHabitacion(String telefonoHabitacion) {
        this.telefonoHabitacion = telefonoHabitacion;
    }

    public String getEmailPersonal() {
        return emailPersonal;
    }

    public void setEmailPersonal(String emailPersonal) {
        this.emailPersonal = emailPersonal;
    }

    public String getEmailCorporativo() {
        return emailCorporativo;
    }

    public void setEmailCorporativo(String emailCorporativo) {
        this.emailCorporativo = emailCorporativo;
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

    public EmpresaDTO getEmpresaDTO() {
        if (empresaDTO == null) {
            empresaDTO = new EmpresaDTO();
        }
        return empresaDTO;
    }

    public void setEmpresaDTO(EmpresaDTO empresaDTO) {
        this.empresaDTO = empresaDTO;
    }

    public EstatusPersona getEstatus() {
        return estatus;
    }

    public void setEstatus(EstatusPersona estatus) {
        this.estatus = estatus;
    }

    public List<TripulanteDTO> getTripulanteDTOs() {
        return tripulanteDTOs;
    }

    public void setTripulanteDTOs(List<TripulanteDTO> tripulanteDTOs) {
        this.tripulanteDTOs = tripulanteDTOs;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("PersonaDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", primerNombre = ").append(primerNombre).
                append(", segundoNombre = ").append(segundoNombre).
                append(", primerApellido = ").append(primerApellido).
                append(", segundoApellido = ").append(segundoApellido).
                append(", documentoIdentidad = ").append(documentoIdentidad).
                append(", nacionalidad = ").append(nacionalidad).
                append(", direccionHabitacion = ").append(direccionHabitacion).
                append(", telefonoHabitacion = ").append(telefonoHabitacion).
                append(", telefonoMovil = ").append(telefonoMovil).
                append(", emailPersonal = ").append(emailPersonal).
                append(", emailCorporativo = ").append(emailCorporativo).
                append(", cargo = ").append(cargoDTO).
                append(", empresa = ").append(empresaDTO).
                append(", estatus = ").append(estatus).
                append('}').toString();
    }
}
