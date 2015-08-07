/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.model;

import com.snsplus.backend.client.dto.IndicadorDTO;
import com.snsplus.backend.client.enums.TipoDato;
import com.snsplus.backend.client.enums.TipoIndicador;
import java.util.Calendar;
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
import javax.persistence.Temporal;
import javax.persistence.Version;

/**
 *
 * @author conamerica15
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_indicador", discriminatorType = DiscriminatorType.STRING)
public class Indicador extends IndicadorDTO {

    @Column(name="decimales_permitidos")
    @Override
    public int getDecimalesPermitidos() {
        return super.getDecimalesPermitidos(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name="caracteres_permitidos")
    @Override
    public int getCaracteresPermitidos() {
        return super.getCaracteresPermitidos(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean isObligatorio() {
        return super.isObligatorio(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name="tipo_dato")
    @Enumerated(EnumType.STRING)
    @Override
    public TipoDato getTipoDato() {
        return super.getTipoDato(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name="tipo_indicador")
    @Enumerated(EnumType.STRING)
    @Override
    public TipoIndicador getTipoIndicador() {
        return super.getTipoIndicador(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCodigo() {
        return super.getCodigo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTitulo() {
        return super.getTitulo(); //To change body of generated methods, choose Tools | Templates.
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
        if (!(object instanceof Indicador)) {
            return false;
        }
        Indicador other = (Indicador) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "com.snsplus.backend.model.Indicador[ id=" + id + " ]";
    }
    
}
