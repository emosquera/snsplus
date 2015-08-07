/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.model;

import com.snsplus.backend.client.dto.EventoOperacionDTO;
import com.snsplus.backend.client.enums.EstatusFaseEvento;
import com.snsplus.backend.client.enums.TipoOperacion;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Version;

/**
 *
 * @author conamerica15
 */
@Entity
@Table(name = "evento_operacion")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_padre", discriminatorType = DiscriminatorType.STRING)
public class EventoOperacion extends EventoOperacionDTO {
    private List<ValorIndicadorEvento> valorIndicadorEventos;
    private Evento evento;

    @ManyToOne
    public Evento getEvento() {
        if (evento == null) {
            return new Evento();
        }
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    @Enumerated(EnumType.STRING)
    @Override
    public EstatusFaseEvento getEstatus() {
        return super.getEstatus(); //To change body of generated methods, choose Tools | Templates.
    }

    @Enumerated(EnumType.STRING)
    @Override
    @Column(name = "tipo_padre")
    public TipoOperacion getTipoPadre() {
        return super.getTipoPadre(); //To change body of generated methods, choose Tools | Templates.
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
        if (!(object instanceof EventoOperacion)) {
            return false;
        }
        EventoOperacion other = (EventoOperacion) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "com.snsplus.backend.model.EventoOperacion[ id=" + id + " ]";
    }

    @OneToMany(mappedBy = "padre")
    public List<ValorIndicadorEvento> getValorIndicadorEventos() {
        if (valorIndicadorEventos == null) {
            return new ArrayList<>();
        }
        return valorIndicadorEventos;
    }

    public void setValorIndicadorEventos(List<ValorIndicadorEvento> valorIndicadorEventos) {
        this.valorIndicadorEventos = valorIndicadorEventos;
    }
    
}
