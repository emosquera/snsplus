/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.facade;

import com.snsplus.backend.client.dto.EquipoSupervivenciaDTO;
import com.snsplus.backend.client.facade.EquipoSupervivenciaFacadeRemote;
import com.snsplus.backend.mapper.EquipoSupervivenciaMapper;
import com.snsplus.backend.model.EquipoSupervivencia;
import com.snsplus.backend.sql.facade.EquipoSupervivenciaFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author conamerica15
 */
@Stateless(name = "EquipoSupervivenciaBussinesFacade", mappedName = EquipoSupervivenciaFacadeRemote.JNDI_REMOTE_NAME)
@Remote(EquipoSupervivenciaFacadeRemote.class)
public class EquipoSupervivenciaBussinesFacade implements EquipoSupervivenciaFacadeRemote{
    @EJB
    private EquipoSupervivenciaFacadeLocal equipoSupervivenciaFacadeLocal;
    
    @Inject 
    private EquipoSupervivenciaMapper equipoSupervivenciaMapper;

    @Override
    public EquipoSupervivenciaDTO create(EquipoSupervivenciaDTO equipoSupervivenciaDTO) {       
        EquipoSupervivencia equipoSupervivencia = new EquipoSupervivencia(equipoSupervivenciaDTO);      
        equipoSupervivenciaFacadeLocal.create(equipoSupervivencia);
        return equipoSupervivenciaMapper.equipoSupervivenciaToEquipoSupervivenciaDTO(equipoSupervivencia);
    }

    @Override
    public EquipoSupervivenciaDTO edit(EquipoSupervivenciaDTO equipoSupervivenciaDTO) {
        EquipoSupervivencia equipoSupervivencia = equipoSupervivenciaFacadeLocal.find(equipoSupervivenciaDTO.getId());
        equipoSupervivencia.setEquipo(equipoSupervivenciaDTO.getEquipo());
        equipoSupervivenciaFacadeLocal.edit(equipoSupervivencia);
        return equipoSupervivenciaMapper.equipoSupervivenciaToEquipoSupervivenciaDTO(equipoSupervivencia);
    }

    @Override
    public void remove(EquipoSupervivenciaDTO equipoSupervivenciaDTO) {
        equipoSupervivenciaFacadeLocal.remove(equipoSupervivenciaFacadeLocal.find(equipoSupervivenciaDTO.getId()));
    }

    @Override
    public EquipoSupervivenciaDTO find(Object id) {
        return equipoSupervivenciaMapper.equipoSupervivenciaToEquipoSupervivenciaDTO(equipoSupervivenciaFacadeLocal.find(id));
    }

    @Override
    public List<EquipoSupervivenciaDTO> findAll() {
        return equipoSupervivenciaMapper.equiposSupervivenciaToEquipoSupervivenciaDTOs(equipoSupervivenciaFacadeLocal.findAll());        
    }

    @Override
    public List<EquipoSupervivenciaDTO> findRange(int[] range) {
        return equipoSupervivenciaMapper.equiposSupervivenciaToEquipoSupervivenciaDTOs(equipoSupervivenciaFacadeLocal.findRange(range));
    }

    @Override
    public int count() {
        return equipoSupervivenciaFacadeLocal.count();
    }

    @Override
    public boolean isAlive() {
        return true;
    }            
}
