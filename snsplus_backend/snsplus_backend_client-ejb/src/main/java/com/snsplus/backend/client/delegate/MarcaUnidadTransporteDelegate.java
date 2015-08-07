/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.MarcaUnidadTransporteDTO;
import com.snsplus.backend.client.facade.MarcaUnidadTransporteFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class MarcaUnidadTransporteDelegate extends AbstractDelegate<MarcaUnidadTransporteFacadeRemote> implements MarcaUnidadTransporteFacadeRemote{

    @Override
    public MarcaUnidadTransporteDTO create(MarcaUnidadTransporteDTO marcaUnidadTransporte) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(marcaUnidadTransporte);
    }

    @Override
    public MarcaUnidadTransporteDTO edit(MarcaUnidadTransporteDTO marcaUnidadTransporte) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(marcaUnidadTransporte);
    }

    @Override
    public void remove(MarcaUnidadTransporteDTO marcaUnidadTransporte) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(marcaUnidadTransporte);
    }

    @Override
    public MarcaUnidadTransporteDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<MarcaUnidadTransporteDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<MarcaUnidadTransporteDTO> findRange(int[] range) {
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
