/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.sql.facade;

import com.snsplus.backend.model.TipoUnidadTransporte;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author conamerica15
 */
@Local
public interface TipoUnidadTransporteFacadeLocal {

    void create(TipoUnidadTransporte tipoUnidadTransporte);

    void edit(TipoUnidadTransporte tipoUnidadTransporte);

    void remove(TipoUnidadTransporte tipoUnidadTransporte);

    TipoUnidadTransporte find(Object id);

    List<TipoUnidadTransporte> findAll();

    List<TipoUnidadTransporte> findRange(int[] range);

    int count();
    
}