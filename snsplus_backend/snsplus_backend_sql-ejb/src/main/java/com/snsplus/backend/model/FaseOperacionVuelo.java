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
@DiscriminatorValue("VUELO")
public class FaseOperacionVuelo extends FaseOperacion{
    @ManyToOne(optional = true)
    private Vuelo padre;

    public Vuelo getPadre() {
        if (padre == null) {
            return new Vuelo();
        }
        return padre;
    }

    public void setPadre(Vuelo padre) {
        this.padre = padre;
    }
    
    
}
