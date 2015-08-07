/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.FaseOperacionDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface FaseOperacionFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/faseOperacionFacadeRemote";
    
    FaseOperacionDTO create(FaseOperacionDTO empresa);

    FaseOperacionDTO edit(FaseOperacionDTO empresa);

    void remove(FaseOperacionDTO empresa);

    FaseOperacionDTO find(Object id);

    List<FaseOperacionDTO> findAll();

    List<FaseOperacionDTO> findRange(int[] range);

    int count();
}
