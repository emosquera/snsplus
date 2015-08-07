/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.TipoRutaDTO;
import com.snsplus.backend.client.facade.TipoRutaFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class TipoRutaDelegate extends AbstractDelegate<TipoRutaFacadeRemote> implements TipoRutaFacadeRemote{

    @Override
    public TipoRutaDTO create(TipoRutaDTO tipoRuta) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(tipoRuta);
    }

    @Override
    public TipoRutaDTO edit(TipoRutaDTO tipoRuta) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(tipoRuta);
    }

    @Override
    public void remove(TipoRutaDTO tipoRuta) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(tipoRuta);
    }

    @Override
    public TipoRutaDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<TipoRutaDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<TipoRutaDTO> findRange(int[] range) {
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