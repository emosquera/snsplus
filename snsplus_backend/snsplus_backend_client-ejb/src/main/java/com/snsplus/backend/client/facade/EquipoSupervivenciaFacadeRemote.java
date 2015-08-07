/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.EquipoSupervivenciaDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface EquipoSupervivenciaFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/equipoSupervivenciaFacadeRemote";
    
    EquipoSupervivenciaDTO create(EquipoSupervivenciaDTO empresa);

    EquipoSupervivenciaDTO edit(EquipoSupervivenciaDTO empresa);

    void remove(EquipoSupervivenciaDTO empresa);

    EquipoSupervivenciaDTO find(Object id);

    List<EquipoSupervivenciaDTO> findAll();

    List<EquipoSupervivenciaDTO> findRange(int[] range);

    int count();
}
