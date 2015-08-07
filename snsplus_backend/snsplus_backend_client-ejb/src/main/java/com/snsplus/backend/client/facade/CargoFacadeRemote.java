/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.CargoDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface CargoFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/cargoFacadeRemote";
    
    CargoDTO create(CargoDTO cargoDTO);

    CargoDTO edit(CargoDTO cargoDTO);

    void remove(CargoDTO cargoDTO);

    CargoDTO find(Object id);

    List<CargoDTO> findAll();

    List<CargoDTO> findRange(int[] range);

    int count();
}
