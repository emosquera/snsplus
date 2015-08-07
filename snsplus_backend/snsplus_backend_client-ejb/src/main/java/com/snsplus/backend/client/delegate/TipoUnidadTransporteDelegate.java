/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.TipoUnidadTransporteDTO;
import com.snsplus.backend.client.facade.TipoUnidadTransporteFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class TipoUnidadTransporteDelegate extends AbstractDelegate<TipoUnidadTransporteFacadeRemote> implements TipoUnidadTransporteFacadeRemote{

    @Override
    public TipoUnidadTransporteDTO create(TipoUnidadTransporteDTO tipoUnidadTransporte) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(tipoUnidadTransporte);
    }

    @Override
    public TipoUnidadTransporteDTO edit(TipoUnidadTransporteDTO tipoUnidadTransporte) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(tipoUnidadTransporte);
    }

    @Override
    public void remove(TipoUnidadTransporteDTO tipoUnidadTransporte) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(tipoUnidadTransporte);
    }

    @Override
    public TipoUnidadTransporteDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<TipoUnidadTransporteDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<TipoUnidadTransporteDTO> findRange(int[] range) {
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
