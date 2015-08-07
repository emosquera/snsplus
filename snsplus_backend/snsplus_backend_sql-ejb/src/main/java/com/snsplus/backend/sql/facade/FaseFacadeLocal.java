/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.sql.facade;

import com.snsplus.backend.model.Fase;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author conamerica15
 */
@Local
public interface FaseFacadeLocal {

    void create(Fase fase);

    void edit(Fase fase);

    void remove(Fase fase);

    Fase find(Object id);

    List<Fase> findAll();

    List<Fase> findRange(int[] range);

    int count();
    
}
