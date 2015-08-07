/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.ItinerarioRutaDTO;
import com.snsplus.backend.client.facade.ItinerarioRutaFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class ItinerarioRutaDelegate extends AbstractDelegate<ItinerarioRutaFacadeRemote> implements ItinerarioRutaFacadeRemote{

    @Override
    public ItinerarioRutaDTO create(ItinerarioRutaDTO itinerarioRuta) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(itinerarioRuta);
    }

    @Override
    public ItinerarioRutaDTO edit(ItinerarioRutaDTO itinerarioRuta) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(itinerarioRuta);
    }

    @Override
    public void remove(ItinerarioRutaDTO itinerarioRuta) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(itinerarioRuta);
    }

    @Override
    public ItinerarioRutaDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<ItinerarioRutaDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<ItinerarioRutaDTO> findRange(int[] range) {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public int count() {
        return this.getDelegado(JNDI_REMOTE_NAME).count();
    }

    @Override
    public boolean isAlive() {
        return this.getDelegado(JNDI_REMOTE_NAME).isAlive();
    }
    
}