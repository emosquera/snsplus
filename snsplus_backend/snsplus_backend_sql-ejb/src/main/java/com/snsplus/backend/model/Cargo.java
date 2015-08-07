/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.model;

import com.snsplus.backend.client.dto.CargoDTO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.Version;

/**
 *
 * @author conamerica15
 */
@Entity
public class Cargo extends CargoDTO {    
    private List<Evento> eventos;
    private List<Fase> fases;
    private List<Persona> personas;
        

    @OneToMany(mappedBy = "cargo")
    public List<Persona> getPersonas() {
        if (personas == null) {
            return new ArrayList<>();
        }
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    
    @Override
    public String getCargo() {
        return super.getCargo(); //To change body of generated methods, choose Tools | Templates.
    }    

    @Version
    @Override
    public Integer getVersion() {
        return super.getVersion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public Long getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Column(name = "fecha_registro")    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    public Calendar getFechaRegistro() {
        return super.getFechaRegistro(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Column(name = "fecha_modificacion")    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    public Calendar getFechaModificacion() {
        return super.getFechaModificacion(); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cargo)) {
            return false;
        }
        Cargo other = (Cargo) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "com.snsplus.backend.model.Cargo[ id=" + id + " ]";
    }

    @ManyToMany(mappedBy = "cargos")
    public List<Fase> getFases() {
        if (fases == null) {
            return new ArrayList<>();
        }
        return fases;
    }

    public void setFases(List<Fase> fases) {
        this.fases = fases;
    }

    @ManyToMany(mappedBy = "cargos")
    public List<Evento> getEventos() {
        if (eventos == null) {
            return new ArrayList<>();
        }
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }    
    
}
