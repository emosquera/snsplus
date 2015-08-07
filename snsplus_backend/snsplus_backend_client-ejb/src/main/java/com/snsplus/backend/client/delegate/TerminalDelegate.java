/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.TerminalDTO;
import com.snsplus.backend.client.facade.TerminalFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class TerminalDelegate extends AbstractDelegate<TerminalFacadeRemote> implements TerminalFacadeRemote{

    @Override
    public TerminalDTO create(TerminalDTO terminal) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(terminal);
    }

    @Override
    public TerminalDTO edit(TerminalDTO terminal) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(terminal);
    }

    @Override
    public void remove(TerminalDTO terminal) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(terminal);
    }

    @Override
    public TerminalDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<TerminalDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<TerminalDTO> findRange(int[] range) {
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