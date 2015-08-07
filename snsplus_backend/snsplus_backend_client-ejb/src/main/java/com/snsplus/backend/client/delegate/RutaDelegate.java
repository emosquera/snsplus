/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.RutaDTO;
import com.snsplus.backend.client.facade.RutaFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class RutaDelegate extends AbstractDelegate<RutaFacadeRemote> implements RutaFacadeRemote{

    @Override
    public RutaDTO create(RutaDTO ruta) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(ruta);
    }

    @Override
    public RutaDTO edit(RutaDTO ruta) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(ruta);
    }

    @Override
    public void remove(RutaDTO ruta) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(ruta);
    }

    @Override
    public RutaDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<RutaDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<RutaDTO> findRange(int[] range) {
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