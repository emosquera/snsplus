/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.CiudadDTO;
import com.snsplus.backend.client.facade.CiudadFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class CiudadDelegate extends AbstractDelegate<CiudadFacadeRemote> implements CiudadFacadeRemote{

    @Override
    public CiudadDTO create(CiudadDTO ciudad) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(ciudad);
    }

    @Override
    public CiudadDTO edit(CiudadDTO ciudad) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(ciudad);
    }

    @Override
    public void remove(CiudadDTO ciudad) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(ciudad);
    }

    @Override
    public CiudadDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<CiudadDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<CiudadDTO> findRange(int[] range) {
        return this.getDelegado(JNDI_REMOTE_NAME).findRange(range);
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
