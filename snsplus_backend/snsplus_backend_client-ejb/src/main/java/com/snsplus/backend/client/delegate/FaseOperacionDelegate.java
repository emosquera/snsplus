/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.FaseOperacionDTO;
import com.snsplus.backend.client.facade.FaseOperacionFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class FaseOperacionDelegate extends AbstractDelegate<FaseOperacionFacadeRemote> implements FaseOperacionFacadeRemote{

    @Override
    public FaseOperacionDTO create(FaseOperacionDTO faseOperacion) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(faseOperacion);
    }

    @Override
    public FaseOperacionDTO edit(FaseOperacionDTO faseOperacion) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(faseOperacion);
    }

    @Override
    public void remove(FaseOperacionDTO faseOperacion) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(faseOperacion);
    }

    @Override
    public FaseOperacionDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<FaseOperacionDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<FaseOperacionDTO> findRange(int[] range) {
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