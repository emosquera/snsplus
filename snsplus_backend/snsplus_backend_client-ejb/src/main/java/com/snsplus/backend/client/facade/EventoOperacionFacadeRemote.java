/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.EventoOperacionDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface EventoOperacionFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/eventoOperacionFacadeRemote";
    
    EventoOperacionDTO create(EventoOperacionDTO empresa);

    EventoOperacionDTO edit(EventoOperacionDTO empresa);

    void remove(EventoOperacionDTO empresa);

    EventoOperacionDTO find(Object id);

    List<EventoOperacionDTO> findAll();

    List<EventoOperacionDTO> findRange(int[] range);

    int count();
}
