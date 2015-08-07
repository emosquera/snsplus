/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.EventoDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface EventoFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/eventoFacadeRemote";
    
    EventoDTO create(EventoDTO empresa);

    EventoDTO edit(EventoDTO empresa);

    void remove(EventoDTO empresa);

    EventoDTO find(Object id);

    List<EventoDTO> findAll();

    List<EventoDTO> findRange(int[] range);

    int count();
}
