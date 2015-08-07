/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.EventoDTO;
import com.snsplus.backend.client.facade.EventoFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class EventoDelegate extends AbstractDelegate<EventoFacadeRemote> implements EventoFacadeRemote{

    @Override
    public EventoDTO create(EventoDTO evento) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(evento);
    }

    @Override
    public EventoDTO edit(EventoDTO evento) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(evento);
    }

    @Override
    public void remove(EventoDTO evento) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(evento);
    }

    @Override
    public EventoDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<EventoDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<EventoDTO> findRange(int[] range) {
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
