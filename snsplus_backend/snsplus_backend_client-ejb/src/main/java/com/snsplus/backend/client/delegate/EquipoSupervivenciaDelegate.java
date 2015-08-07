/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.EquipoSupervivenciaDTO;
import com.snsplus.backend.client.facade.EquipoSupervivenciaFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class EquipoSupervivenciaDelegate extends AbstractDelegate<EquipoSupervivenciaFacadeRemote> implements EquipoSupervivenciaFacadeRemote{

    @Override
    public EquipoSupervivenciaDTO create(EquipoSupervivenciaDTO equipoSupervivencia) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(equipoSupervivencia);
    }

    @Override
    public EquipoSupervivenciaDTO edit(EquipoSupervivenciaDTO equipoSupervivencia) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(equipoSupervivencia);
    }

    @Override
    public void remove(EquipoSupervivenciaDTO equipoSupervivencia) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(equipoSupervivencia);
    }

    @Override
    public EquipoSupervivenciaDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<EquipoSupervivenciaDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<EquipoSupervivenciaDTO> findRange(int[] range) {
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
