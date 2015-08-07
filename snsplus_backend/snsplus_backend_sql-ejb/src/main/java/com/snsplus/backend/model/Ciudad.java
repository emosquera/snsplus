/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.snsplus.backend.client.dto.CiudadDTO;
import com.snsplus.backend.client.dto.TerminalDTO;
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
public class Ciudad extends CiudadDTO {

    private List<Terminal> terminales;
    @JsonIgnore
    private Estado estado;

    @ManyToOne    
    public Estado getEstado() {
        if (estado == null) {
            return new Estado();
        }
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String getAbreviatura() {
        return super.getAbreviatura(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCiudad() {
        return super.getCiudad(); //To change body of generated methods, choose Tools | Templates.
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
        if (!(object instanceof Ciudad)) {
            return false;
        }
        Ciudad other = (Ciudad) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "com.snsplus.backend.model.Ciudad[ id=" + id + " ]";
    }

    @OneToMany(mappedBy = "ciudad", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Terminal> getTerminales() {
        if (terminales == null) {
            return new ArrayList<>();
        }
        return terminales;
    }

    public void setTerminales(List<Terminal> terminales) {
        this.terminales = terminales;
    }

    public Ciudad() {
    }

    public Ciudad(CiudadDTO ciudadDTO, Boolean deep) {
        super.setId(ciudadDTO.getId());
        super.setAbreviatura(ciudadDTO.getAbreviatura());
        super.setCiudad(ciudadDTO.getCiudad());
        if (deep) {
            estado = new Estado(ciudadDTO.getEstadoDTO(), deep);
        }
        terminales = new ArrayList<>();
        for (TerminalDTO terminalDTO : ciudadDTO.getTerminalDTOs()) {
            Terminal terminal = new Terminal(terminalDTO, false);
            terminal.setCiudad(this);
            terminales.add(terminal);
        }

    }

}
