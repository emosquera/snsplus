/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.IndicadorDTO;
import com.snsplus.backend.client.facade.IndicadorFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class IndicadorDelegate extends AbstractDelegate<IndicadorFacadeRemote> implements IndicadorFacadeRemote{

    @Override
    public IndicadorDTO create(IndicadorDTO indicador) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(indicador);
    }

    @Override
    public IndicadorDTO edit(IndicadorDTO indicador) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(indicador);
    }

    @Override
    public void remove(IndicadorDTO indicador) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(indicador);
    }

    @Override
    public IndicadorDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<IndicadorDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<IndicadorDTO> findRange(int[] range) {
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
