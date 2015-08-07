/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.frontend.controllers.view;

import com.snsplus.backend.client.delegate.PaisDelegate;
import com.snsplus.backend.client.dto.CiudadDTO;
import com.snsplus.backend.client.dto.EstadoDTO;
import com.snsplus.backend.client.dto.PaisDTO;
import com.snsplus.backend.client.dto.TerminalDTO;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author conamerica15
 */
@Named(value = "indexViewBean")
@ViewScoped
public class IndexViewBean implements Serializable{

    private PaisDTO pais;
    private EstadoDTO estado;
    private CiudadDTO ciudad;
    private TerminalDTO terminal;
    private final PaisDelegate paisDelegate = new PaisDelegate();
    
    
    /**
     * Creates a new instance of IndexViewBean
     */
    public IndexViewBean() {

    }

    public PaisDTO getPais() {
        return pais;
    }

    public void setPais(PaisDTO pais) {
        this.pais = pais;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public void setEstado(EstadoDTO estado) {
        this.estado = estado;
    }

    public CiudadDTO getCiudad() {
        return ciudad;
    }

    public void setCiudad(CiudadDTO ciudad) {
        this.ciudad = ciudad;
    }

    public TerminalDTO getTerminal() {
        return terminal;
    }

    public void setTerminal(TerminalDTO terminal) {
        this.terminal = terminal;
    }

    @PostConstruct
    public void init() {
        pais = paisDelegate.find(Long.parseLong("1"));
    }
}
