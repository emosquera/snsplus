/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author conamerica15
 */

@XmlRootElement(name = "terminal")
public class TerminalDTO extends GeneralDTO{
    private String nombre;
    private String abreviatura;
    private CiudadDTO ciudadDTO;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public CiudadDTO getCiudadDTO() {
        if (ciudadDTO == null) {
            ciudadDTO = new CiudadDTO();
        }
        return ciudadDTO;
    }

    public void setCiudadDTO(CiudadDTO ciudadDTO) {
        this.ciudadDTO = ciudadDTO;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("TerminalDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", nombre = ").append(nombre).
                append(", abreviatura = ").append(abreviatura).
                append(", ciudadDTO = ").append(ciudadDTO).
                append('}').toString();
    }

    public TerminalDTO() {
    }

    public TerminalDTO(String nombre, String abreviatura, CiudadDTO ciudadDTO) {
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.ciudadDTO = ciudadDTO;
    }
    
    
}
