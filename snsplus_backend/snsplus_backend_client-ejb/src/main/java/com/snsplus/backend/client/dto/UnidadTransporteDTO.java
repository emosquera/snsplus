/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author conamerica15
 */
@XmlRootElement(name = "unidad_transporte")
public class UnidadTransporteDTO extends GeneralDTO{
    private String matricula;
    private String serial;
    private TipoUnidadTransporteDTO tipoUnidadTransporteDTO;
    private int cantidadPasajerosPermitidos;
    private Double kilosPermitidos;
    private String color;
    private Date vencimientoCertificado;
    private String propietario;
    private ModeloUnidadTransporteDTO modeloUnidadTransporteDTO;
    private MarcaUnidadTransporteDTO marcaUnidadTransporteDTO;
    private EmpresaDTO empresaDTO;
    private List<EquipoSupervivenciaDTO> equipoSupervivenciaDTOs;
    private List<RutaDTO> rutaDTOs;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public TipoUnidadTransporteDTO getTipoUnidadTransporteDTO() {
        if (tipoUnidadTransporteDTO == null) {
            tipoUnidadTransporteDTO = new TipoUnidadTransporteDTO();
        }
        return tipoUnidadTransporteDTO;
    }

    public void setTipoUnidadTransporteDTO(TipoUnidadTransporteDTO tipoUnidadTransporteDTO) {
        this.tipoUnidadTransporteDTO = tipoUnidadTransporteDTO;
    }

    public int getCantidadPasajerosPermitidos() {
        return cantidadPasajerosPermitidos;
    }

    public void setCantidadPasajerosPermitidos(int cantidadPasajerosPermitidos) {
        this.cantidadPasajerosPermitidos = cantidadPasajerosPermitidos;
    }

    public Double getKilosPermitidos() {
        return kilosPermitidos;
    }

    public void setKilosPermitidos(Double kilosPermitidos) {
        this.kilosPermitidos = kilosPermitidos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getVencimientoCertificado() {
        return vencimientoCertificado;
    }

    public void setVencimientoCertificado(Date vencimientoCertificado) {
        this.vencimientoCertificado = vencimientoCertificado;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public ModeloUnidadTransporteDTO getModeloUnidadTransporteDTO() {
        if (modeloUnidadTransporteDTO == null) {
            modeloUnidadTransporteDTO = new ModeloUnidadTransporteDTO();
        }
        return modeloUnidadTransporteDTO;
    }

    public void setModeloUnidadTransporteDTO(ModeloUnidadTransporteDTO modeloUnidadTransporteDTO) {
        this.modeloUnidadTransporteDTO = modeloUnidadTransporteDTO;
    }

    public MarcaUnidadTransporteDTO getMarcaUnidadTransporteDTO() {
        if (marcaUnidadTransporteDTO == null) {
            marcaUnidadTransporteDTO = new MarcaUnidadTransporteDTO();
        }
        return marcaUnidadTransporteDTO;
    }

    public void setMarcaUnidadTransporteDTO(MarcaUnidadTransporteDTO marcaUnidadTransporteDTO) {
        this.marcaUnidadTransporteDTO = marcaUnidadTransporteDTO;
    }

    public EmpresaDTO getEmpresaDTO() {
        if (empresaDTO == null) {
            empresaDTO = new EmpresaDTO();
        }
        return empresaDTO;
    }

    public void setEmpresaDTO(EmpresaDTO empresaDTO) {
        this.empresaDTO = empresaDTO;
    }

    public List<EquipoSupervivenciaDTO> getEquipoSupervivenciaDTOs() {
        if (equipoSupervivenciaDTOs == null) {
            equipoSupervivenciaDTOs = new ArrayList<>();
        }
        return equipoSupervivenciaDTOs;
    }

    public void setEquipoSupervivenciaDTOs(List<EquipoSupervivenciaDTO> equipoSupervivenciaDTOs) {
        this.equipoSupervivenciaDTOs = equipoSupervivenciaDTOs;
    }
    
    private String equipoSupervivenciaDTOsToString(){
        StringBuilder equiposToString = new StringBuilder();
        for (EquipoSupervivenciaDTO equipo : this.getEquipoSupervivenciaDTOs()) {
            equiposToString.append(equipo.toString());
        }
        return equiposToString.toString();
    }

    public List<RutaDTO> getRutaDTOs() {
        return rutaDTOs;
    }

    public void setRutaDTOs(List<RutaDTO> rutaDTOs) {
        this.rutaDTOs = rutaDTOs;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("UnidadTransporteDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", matricula = ").append(matricula).
                append(", serial = ").append(serial).
                append(", tipoUnidadTransporte = ").append(tipoUnidadTransporteDTO).
                append(", cantidadPasajerosPermitidos = ").append(cantidadPasajerosPermitidos).
                append(", kilosPermitidos = ").append(kilosPermitidos).
                append(", color = ").append(color).
                append(", vencimientoCertificado = ").append(vencimientoCertificado).
                append(", propietario = ").append(propietario).
                append(", modeloUnidadTransporte = ").append(modeloUnidadTransporteDTO).
                append(", marcaUnidadTransporte = ").append(marcaUnidadTransporteDTO).
                append(", empresa = ").append(empresaDTO).
                append(", equiposSupervivencia = ").append(this.equipoSupervivenciaDTOsToString()).
                append('}').toString();
    }
    
}
