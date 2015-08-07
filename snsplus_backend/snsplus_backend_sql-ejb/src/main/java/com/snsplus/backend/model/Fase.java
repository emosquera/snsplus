/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.model;

import com.snsplus.backend.client.dto.FaseDTO;
import com.snsplus.backend.client.enums.TipoFase;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
public class Fase extends FaseDTO {
    private List<IndicadorFase> indicadores;
    private List<Cargo> cargos;
    private Operacion operacion;

    @ManyToMany
    public List<Cargo> getCargos() {
        if (cargos == null) {
            return new ArrayList<>();
        }
        return cargos;
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }

    @ManyToOne
    public Operacion getOperacion() {
        if (operacion == null) {
            return new Operacion();
        }
        return operacion;
    }

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    @Override
    public int getOrden() {
        return super.getOrden(); //To change body of generated methods, choose Tools | Templates.
    }

    @Enumerated(EnumType.STRING)
    @Override
    public TipoFase getTipo() {
        return super.getTipo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion(); //To change body of generated methods, choose Tools | Templates.
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
        if (!(object instanceof Fase)) {
            return false;
        }
        Fase other = (Fase) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "com.snsplus.backend.model.Fase[ id=" + id + " ]";
    }

    @OneToMany(mappedBy = "padre")
    public List<IndicadorFase> getIndicadores() {
        if (indicadores == null) {
            return new ArrayList<>();
        }
        return indicadores;
    }

    public void setIndicadores(List<IndicadorFase> indicadores) {
        this.indicadores = indicadores;
    }

    
}
