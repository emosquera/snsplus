/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.sql.facade;

import com.snsplus.backend.model.EquipoSupervivencia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author conamerica15
 */
@Stateless
public class EquipoSupervivenciaFacade extends AbstractFacade<EquipoSupervivencia> implements EquipoSupervivenciaFacadeLocal {
    @PersistenceContext(unitName = "snsplus_backend_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EquipoSupervivenciaFacade() {
        super(EquipoSupervivencia.class);
    }
    
}
