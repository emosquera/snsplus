/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.sql.facade;

import com.snsplus.backend.model.ModeloUnidadTransporte;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author conamerica15
 */
@Local
public interface ModeloUnidadTransporteFacadeLocal {

    void create(ModeloUnidadTransporte modeloUnidadTransporte);

    void edit(ModeloUnidadTransporte modeloUnidadTransporte);

    void remove(ModeloUnidadTransporte modeloUnidadTransporte);

    ModeloUnidadTransporte find(Object id);

    List<ModeloUnidadTransporte> findAll();

    List<ModeloUnidadTransporte> findRange(int[] range);

    int count();
    
}
