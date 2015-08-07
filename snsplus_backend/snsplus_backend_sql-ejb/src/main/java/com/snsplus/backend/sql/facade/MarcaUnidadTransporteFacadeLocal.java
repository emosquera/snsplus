/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.sql.facade;

import com.snsplus.backend.model.MarcaUnidadTransporte;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author conamerica15
 */
@Local
public interface MarcaUnidadTransporteFacadeLocal {

    void create(MarcaUnidadTransporte marcaUnidadTransporte);

    void edit(MarcaUnidadTransporte marcaUnidadTransporte);

    void remove(MarcaUnidadTransporte marcaUnidadTransporte);

    MarcaUnidadTransporte find(Object id);

    List<MarcaUnidadTransporte> findAll();

    List<MarcaUnidadTransporte> findRange(int[] range);

    int count();
    
}
