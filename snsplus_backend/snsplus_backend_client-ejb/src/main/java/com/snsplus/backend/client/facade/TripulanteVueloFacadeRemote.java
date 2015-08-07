/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.TripulanteVueloDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface TripulanteVueloFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/tripulanteVueloFacadeRemote";
    
    TripulanteVueloDTO create(TripulanteVueloDTO empresa);

    TripulanteVueloDTO edit(TripulanteVueloDTO empresa);

    void remove(TripulanteVueloDTO empresa);

    TripulanteVueloDTO find(Object id);

    List<TripulanteVueloDTO> findAll();

    List<TripulanteVueloDTO> findRange(int[] range);

    int count();
}
