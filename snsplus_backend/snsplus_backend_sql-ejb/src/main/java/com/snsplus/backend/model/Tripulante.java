/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.model;

import com.snsplus.backend.client.dto.TripulanteDTO;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.Version;

/**
 *
 * @author conamerica15
 */
@Entity
public class Tripulante extends TripulanteDTO {

    private Cargo cargo;
    private Persona persona;
    private Ruta ruta;    

    @ManyToOne
    public Cargo getCargo() {
        if (cargo == null) {
            return new Cargo();
        }
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @ManyToOne
    public Persona getPersona() {
        if (persona == null) {
            return new Persona();
        }
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @ManyToOne
    public Ruta getRuta() {
        if (ruta == null) {
            return new Ruta();
        }
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
    
    @Override
    public Boolean isResponsable() {
        return super.isResponsable(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Column(name="fecha_modificacion")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Override
    public Calendar getFechaModificacion() {
        return super.getFechaModificacion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name="fecha_registro")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Override
    public Calendar getFechaRegistro() {
        return super.getFechaRegistro(); //To change body of generated methods, choose Tools | Templates.
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
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tripulante)) {
            return false;
        }
        Tripulante other = (Tripulante) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "com.snsplus.backend.model.Tripulante[ id=" + id + " ]";
    }
    
}
