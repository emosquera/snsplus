/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author conamerica15
 */
@Entity
@DiscriminatorValue("EVENTO")
public class IndicadorEvento extends Indicador{
    
    private Evento padre;

    @ManyToOne(optional = true)
    public Evento getPadre() {
        if (padre == null) {
            return new Evento();
        }
        return padre;
    }

    public void setPadre(Evento padre) {
        this.padre = padre;
    }
    
}
