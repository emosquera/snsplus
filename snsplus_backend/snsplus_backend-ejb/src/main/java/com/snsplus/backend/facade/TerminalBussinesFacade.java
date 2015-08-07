/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.facade;

import com.snsplus.backend.client.dto.TerminalDTO;
import com.snsplus.backend.client.facade.TerminalFacadeRemote;
import com.snsplus.backend.mapper.TerminalMapper;
import com.snsplus.backend.model.Terminal;
import com.snsplus.backend.sql.facade.TerminalFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author conamerica15
 */
@Stateless(name = "TerminalBussinesFacade", mappedName = TerminalFacadeRemote.JNDI_REMOTE_NAME)
@Remote(TerminalFacadeRemote.class)
public class TerminalBussinesFacade implements TerminalFacadeRemote{
    
    @EJB
    private TerminalFacadeLocal terminalFacadeLocal;
    
    @Inject 
    private TerminalMapper terminalMapper;

    @Override
    public TerminalDTO create(TerminalDTO terminalDTO) {       
        Terminal terminal = new Terminal(terminalDTO, true);      
        terminalFacadeLocal.create(terminal);
        return terminalMapper.terminalToTerminalDTO(terminal);
    }

    @Override
    public TerminalDTO edit(TerminalDTO terminalDTO) {
        Terminal terminal = terminalFacadeLocal.find(terminalDTO.getId());
        terminal.setAbreviatura(terminalDTO.getAbreviatura());        
        terminalFacadeLocal.edit(terminal);
        return terminalMapper.terminalToTerminalDTO(terminal);
    }

    @Override
    public void remove(TerminalDTO terminalDTO) {
        terminalFacadeLocal.remove(terminalFacadeLocal.find(terminalDTO.getId()));
    }

    @Override
    public TerminalDTO find(Object id) {
        return terminalMapper.terminalToTerminalDTO(terminalFacadeLocal.find(id));
    }

    @Override
    public List<TerminalDTO> findAll() {
        return terminalMapper.terminalesToTerminalDTOs(terminalFacadeLocal.findAll());        
    }

    @Override
    public List<TerminalDTO> findRange(int[] range) {
        return terminalMapper.terminalesToTerminalDTOs(terminalFacadeLocal.findRange(range));
    }

    @Override
    public int count() {
        return terminalFacadeLocal.count();
    }

    @Override
    public boolean isAlive() {
        return true;
    }            
    
}
