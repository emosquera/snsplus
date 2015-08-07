/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.CargoDTO;
import com.snsplus.backend.client.facade.CargoFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class CargoDelegate extends AbstractDelegate<CargoFacadeRemote> implements CargoFacadeRemote{

    @Override
    public CargoDTO create(CargoDTO cargo) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(cargo);
    }

    @Override
    public CargoDTO edit(CargoDTO cargo) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(cargo);
    }

    @Override
    public void remove(CargoDTO cargo) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(cargo);
    }

    @Override
    public CargoDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public List<CargoDTO> findAll() {
        return this.getDelegado(JNDI_REMOTE_NAME).findAll();
    }

    @Override
    public List<CargoDTO> findRange(int[] range) {
        return this.getDelegado(JNDI_REMOTE_NAME).findRange(range);
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
