/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.ModeloUnidadTransporteDTO;
import com.snsplus.backend.client.facade.ModeloUnidadTransporteFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class ModeloUnidadTransporteDelegate extends AbstractDelegate<ModeloUnidadTransporteFacadeRemote> implements ModeloUnidadTransporteFacadeRemote{

    @Override
    public ModeloUnidadTransporteDTO create(ModeloUnidadTransporteDTO modeloUnidadTransporte) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(modeloUnidadTransporte);
    }

    @Override
    public ModeloUnidadTransporteDTO edit(ModeloUnidadTransporteDTO modeloUnidadTransporte) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(modeloUnidadTransporte);
    }

    @Override
    public void remove(ModeloUnidadTransporteDTO modeloUnidadTransporte) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(modeloUnidadTransporte);
    }

    @Override
    public ModeloUnidadTransporteDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<ModeloUnidadTransporteDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<ModeloUnidadTransporteDTO> findRange(int[] range) {
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