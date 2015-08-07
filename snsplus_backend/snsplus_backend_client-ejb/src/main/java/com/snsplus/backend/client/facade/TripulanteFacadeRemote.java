/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.TripulanteDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface TripulanteFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/tripulanteFacadeRemote";
    
    TripulanteDTO create(TripulanteDTO empresa);

    TripulanteDTO edit(TripulanteDTO empresa);

    void remove(TripulanteDTO empresa);

    TripulanteDTO find(Object id);

    List<TripulanteDTO> findAll();

    List<TripulanteDTO> findRange(int[] range);

    int count();
}
