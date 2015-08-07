/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.UnidadTransporteDTO;
import com.snsplus.backend.client.facade.UnidadTransporteFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class UnidadTransporteDelegate extends AbstractDelegate<UnidadTransporteFacadeRemote> implements UnidadTransporteFacadeRemote{

    @Override
    public UnidadTransporteDTO create(UnidadTransporteDTO unidadTransporte) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(unidadTransporte);
    }

    @Override
    public UnidadTransporteDTO edit(UnidadTransporteDTO unidadTransporte) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(unidadTransporte);
    }

    @Override
    public void remove(UnidadTransporteDTO unidadTransporte) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(unidadTransporte);
    }

    @Override
    public UnidadTransporteDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<UnidadTransporteDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<UnidadTransporteDTO> findRange(int[] range) {
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