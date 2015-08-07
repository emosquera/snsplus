/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.model;

import com.snsplus.backend.client.dto.ModeloUnidadTransporteDTO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Version;

/**
 *
 * @author conamerica15
 */
@Entity
@Table(name = "modelo_unidad_transporte")
public class ModeloUnidadTransporte extends ModeloUnidadTransporteDTO {
    private List<UnidadTransporte> unidadesTransporte;

    @OneToMany(mappedBy = "modeloUnidadTransporte")
    public List<UnidadTransporte> getUnidadesTransporte() {
        if (unidadesTransporte == null) {
            return new ArrayList<>();
        }
        return unidadesTransporte;
    }

    public void setUnidadesTransporte(List<UnidadTransporte> unidadesTransporte) {
        this.unidadesTransporte = unidadesTransporte;
    }
    
    @Override
    public String getDescripcion() {
        return super.getDescripcion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAbreviatura() {
        return super.getAbreviatura(); //To change body of generated methods, choose Tools | Templates.
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
        if (!(object instanceof ModeloUnidadTransporte)) {
            return false;
        }
        ModeloUnidadTransporte other = (ModeloUnidadTransporte) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "com.snsplus.backend.model.ModeloUnidadTransporte[ id=" + id + " ]";
    }

    public ModeloUnidadTransporte() {
    }

    public ModeloUnidadTransporte(ModeloUnidadTransporteDTO modeloUnidadTransporteDTO) {
        super.setId(modeloUnidadTransporteDTO.getId());
        super.setAbreviatura(modeloUnidadTransporteDTO.getAbreviatura());
        super.setDescripcion(modeloUnidadTransporteDTO.getDescripcion());
    }
    
}
