/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.sql.facade;

import com.snsplus.backend.model.EventoOperacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author conamerica15
 */
@Local
public interface EventoOperacionFacadeLocal {

    void create(EventoOperacion eventoOperacion);

    void edit(EventoOperacion eventoOperacion);

    void remove(EventoOperacion eventoOperacion);

    EventoOperacion find(Object id);

    List<EventoOperacion> findAll();

    List<EventoOperacion> findRange(int[] range);

    int count();
    
}
