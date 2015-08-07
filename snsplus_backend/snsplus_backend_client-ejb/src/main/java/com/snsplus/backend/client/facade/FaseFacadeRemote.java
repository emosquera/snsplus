/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;


import com.snsplus.backend.client.dto.FaseDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface FaseFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/faseFacadeRemote";
    
    FaseDTO create(FaseDTO empresa);

    FaseDTO edit(FaseDTO empresa);

    void remove(FaseDTO empresa);

    FaseDTO find(Object id);

    List<FaseDTO> findAll();

    List<FaseDTO> findRange(int[] range);

    int count();
}
