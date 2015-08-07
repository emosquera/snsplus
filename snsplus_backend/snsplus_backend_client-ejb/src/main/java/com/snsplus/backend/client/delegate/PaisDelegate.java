/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.PaisDTO;
import com.snsplus.backend.client.facade.PaisFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class PaisDelegate extends AbstractDelegate<PaisFacadeRemote> implements PaisFacadeRemote{

    @Override
    public PaisDTO create(PaisDTO pais) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(pais);
    }

    @Override
    public PaisDTO edit(PaisDTO pais) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(pais);
    }

    @Override
    public void remove(PaisDTO pais) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(pais);
    }

    @Override
    public PaisDTO find(Object id) {
        PaisDTO paisDTO = this.getDelegado(JNDI_REMOTE_NAME).find(id);
        return paisDTO;
    }

    @Override
    public List<PaisDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<PaisDTO> findRange(int[] range) {
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