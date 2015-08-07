/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.PaisDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface PaisFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/paisFacadeRemote";
    
    PaisDTO create(PaisDTO empresa);

    PaisDTO edit(PaisDTO empresa);

    void remove(PaisDTO empresa);

    PaisDTO find(Object id);

    List<PaisDTO> findAll();

    List<PaisDTO> findRange(int[] range);

    int count();
}
