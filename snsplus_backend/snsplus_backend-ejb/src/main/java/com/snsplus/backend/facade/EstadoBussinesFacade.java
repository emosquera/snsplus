/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.facade;

import com.snsplus.backend.client.dto.EstadoDTO;
import com.snsplus.backend.client.facade.EstadoFacadeRemote;
import com.snsplus.backend.model.Estado;
import com.snsplus.backend.sql.facade.EstadoFacadeLocal;
import com.snsplus.backend.utils.BackendConverter;
import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author conamerica15
 */
@Stateless(name = "EstadoBussinesFacade", mappedName = EstadoFacadeRemote.JNDI_REMOTE_NAME)
@Remote(EstadoFacadeRemote.class)
public class EstadoBussinesFacade  implements EstadoFacadeRemote{
    
    @Inject EstadoFacadeLocal estadoFacadeLocal;

    @Override
    public EstadoDTO create(EstadoDTO estadoDTO) {
        Estado estado = new Estado(estadoDTO, true);
        estadoFacadeLocal.create(estado);
        return estado;
    }

    @Override
    public EstadoDTO edit(EstadoDTO estadoDTO) {
        Estado estado = estadoFacadeLocal.find(estadoDTO.getId());
        estado.setEstado(estadoDTO.getEstado());
        estadoFacadeLocal.edit(estado);
        return estado;
    }

    @Override
    public void remove(EstadoDTO estadoDTO) {
        estadoFacadeLocal.remove(estadoFacadeLocal.find(estadoDTO.getId()));
    }

    @Override
    public EstadoDTO find(Object id) {
        return estadoFacadeLocal.find(id);
    }

    @Override
    public List<EstadoDTO> findAll() {
        return BackendConverter.estadosToestadoDTOs(estadoFacadeLocal.findAll());
    }

    @Override
    public List<EstadoDTO> findRange(int[] range) {
        return BackendConverter.estadosToestadoDTOs(estadoFacadeLocal.findRange(range));
    }

    @Override
    public int count() {
        return estadoFacadeLocal.count();
    }

    @Override
    public boolean isAlive() {
        return true;
    }            
}
