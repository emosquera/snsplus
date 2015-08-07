/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.FaseDTO;
import com.snsplus.backend.client.facade.FaseFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class FaseDelegate extends AbstractDelegate<FaseFacadeRemote> implements FaseFacadeRemote{

    @Override
    public FaseDTO create(FaseDTO fase) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(fase);
    }

    @Override
    public FaseDTO edit(FaseDTO fase) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(fase);
    }

    @Override
    public void remove(FaseDTO fase) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(fase);
    }

    @Override
    public FaseDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<FaseDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<FaseDTO> findRange(int[] range) {
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
