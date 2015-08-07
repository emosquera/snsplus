/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.sql.facade;

import com.snsplus.backend.model.Vuelo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author conamerica15
 */
@Local
public interface VueloFacadeLocal {

    void create(Vuelo vuelo);

    void edit(Vuelo vuelo);

    void remove(Vuelo vuelo);

    Vuelo find(Object id);

    List<Vuelo> findAll();

    List<Vuelo> findRange(int[] range);

    int count();
    
}
