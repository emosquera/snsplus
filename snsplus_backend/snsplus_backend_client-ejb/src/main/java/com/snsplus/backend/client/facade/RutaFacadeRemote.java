/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.RutaDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface RutaFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/rutaFacadeRemote";
    
    RutaDTO create(RutaDTO empresa);

    RutaDTO edit(RutaDTO empresa);

    void remove(RutaDTO empresa);

    RutaDTO find(Object id);

    List<RutaDTO> findAll();

    List<RutaDTO> findRange(int[] range);

    int count();
}
