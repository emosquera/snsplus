/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.model;

import com.snsplus.backend.client.dto.EmpresaDTO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.Version;

/**
 *
 * @author conamerica15
 */
@Entity
public class Empresa extends EmpresaDTO  {
    private List<Ruta> rutas;
    private List<UnidadTransporte> unidadesTransporte;
    private List<Persona> personas;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public Long getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name="direccion_principal")
    @Override
    public String getDireccionPrincipal() {
        return super.getDireccionPrincipal(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getRif() {
        return super.getRif(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Column(name="fecha_modificacion")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    public Calendar getFechaModificacion() {
        return super.getFechaModificacion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Column(name="fecha_registro")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    public Calendar getFechaRegistro() {
        return super.getFechaRegistro(); //To change body of generated methods, choose Tools | Templates.
    }

    @Version
    @Override
    public Integer getVersion() {
        return super.getVersion(); //To change body of generated methods, choose Tools | Templates.
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
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        return !((id == null && other.id != null) || (id != null && !id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "com.snsplus.backend.model.Empresa[ id=" + id + " ]";
    }

    @OneToMany(mappedBy = "empresa")
    public List<Persona> getPersonas() {
        if (personas == null) {
            return new ArrayList<>();
        }
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    @OneToMany(mappedBy = "empresa")
    public List<UnidadTransporte> getUnidadesTransporte() {
        if (unidadesTransporte == null) {
            return new ArrayList<>();
        }
        return unidadesTransporte;
    }

    public void setUnidadesTransporte(List<UnidadTransporte> unidadesTransporte) {
        this.unidadesTransporte = unidadesTransporte;
    }

    @OneToMany(mappedBy = "empresa")
    public List<Ruta> getRutas() {
        if (rutas == null) {
            return new ArrayList<>();
        }
        return rutas;
    }

    public void setRutas(List<Ruta> rutas) {
        this.rutas = rutas;
    }

    public Empresa() {
    }

    public Empresa(EmpresaDTO empresaDTO) {
        super.setId(empresaDTO.getId());
        super.setDireccionPrincipal(empresaDTO.getDireccionPrincipal());
        super.setNombre(empresaDTO.getNombre());
        super.setRif(empresaDTO.getRif());                
    }
    
}
