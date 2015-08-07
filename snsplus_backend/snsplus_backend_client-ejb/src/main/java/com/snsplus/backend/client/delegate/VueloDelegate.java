/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.VueloDTO;
import com.snsplus.backend.client.facade.VueloFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class VueloDelegate extends AbstractDelegate<VueloFacadeRemote> implements VueloFacadeRemote{

    @Override
    public VueloDTO create(VueloDTO vuelo) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(vuelo);
    }

    @Override
    public VueloDTO edit(VueloDTO vuelo) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(vuelo);
    }

    @Override
    public void remove(VueloDTO vuelo) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(vuelo);
    }

    @Override
    public VueloDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<VueloDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<VueloDTO> findRange(int[] range) {
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
