/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.sql.facade;

import com.snsplus.backend.model.Terminal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author conamerica15
 */
@Local
public interface TerminalFacadeLocal {

    void create(Terminal terminal);

    void edit(Terminal terminal);

    void remove(Terminal terminal);

    Terminal find(Object id);

    List<Terminal> findAll();

    List<Terminal> findRange(int[] range);

    int count();
    
}
