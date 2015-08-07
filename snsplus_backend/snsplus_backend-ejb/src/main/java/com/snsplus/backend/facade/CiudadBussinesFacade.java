/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.facade;

import com.snsplus.backend.client.dto.CiudadDTO;
import com.snsplus.backend.client.facade.CiudadFacadeRemote;
import com.snsplus.backend.model.Ciudad;
import com.snsplus.backend.sql.facade.CiudadFacadeLocal;
import com.snsplus.backend.utils.BackendConverter;
import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author conamerica15
 */
@Stateless(name = "CiudadBussinesFacade", mappedName = CiudadFacadeRemote.JNDI_REMOTE_NAME)
@Remote(CiudadFacadeRemote.class)
public class CiudadBussinesFacade implements CiudadFacadeRemote{
    
    @Inject CiudadFacadeLocal ciudadFacadeLocal;

    @Override
    public CiudadDTO create(CiudadDTO ciudadDTO) {
        Ciudad ciudad = new Ciudad(ciudadDTO, true);
        ciudadFacadeLocal.create(ciudad);
        return ciudad;
    }

    @Override
    public CiudadDTO edit(CiudadDTO ciudadDTO) {
        Ciudad ciudad = ciudadFacadeLocal.find(ciudadDTO.getId());
        ciudad.setCiudad(ciudadDTO.getCiudad());
        ciudadFacadeLocal.edit(ciudad);
        return ciudad;
    }

    @Override
    public void remove(CiudadDTO ciudadDTO) {
        ciudadFacadeLocal.remove(ciudadFacadeLocal.find(ciudadDTO.getId()));
    }

    @Override
    public CiudadDTO find(Object id) {
        return ciudadFacadeLocal.find(id);
    }

    @Override
    public List<CiudadDTO> findAll() {
        return BackendConverter.ciudadesTociudadDTOs(ciudadFacadeLocal.findAll());
    }

    @Override
    public List<CiudadDTO> findRange(int[] range) {
        return BackendConverter.ciudadesTociudadDTOs(ciudadFacadeLocal.findRange(range));
    }

    @Override
    public int count() {
        return ciudadFacadeLocal.count();
    }

    @Override
    public boolean isAlive() {
        return true;
    }            
}
