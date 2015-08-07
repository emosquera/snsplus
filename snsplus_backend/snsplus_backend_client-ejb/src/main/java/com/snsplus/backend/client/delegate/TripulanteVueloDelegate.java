/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.TripulanteVueloDTO;
import com.snsplus.backend.client.facade.TripulanteVueloFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class TripulanteVueloDelegate extends AbstractDelegate<TripulanteVueloFacadeRemote> implements TripulanteVueloFacadeRemote{

    @Override
    public TripulanteVueloDTO create(TripulanteVueloDTO tripulanteVuelo) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(tripulanteVuelo);
    }

    @Override
    public TripulanteVueloDTO edit(TripulanteVueloDTO tripulanteVuelo) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(tripulanteVuelo);
    }

    @Override
    public void remove(TripulanteVueloDTO tripulanteVuelo) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(tripulanteVuelo);
    }

    @Override
    public TripulanteVueloDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<TripulanteVueloDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<TripulanteVueloDTO> findRange(int[] range) {
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
