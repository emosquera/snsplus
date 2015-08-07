/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.facade;

import com.snsplus.backend.client.dto.MarcaUnidadTransporteDTO;
import com.snsplus.backend.client.facade.MarcaUnidadTransporteFacadeRemote;
import com.snsplus.backend.mapper.MarcaUnidadTransporteMapper;
import com.snsplus.backend.model.MarcaUnidadTransporte;
import com.snsplus.backend.sql.facade.MarcaUnidadTransporteFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author conamerica15
 */
@Stateless(name = "MarcaUnidadTransporteBussinesFacade", mappedName = MarcaUnidadTransporteFacadeRemote.JNDI_REMOTE_NAME)
@Remote(MarcaUnidadTransporteFacadeRemote.class)
public class MarcaUnidadTransporteBussinesFacade implements MarcaUnidadTransporteFacadeRemote{
    @EJB
    private MarcaUnidadTransporteFacadeLocal marcaUnidadTransporteFacadeLocal;
    
    @Inject 
    private MarcaUnidadTransporteMapper marcaUnidadTransporteMapper;

    @Override
    public MarcaUnidadTransporteDTO create(MarcaUnidadTransporteDTO marcaUnidadTransporteDTO) {       
        MarcaUnidadTransporte marcaUnidadTransporte = new MarcaUnidadTransporte(marcaUnidadTransporteDTO);      
        marcaUnidadTransporteFacadeLocal.create(marcaUnidadTransporte);
        return marcaUnidadTransporteMapper.marcaUnidadTransporteToMarcaUnidadTransporteDTO(marcaUnidadTransporte);
    }

    @Override
    public MarcaUnidadTransporteDTO edit(MarcaUnidadTransporteDTO marcaUnidadTransporteDTO) {
        MarcaUnidadTransporte marcaUnidadTransporte = marcaUnidadTransporteFacadeLocal.find(marcaUnidadTransporteDTO.getId());
        marcaUnidadTransporte.setDescripcion(marcaUnidadTransporteDTO.getDescripcion());
        marcaUnidadTransporteFacadeLocal.edit(marcaUnidadTransporte);
        return marcaUnidadTransporteMapper.marcaUnidadTransporteToMarcaUnidadTransporteDTO(marcaUnidadTransporte);
    }

    @Override
    public void remove(MarcaUnidadTransporteDTO marcaUnidadTransporteDTO) {
        marcaUnidadTransporteFacadeLocal.remove(marcaUnidadTransporteFacadeLocal.find(marcaUnidadTransporteDTO.getId()));
    }

    @Override
    public MarcaUnidadTransporteDTO find(Object id) {
        return marcaUnidadTransporteMapper.marcaUnidadTransporteToMarcaUnidadTransporteDTO(marcaUnidadTransporteFacadeLocal.find(id));
    }

    @Override
    public List<MarcaUnidadTransporteDTO> findAll() {
        return marcaUnidadTransporteMapper.marcasUnidadTransporteToMarcaUnidadTransporteDTOs(marcaUnidadTransporteFacadeLocal.findAll());        
    }

    @Override
    public List<MarcaUnidadTransporteDTO> findRange(int[] range) {
        return marcaUnidadTransporteMapper.marcasUnidadTransporteToMarcaUnidadTransporteDTOs(marcaUnidadTransporteFacadeLocal.findRange(range));
    }

    @Override
    public int count() {
        return marcaUnidadTransporteFacadeLocal.count();
    }

    @Override
    public boolean isAlive() {
        return true;
    }            
    
}
