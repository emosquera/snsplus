/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.sql.facade;

import com.snsplus.backend.model.TripulanteVuelo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author conamerica15
 */
@Stateless
public class TripulanteVueloFacade extends AbstractFacade<TripulanteVuelo> implements TripulanteVueloFacadeLocal {
    @PersistenceContext(unitName = "snsplus_backend_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TripulanteVueloFacade() {
        super(TripulanteVuelo.class);
    }
    
}
