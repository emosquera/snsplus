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
@DiscriminatorValue("FASE")
public class ValorIndicadorFase extends ValorIndicador{
    @ManyToOne
    private FaseOperacion padre;

    public FaseOperacion getPadre() {
        if (padre == null) {
            return new FaseOperacion();
        }
        return padre;
    }

    public void setPadre(FaseOperacion padre) {
        this.padre = padre;
    }
    
}
