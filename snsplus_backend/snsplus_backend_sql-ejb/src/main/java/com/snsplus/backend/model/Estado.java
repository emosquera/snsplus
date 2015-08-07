/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.snsplus.backend.client.dto.CiudadDTO;
import com.snsplus.backend.client.dto.EstadoDTO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.Version;

/**
 *
 * @author conamerica15
 */
@Entity
public class Estado extends EstadoDTO {
    private List<Ciudad> ciudades;
    @JsonIgnore
    private Pais pais;

    @ManyToOne()
    public Pais getPais() {
        if (pais == null) {
            return new Pais();
        }
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String getAbreviatura() {
        return super.getAbreviatura(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEstado() {
        return super.getEstado(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name = "fecha_modificacion")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Override
    public Calendar getFechaModificacion() {
        return super.getFechaModificacion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name = "fecha_registro")
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
        if (!(object instanceof Estado)) {
            return false;
        }
        Estado other = (Estado) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "com.snsplus.backend.model.Estado[ id=" + id + " ]";
    }

    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Ciudad> getCiudades() {
        if (ciudades == null) {
            return new ArrayList<>();
        }
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public Estado() {
    }

    @SuppressWarnings("LeakingThisInConstructor")
    public Estado(EstadoDTO estadoDTO, Boolean deep) {
        super.setId(estadoDTO.getId());
        super.setAbreviatura(estadoDTO.getAbreviatura());
        super.setEstado(estadoDTO.getEstado());
        if (deep) {
            pais = new Pais(estadoDTO.getPaisDTO());
        }
        ciudades = new ArrayList<>();
        for (CiudadDTO ciudadDTO : estadoDTO.getCiudadDTOs()) {
            Ciudad ciudad = new Ciudad(ciudadDTO, Boolean.FALSE);
            ciudad.setEstado(this);
            ciudades.add(ciudad);
        }
    }

}
