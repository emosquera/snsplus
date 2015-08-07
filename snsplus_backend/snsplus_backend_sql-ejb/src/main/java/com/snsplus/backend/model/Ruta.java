/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.model;

import com.snsplus.backend.client.dto.RutaDTO;
import com.snsplus.backend.client.enums.EstatusRuta;
import java.sql.Time;
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
public class Ruta extends RutaDTO {

    private List<Vuelo> vuelos;
    private List<Tripulante> tripulacion;
    private Empresa empresa;
    private UnidadTransporte unidadTransporte;
    private Terminal terminalOrigen;
    private Terminal terminalDestino;
    private Terminal terminalAlternativo;
    private TipoRuta tipoRuta;
    private List<ItinerarioRuta> dias;

    @ManyToOne
    public Empresa getEmpresa() {
        if (empresa == null) {
            return new Empresa();
        }
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @ManyToOne
    public UnidadTransporte getUnidadTransporte() {
        if (unidadTransporte == null) {
            return new UnidadTransporte();
        }
        return unidadTransporte;
    }

    public void setUnidadTransporte(UnidadTransporte unidadTransporte) {
        this.unidadTransporte = unidadTransporte;
    }

    @ManyToOne
    public Terminal getTerminalOrigen() {
        if (terminalOrigen == null) {
            return new Terminal();
        }
        return terminalOrigen;
    }

    public void setTerminalOrigen(Terminal terminalOrigen) {
        this.terminalOrigen = terminalOrigen;
    }

    @ManyToOne
    public Terminal getTerminalDestino() {
        if (terminalDestino == null) {
            return new Terminal();
        }
        return terminalDestino;
    }

    public void setTerminalDestino(Terminal terminalDestino) {
        this.terminalDestino = terminalDestino;
    }

    @ManyToOne
    public Terminal getTerminalAlternativo() {
        if (terminalAlternativo == null) {
            return new Terminal();
        }
        return terminalAlternativo;
    }

    public void setTerminalAlternativo(Terminal terminalAlternativo) {
        this.terminalAlternativo = terminalAlternativo;
    }

    @ManyToOne
    public TipoRuta getTipoRuta() {
        if (tipoRuta == null) {
            return new TipoRuta();
        }
        return tipoRuta;
    }

    public void setTipoRuta(TipoRuta tipoRuta) {
        this.tipoRuta = tipoRuta;
    }

    @OneToMany(mappedBy = "ruta")
    public List<ItinerarioRuta> getDias() {
        if (dias == null) {
            return new ArrayList<>();
        }
        return dias;
    }

    public void setDias(List<ItinerarioRuta> dias) {
        this.dias = dias;
    }

    @Enumerated(EnumType.STRING)
    @Override
    public EstatusRuta getEstatus() {
        return super.getEstatus(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name = "tiempo_ruta")
    @Override
    public Time getTiempoRuta() {
        return super.getTiempoRuta(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name = "hora_salida")
    @Override
    public Time getHoraSalida() {
        return super.getHoraSalida(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name = "codigo_ruta")
    @Override
    public String getCodigoRuta() {
        return super.getCodigoRuta(); //To change body of generated methods, choose Tools | Templates.
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
        if (!(object instanceof Ruta)) {
            return false;
        }
        Ruta other = (Ruta) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "com.snsplus.backend.model.Ruta[ id=" + id + " ]";
    }

    @OneToMany(mappedBy = "ruta")
    public List<Tripulante> getTripulacion() {
        if (tripulacion == null) {
            return new ArrayList<>();
        }
        return tripulacion;
    }

    public void setTripulacion(List<Tripulante> tripulacion) {
        this.tripulacion = tripulacion;
    }

    @OneToMany(mappedBy = "ruta")
    public List<Vuelo> getVuelos() {
        if (vuelos == null) {
            return new ArrayList<>();
        }
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public Ruta() {
    }

    public Ruta(RutaDTO rutaDTO) {
        super.setId(rutaDTO.getId());
        super.setCodigoRuta(rutaDTO.getCodigoRuta());
        super.setDescripcion(rutaDTO.getDescripcion());
        empresa = new Empresa(rutaDTO.getEmpresaDTO());
    }

}
