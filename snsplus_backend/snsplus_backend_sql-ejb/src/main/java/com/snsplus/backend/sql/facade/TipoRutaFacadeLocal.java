/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.sql.facade;

import com.snsplus.backend.model.TipoRuta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author conamerica15
 */
@Local
public interface TipoRutaFacadeLocal {

    void create(TipoRuta tipoRuta);

    void edit(TipoRuta tipoRuta);

    void remove(TipoRuta tipoRuta);

    TipoRuta find(Object id);

    List<TipoRuta> findAll();

    List<TipoRuta> findRange(int[] range);

    int count();
    
}
