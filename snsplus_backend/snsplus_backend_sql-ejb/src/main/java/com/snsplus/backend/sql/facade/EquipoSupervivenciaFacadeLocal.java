/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.sql.facade;

import com.snsplus.backend.model.EquipoSupervivencia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author conamerica15
 */
@Local
public interface EquipoSupervivenciaFacadeLocal {

    void create(EquipoSupervivencia equipoSupervivencia);

    void edit(EquipoSupervivencia equipoSupervivencia);

    void remove(EquipoSupervivencia equipoSupervivencia);

    EquipoSupervivencia find(Object id);

    List<EquipoSupervivencia> findAll();

    List<EquipoSupervivencia> findRange(int[] range);

    int count();
    
}
