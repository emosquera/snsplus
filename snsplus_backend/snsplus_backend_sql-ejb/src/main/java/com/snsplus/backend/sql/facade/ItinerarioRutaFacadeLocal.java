/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.sql.facade;

import com.snsplus.backend.model.ItinerarioRuta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author conamerica15
 */
@Local
public interface ItinerarioRutaFacadeLocal {

    void create(ItinerarioRuta itinerarioRuta);

    void edit(ItinerarioRuta itinerarioRuta);

    void remove(ItinerarioRuta itinerarioRuta);

    ItinerarioRuta find(Object id);

    List<ItinerarioRuta> findAll();

    List<ItinerarioRuta> findRange(int[] range);

    int count();
    
}
