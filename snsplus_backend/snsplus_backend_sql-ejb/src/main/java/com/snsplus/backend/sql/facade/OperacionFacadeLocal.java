/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.sql.facade;

import com.snsplus.backend.model.Operacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author conamerica15
 */
@Local
public interface OperacionFacadeLocal {

    void create(Operacion operacion);

    void edit(Operacion operacion);

    void remove(Operacion operacion);

    Operacion find(Object id);

    List<Operacion> findAll();

    List<Operacion> findRange(int[] range);

    int count();
    
}
