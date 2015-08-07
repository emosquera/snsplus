/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.TerminalDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface TerminalFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/terminalFacadeRemote";
    
    TerminalDTO create(TerminalDTO empresa);

    TerminalDTO edit(TerminalDTO empresa);

    void remove(TerminalDTO empresa);

    TerminalDTO find(Object id);

    List<TerminalDTO> findAll();

    List<TerminalDTO> findRange(int[] range);

    int count();
}
