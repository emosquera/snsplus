/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.model;

import com.snsplus.backend.client.dto.TerminalDTO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
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
public class Terminal extends TerminalDTO {
    private List<Ruta> alternativos;
    private List<Ruta> llegadas;
    private List<Ruta> salidas;
    private Ciudad ciudad;

    @ManyToOne
    public Ciudad getCiudad() {
        if (ciudad == null) {
            return new Ciudad();
        }
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
    @Override
    public String getAbreviatura() {
        return super.getAbreviatura(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
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
        if (!(object instanceof Terminal)) {
            return false;
        }
        Terminal other = (Terminal) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "com.snsplus.backend.model.Terminal[ id=" + id + " ]";
    }

    @OneToMany(mappedBy = "terminalOrigen")
    public List<Ruta> getSalidas() {
        if (salidas == null) {
            return new ArrayList<>();
        }
        return salidas;
    }

    public void setSalidas(List<Ruta> salidas) {
        this.salidas = salidas;
    }

    @OneToMany(mappedBy = "terminalDestino")
    public List<Ruta> getLlegadas() {
        if (llegadas == null) {
            return new ArrayList<>();
        }
        return llegadas;
    }

    public void setLlegadas(List<Ruta> llegadas) {
        this.llegadas = llegadas;
    }

    @OneToMany(mappedBy = "terminalAlternativo")
    public List<Ruta> getAlternativos() {
        if (alternativos == null) {
            return new ArrayList<>();
        }
        return alternativos;
    }

    public void setAlternativos(List<Ruta> alternativos) {
        this.alternativos = alternativos;
    }

    public Terminal() {
    }

    public Terminal(TerminalDTO terminalDTO, Boolean deep) {
        super.setId(terminalDTO.getId());
        super.setAbreviatura(terminalDTO.getAbreviatura());
        super.setNombre(terminalDTO.getNombre());
        if (deep) {
            ciudad = new Ciudad(terminalDTO.getCiudadDTO(), deep);
        }
    }
    
    
    
}
