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

@XmlRootElement(name = "empresa")
public class EmpresaDTO extends GeneralDTO{
    
    private String rif;
    private String nombre;
    private String direccionPrincipal;
    private List<PersonaDTO> personaDTOs;
        

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionPrincipal() {
        return direccionPrincipal;
    }

    public void setDireccionPrincipal(String direccionPrincipal) {
        this.direccionPrincipal = direccionPrincipal;
    }

    public List<PersonaDTO> getPersonaDTOs() {
        if (personaDTOs == null){
            personaDTOs = new ArrayList<>();
        }
        return personaDTOs;
    }

    public void setPersonaDTOs(List<PersonaDTO> personaDTOs) {
        this.personaDTOs = personaDTOs;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("EmpresaDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", rif = ").append(rif).
                append(", nombre = ").append(nombre).
                append(", direccionPrincipal = ").append(direccionPrincipal).
                append('}').toString();
    }
    
}
