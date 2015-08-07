/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.OperacionDTO;
import com.snsplus.backend.client.facade.OperacionFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class OperacionDelegate extends AbstractDelegate<OperacionFacadeRemote> implements OperacionFacadeRemote{

    @Override
    public OperacionDTO create(OperacionDTO operacion) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(operacion);
    }

    @Override
    public OperacionDTO edit(OperacionDTO operacion) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(operacion);
    }

    @Override
    public void remove(OperacionDTO operacion) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(operacion);
    }

    @Override
    public OperacionDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<OperacionDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<OperacionDTO> findRange(int[] range) {
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
