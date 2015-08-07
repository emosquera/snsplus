/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.sql.facade;

import com.snsplus.backend.model.Tripulante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author conamerica15
 */
@Local
public interface TripulanteFacadeLocal {

    void create(Tripulante tripulante);

    void edit(Tripulante tripulante);

    void remove(Tripulante tripulante);

    Tripulante find(Object id);

    List<Tripulante> findAll();

    List<Tripulante> findRange(int[] range);

    int count();
    
}
