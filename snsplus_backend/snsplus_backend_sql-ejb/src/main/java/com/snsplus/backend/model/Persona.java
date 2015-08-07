/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.model;

import com.snsplus.backend.client.dto.PersonaDTO;
import com.snsplus.backend.client.enums.EstatusPersona;
import com.snsplus.backend.client.enums.Nacionalidad;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.Version;

/**
 *
 * @author conamerica15
 */
@Entity
public class Persona extends PersonaDTO {
    private List<Tripulante> tripulacion;
    private Cargo cargo;

    private Empresa empresa;
    
    @Override
    @Enumerated(EnumType.STRING)
    public EstatusPersona getEstatus() {
        return super.getEstatus(); //To change body of generated methods, choose Tools | Templates.
    }


    @ManyToOne
    public Empresa getEmpresa() {
        if (empresa == null) {
            return new Empresa();
        }
        return this.empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    

    @Column(name="email_corporativo")
    @Override
    public String getEmailCorporativo() {
        return super.getEmailCorporativo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name="email_personal")
    @Override
    public String getEmailPersonal() {
        return super.getEmailPersonal(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name="telefono_habitacion")
    @Override
    public String getTelefonoHabitacion() {
        return super.getTelefonoHabitacion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name="telefono_movil")
    @Override
    public String getTelefonoMovil() {
        return super.getTelefonoMovil(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name="direccion_habitacion")
    @Override
    public String getDireccionHabitacion() {
        return super.getDireccionHabitacion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Enumerated(EnumType.STRING)
    @Override
    public Nacionalidad getNacionalidad() {
        return super.getNacionalidad(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name="documento_identidad")
    @Override
    public String getDocumentoIdentidad() {
        return super.getDocumentoIdentidad(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name="segundo_apellido")
    @Override
    public String getSegundoApellido() {
        return super.getSegundoApellido(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name="primer_apellido")
    @Override
    public String getPrimerApellido() {
        return super.getPrimerApellido(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name="segundo_nombre")
    @Override
    public String getSegundoNombre() {
        return super.getSegundoNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name="primer_nombre")
    @Override
    public String getPrimerNombre() {
        return super.getPrimerNombre(); //To change body of generated methods, choose Tools | Templates.
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
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "com.snsplus.backend.model.Persona[ id=" + id + " ]";
    }

    @OneToMany(mappedBy = "persona")
    public List<Tripulante> getTripulacion() {
        if (tripulacion == null) {
            return new ArrayList<>();
        }
        return tripulacion;
    }

    public void setTripulacion(List<Tripulante> tripulacion) {
        this.tripulacion = tripulacion;
    }
    
}
