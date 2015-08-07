/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.sql.facade;

import com.snsplus.backend.model.Indicador;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author conamerica15
 */
@Local
public interface IndicadorFacadeLocal {

    void create(Indicador indicador);

    void edit(Indicador indicador);

    void remove(Indicador indicador);

    Indicador find(Object id);

    List<Indicador> findAll();

    List<Indicador> findRange(int[] range);

    int count();
    
}
