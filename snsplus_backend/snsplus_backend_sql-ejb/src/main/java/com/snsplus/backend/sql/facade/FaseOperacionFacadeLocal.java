/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.sql.facade;

import com.snsplus.backend.model.FaseOperacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author conamerica15
 */
@Local
public interface FaseOperacionFacadeLocal {

    void create(FaseOperacion faseOperacion);

    void edit(FaseOperacion faseOperacion);

    void remove(FaseOperacion faseOperacion);

    FaseOperacion find(Object id);

    List<FaseOperacion> findAll();

    List<FaseOperacion> findRange(int[] range);

    int count();
    
}
