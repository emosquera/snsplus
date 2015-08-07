/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.PersonaDTO;
import com.snsplus.backend.client.facade.PersonaFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class PersonaDelegate extends AbstractDelegate<PersonaFacadeRemote> implements PersonaFacadeRemote{

    @Override
    public PersonaDTO create(PersonaDTO persona) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(persona);
    }

    @Override
    public PersonaDTO edit(PersonaDTO persona) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(persona);
    }

    @Override
    public void remove(PersonaDTO persona) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(persona);
    }

    @Override
    public PersonaDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<PersonaDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<PersonaDTO> findRange(int[] range) {
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