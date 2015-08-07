/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.dto;

import com.snsplus.backend.client.enums.TipoDato;
import com.snsplus.backend.client.enums.TipoIndicador;
import com.snsplus.backend.client.enums.TipoPadreIndicador;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author conamerica15
 */
@XmlRootElement(name = "indicador")
public class IndicadorDTO extends GeneralDTO{
    private String titulo;
    private String descripcion;
    private String codigo;
    private TipoIndicador tipoIndicador;
    private TipoDato tipoDato;
    private TipoPadreIndicador tipoPadre;
    private Boolean obligatorio;
    private int caracteresPermitidos;
    private int decimalesPermitidos;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoIndicador getTipoIndicador() {
        return tipoIndicador;
    }

    public void setTipoIndicador(TipoIndicador tipoIndicador) {
        this.tipoIndicador = tipoIndicador;
    }

    public TipoDato getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(TipoDato tipoDato) {
        this.tipoDato = tipoDato;
    }

    public TipoPadreIndicador getTipoPadre() {
        return tipoPadre;
    }

    public void setTipoPadre(TipoPadreIndicador tipoPadre) {
        this.tipoPadre = tipoPadre;
    }

    public Boolean isObligatorio() {
        return obligatorio;
    }

    public void setObligatorio(Boolean obligatorio) {
        this.obligatorio = obligatorio;
    }

    public int getCaracteresPermitidos() {
        return caracteresPermitidos;
    }

    public void setCaracteresPermitidos(int caracteresPermitidos) {
        this.caracteresPermitidos = caracteresPermitidos;
    }

    public int getDecimalesPermitidos() {
        return decimalesPermitidos;
    }

    public void setDecimalesPermitidos(int decimalesPermitidos) {
        this.decimalesPermitidos = decimalesPermitidos;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().
                append("IndicadorDTO{ id = ").append(this.getId()).
                append(", version = ").append(this.getVersion()).
                append(", descripcion = ").append(descripcion).
                append(", titulo = ").append(titulo).
                append(", codigo = ").append(codigo).
                append(", tipoIndicador = ").append(tipoIndicador).
                append(", tipoDato = ").append(tipoDato).
                append(", tipoPadre = ").append(tipoPadre).
                append(", obligatorio = ").append(obligatorio).
                append(", caracteresPermitidos = ").append(caracteresPermitidos).
                append(", decimalesPermitidos = ").append(decimalesPermitidos).
                append('}').toString();
    }
}
