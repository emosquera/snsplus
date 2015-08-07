/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.EstadoDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface EstadoFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/estadoFacadeRemote";
    
    EstadoDTO create(EstadoDTO empresa);

    EstadoDTO edit(EstadoDTO empresa);

    void remove(EstadoDTO empresa);

    EstadoDTO find(Object id);

    List<EstadoDTO> findAll();

    List<EstadoDTO> findRange(int[] range);

    int count();
}
