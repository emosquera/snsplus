/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.sql.facade;

import com.snsplus.backend.model.ValorIndicador;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author conamerica15
 */
@Local
public interface ValorIndicadorFacadeLocal {

    void create(ValorIndicador valorIndicador);

    void edit(ValorIndicador valorIndicador);

    void remove(ValorIndicador valorIndicador);

    ValorIndicador find(Object id);

    List<ValorIndicador> findAll();

    List<ValorIndicador> findRange(int[] range);

    int count();
    
}
