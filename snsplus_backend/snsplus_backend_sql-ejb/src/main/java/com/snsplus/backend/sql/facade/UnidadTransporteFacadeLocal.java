/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.sql.facade;

import com.snsplus.backend.model.UnidadTransporte;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author conamerica15
 */
@Local
public interface UnidadTransporteFacadeLocal {

    void create(UnidadTransporte unidadTransporte);

    void edit(UnidadTransporte unidadTransporte);

    void remove(UnidadTransporte unidadTransporte);

    UnidadTransporte find(Object id);

    List<UnidadTransporte> findAll();

    List<UnidadTransporte> findRange(int[] range);

    int count();
    
}
