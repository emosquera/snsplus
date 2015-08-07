/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.model;

import com.snsplus.backend.client.dto.VueloDTO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.Version;

/**
 *
 * @author conamerica15
 */
@Entity
public class Vuelo extends VueloDTO {
    private List<EventoOperacionVuelo> eventosOperacion;
    private List<FaseOperacionVuelo> fases;
    private List<TripulanteVuelo> tripulacionVuelo;
    private List<EquipoSupervivencia> equiposSupervivencia;
    private Ruta ruta;

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
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    public Calendar getFecha() {
        return super.getFecha(); //To change body of generated methods, choose Tools | Templates.
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
        if (!(object instanceof Vuelo)) {
            return false;
        }
        Vuelo other = (Vuelo) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "com.snsplus.backend.model.Vuelo[ id=" + id + " ]";
    }   

    @ManyToMany(mappedBy = "vuelos")
    public List<EquipoSupervivencia> getEquiposSupervivencia() {
        if (equiposSupervivencia == null) {
            return new ArrayList<>();
        }
        return equiposSupervivencia;
    }

    public void setEquiposSupervivencia(List<EquipoSupervivencia> equiposSupervivencia) {
        this.equiposSupervivencia = equiposSupervivencia;
    }

    @OneToMany(mappedBy = "vuelo")
    public List<TripulanteVuelo> getTripulacionVuelo() {
        if (tripulacionVuelo == null) {
            return new ArrayList<>();
        }
        return tripulacionVuelo;
    }

    public void setTripulacionVuelo(List<TripulanteVuelo> tripulacionVuelo) {
        this.tripulacionVuelo = tripulacionVuelo;
    }

    @OneToMany(mappedBy = "padre")
    public List<FaseOperacionVuelo> getFases() {
        if (fases == null) {
            return new ArrayList<>();
        }
        return fases;
    }

    public void setFases(List<FaseOperacionVuelo> fases) {
        this.fases = fases;
    }

    @OneToMany(mappedBy = "padre")
    public List<EventoOperacionVuelo> getEventosOperacion() {
        if (eventosOperacion == null) {
            return new ArrayList<>();
        }
        return eventosOperacion;
    }

    public void setEventosOperacion(List<EventoOperacionVuelo> eventosOperacion) {
        this.eventosOperacion = eventosOperacion;
    }
    
}
