/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.TripulanteDTO;
import com.snsplus.backend.client.facade.TripulanteFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class TripulanteDelegate extends AbstractDelegate<TripulanteFacadeRemote> implements TripulanteFacadeRemote{

    @Override
    public TripulanteDTO create(TripulanteDTO tripulante) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(tripulante);
    }

    @Override
    public TripulanteDTO edit(TripulanteDTO tripulante) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(tripulante);
    }

    @Override
    public void remove(TripulanteDTO tripulante) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(tripulante);
    }

    @Override
    public TripulanteDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<TripulanteDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<TripulanteDTO> findRange(int[] range) {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public int count() {
        return this.getDelegado(JNDI_REMOTE_NAME).count();
    }

    @Override
    public boolean isAlive() {
        return this.getDelegado(JNDI_REMOTE_NAME).isAlive();
    }
    
}
