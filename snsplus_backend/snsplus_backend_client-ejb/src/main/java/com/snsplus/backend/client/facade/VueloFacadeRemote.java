/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.VueloDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface VueloFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/vueloFacadeRemote";
    
    VueloDTO create(VueloDTO empresa);

    VueloDTO edit(VueloDTO empresa);

    void remove(VueloDTO empresa);

    VueloDTO find(Object id);

    List<VueloDTO> findAll();

    List<VueloDTO> findRange(int[] range);

    int count();
}
