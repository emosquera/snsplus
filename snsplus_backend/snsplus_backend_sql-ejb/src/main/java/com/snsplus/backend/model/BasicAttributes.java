/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;

/**
 *
 * @author conamerica15
 */
@Embeddable
public class BasicAttributes implements Serializable {

    @Column(name = "fecha_modificacion")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Calendar fechaModificacion;
    
    @Column(name = "fecha_registro")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Calendar fechaRegistro;

    /**
     *
     * @return
     */
   

    @PrePersist
    void creadoEl() {
        this.fechaRegistro = this.fechaModificacion = Calendar.getInstance();
    }

    @PreUpdate
    void modificadoEl() {
        this.fechaModificacion = Calendar.getInstance();
    }

}
