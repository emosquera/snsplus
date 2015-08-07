/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.model;

import com.snsplus.backend.client.dto.EquipoSupervivenciaDTO;
import com.snsplus.backend.client.dto.UnidadTransporteDTO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Table(name = "unidad_transporte")
public class UnidadTransporte extends UnidadTransporteDTO {
    private List<Ruta> rutas;
    private List<EquipoSupervivencia> equiposSupervivencia;
    private MarcaUnidadTransporte marcaUnidadTransporte;
    private ModeloUnidadTransporte modeloUnidadTransporte;
    private TipoUnidadTransporte tipoUnidadTransporte;
    private Empresa empresa;

    @Override
    public String getPropietario() {
        return super.getPropietario(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name="vencimiento_certificado")
    @Temporal(javax.persistence.TemporalType.DATE)
    @Override
    public Date getVencimientoCertificado() {
        return super.getVencimientoCertificado(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColor() {
        return super.getColor(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name="kilos_permitidos")
    @Override
    public Double getKilosPermitidos() {
        return super.getKilosPermitidos(); //To change body of generated methods, choose Tools | Templates.
    }

    @Column(name="cantidad_pasajeros_permitidos")
    @Override
    public int getCantidadPasajerosPermitidos() {
        return super.getCantidadPasajerosPermitidos(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSerial() {
        return super.getSerial(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMatricula() {
        return super.getMatricula(); //To change body of generated methods, choose Tools | Templates.
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
        if (!(object instanceof UnidadTransporte)) {
            return false;
        }
        UnidadTransporte other = (UnidadTransporte) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "com.snsplus.backend.model.UnidadTransporte[ id=" + id + " ]";
    }

    @ManyToOne
    public TipoUnidadTransporte getTipoUnidadTransporte() {
        if (tipoUnidadTransporte == null) {
            return new TipoUnidadTransporte();
        }
        return tipoUnidadTransporte;
    }

    public void setTipoUnidadTransporte(TipoUnidadTransporte tipoUnidadTransporte) {
        this.tipoUnidadTransporte = tipoUnidadTransporte;
    }

    @ManyToOne
    public ModeloUnidadTransporte getModeloUnidadTransporte() {
        if (modeloUnidadTransporte == null) {
            return new ModeloUnidadTransporte();
        }
        return modeloUnidadTransporte;
    }

    public void setModeloUnidadTransporte(ModeloUnidadTransporte modeloUnidadTransporte) {
        this.modeloUnidadTransporte = modeloUnidadTransporte;
    }

    @ManyToOne
    public MarcaUnidadTransporte getMarcaUnidadTransporte() {
        if (marcaUnidadTransporte == null) {
            return new MarcaUnidadTransporte();
        }
        return marcaUnidadTransporte;
    }

    public void setMarcaUnidadTransporte(MarcaUnidadTransporte marcaUnidadTransporte) {
        this.marcaUnidadTransporte = marcaUnidadTransporte;
    }

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

    @ManyToMany(mappedBy = "unidadesTransporte")
    public List<EquipoSupervivencia> getEquiposSupervivencia() {
        if (equiposSupervivencia == null) {
            return new ArrayList<>();
        }
        return equiposSupervivencia;
    }

    public void setEquiposSupervivencia(List<EquipoSupervivencia> equiposSupervivencia) {
        this.equiposSupervivencia = equiposSupervivencia;
    }

    @OneToMany(mappedBy = "unidadTransporte")
    public List<Ruta> getRutas() {
        if (rutas == null) {
            return new ArrayList<>();
        }
        return rutas;
    }

    public void setRutas(List<Ruta> rutas) {
        this.rutas = rutas;
    }

    public UnidadTransporte() {
    }

    public UnidadTransporte(UnidadTransporteDTO unidadTransporteDTO) {
        super.setId(unidadTransporteDTO.getId());
        super.setCantidadPasajerosPermitidos(unidadTransporteDTO.getCantidadPasajerosPermitidos());
        super.setColor(unidadTransporteDTO.getColor());
        super.setKilosPermitidos(unidadTransporteDTO.getKilosPermitidos());
        super.setMatricula(unidadTransporteDTO.getMatricula());
        super.setPropietario(unidadTransporteDTO.getPropietario());
        super.setSerial(unidadTransporteDTO.getSerial());
        super.setVencimientoCertificado(unidadTransporteDTO.getVencimientoCertificado());
        
        marcaUnidadTransporte = new MarcaUnidadTransporte(unidadTransporteDTO.getMarcaUnidadTransporteDTO());
        
        modeloUnidadTransporte = new ModeloUnidadTransporte(unidadTransporteDTO.getModeloUnidadTransporteDTO());
        
        tipoUnidadTransporte = new TipoUnidadTransporte(unidadTransporteDTO.getTipoUnidadTransporteDTO());
        
        equiposSupervivencia = new ArrayList<>();
        for (EquipoSupervivenciaDTO equipoSupervivenciaDTO : unidadTransporteDTO.getEquipoSupervivenciaDTOs()) {
            EquipoSupervivencia equipoSupervivencia= new EquipoSupervivencia(equipoSupervivenciaDTO);
            equiposSupervivencia.add(equipoSupervivencia);
        }
        
        
    }
    
    
    
}
