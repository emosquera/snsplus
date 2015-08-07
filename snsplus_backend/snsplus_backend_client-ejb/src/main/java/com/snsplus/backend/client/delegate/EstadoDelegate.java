/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.EstadoDTO;
import com.snsplus.backend.client.facade.EstadoFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class EstadoDelegate extends AbstractDelegate<EstadoFacadeRemote> implements EstadoFacadeRemote{

    @Override
    public EstadoDTO create(EstadoDTO estado) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(estado);
    }

    @Override
    public EstadoDTO edit(EstadoDTO estado) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(estado);
    }

    @Override
    public void remove(EstadoDTO estado) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(estado);
    }

    @Override
    public EstadoDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<EstadoDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<EstadoDTO> findRange(int[] range) {
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

