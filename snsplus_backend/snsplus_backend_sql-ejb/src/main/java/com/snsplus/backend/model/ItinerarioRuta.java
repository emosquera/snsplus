/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.model;

import com.snsplus.backend.client.dto.ItinerarioRutaDTO;
import com.snsplus.backend.client.enums.DiaSemana;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Version;

/**
 *
 * @author conamerica15
 */
@Entity
@Table(name = "itinerario_ruta")
public class ItinerarioRuta extends ItinerarioRutaDTO {
    private Ruta ruta;

    @Enumerated(EnumType.STRING)
    @Override
    public DiaSemana getDia() {
        return super.getDia(); //To change body of generated methods, choose Tools | Templates.
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
        if (!(object instanceof ItinerarioRuta)) {
            return false;
        }
        ItinerarioRuta other = (ItinerarioRuta) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "com.snsplus.backend.model.Itinerario[ id=" + id + " ]";
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
    
}
