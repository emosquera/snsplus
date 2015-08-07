/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.sql.facade;

import com.snsplus.backend.model.TripulanteVuelo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author conamerica15
 */
@Local
public interface TripulanteVueloFacadeLocal {

    void create(TripulanteVuelo tripulanteVuelo);

    void edit(TripulanteVuelo tripulanteVuelo);

    void remove(TripulanteVuelo tripulanteVuelo);

    TripulanteVuelo find(Object id);

    List<TripulanteVuelo> findAll();

    List<TripulanteVuelo> findRange(int[] range);

    int count();
    
}
