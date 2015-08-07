/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.ValorIndicadorDTO;
import com.snsplus.backend.client.facade.ValorIndicadorFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class ValorIndicadorDelegate extends AbstractDelegate<ValorIndicadorFacadeRemote> implements ValorIndicadorFacadeRemote{

    @Override
    public ValorIndicadorDTO create(ValorIndicadorDTO valorIndicador) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(valorIndicador);
    }

    @Override
    public ValorIndicadorDTO edit(ValorIndicadorDTO valorIndicador) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(valorIndicador);
    }

    @Override
    public void remove(ValorIndicadorDTO valorIndicador) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(valorIndicador);
    }

    @Override
    public ValorIndicadorDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<ValorIndicadorDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<ValorIndicadorDTO> findRange(int[] range) {
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