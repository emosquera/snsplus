/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.EventoOperacionDTO;
import com.snsplus.backend.client.facade.EventoOperacionFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class EventoOperacionDelegate extends AbstractDelegate<EventoOperacionFacadeRemote> implements EventoOperacionFacadeRemote{

    @Override
    public EventoOperacionDTO create(EventoOperacionDTO eventoOperacion) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(eventoOperacion);
    }

    @Override
    public EventoOperacionDTO edit(EventoOperacionDTO eventoOperacion) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(eventoOperacion);
    }

    @Override
    public void remove(EventoOperacionDTO eventoOperacion) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(eventoOperacion);
    }

    @Override
    public EventoOperacionDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<EventoOperacionDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<EventoOperacionDTO> findRange(int[] range) {
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
