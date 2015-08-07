/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.CiudadDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface CiudadFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/ciudadFacadeRemote";
    
    CiudadDTO create(CiudadDTO ciudadDTO);

    CiudadDTO edit(CiudadDTO ciudadDTO);

    void remove(CiudadDTO ciudadDTO);

    CiudadDTO find(Object id);

    List<CiudadDTO> findAll();

    List<CiudadDTO> findRange(int[] range);

    int count();
}
