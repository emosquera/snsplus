/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.OperacionDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface OperacionFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/operacionFacadeRemote";
    
    OperacionDTO create(OperacionDTO empresa);

    OperacionDTO edit(OperacionDTO empresa);

    void remove(OperacionDTO empresa);

    OperacionDTO find(Object id);

    List<OperacionDTO> findAll();

    List<OperacionDTO> findRange(int[] range);

    int count();
}
