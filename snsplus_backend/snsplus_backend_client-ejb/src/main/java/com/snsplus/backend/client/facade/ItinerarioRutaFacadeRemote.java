/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.ItinerarioRutaDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface ItinerarioRutaFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/itinerarioRutaFacadeRemote";
    
    ItinerarioRutaDTO create(ItinerarioRutaDTO empresa);

    ItinerarioRutaDTO edit(ItinerarioRutaDTO empresa);

    void remove(ItinerarioRutaDTO empresa);

    ItinerarioRutaDTO find(Object id);

    List<ItinerarioRutaDTO> findAll();

    List<ItinerarioRutaDTO> findRange(int[] range);

    int count();
}
