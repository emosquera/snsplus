/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.facade;

import com.snsplus.backend.client.dto.ModeloUnidadTransporteDTO;
import com.snsplus.backend.client.facade.ModeloUnidadTransporteFacadeRemote;
import com.snsplus.backend.mapper.ModeloUnidadTransporteMapper;
import com.snsplus.backend.model.ModeloUnidadTransporte;
import com.snsplus.backend.sql.facade.ModeloUnidadTransporteFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author conamerica15
 */
@Stateless(name = "ModeloUnidadTransporteBussinesFacade", mappedName = ModeloUnidadTransporteFacadeRemote.JNDI_REMOTE_NAME)
@Remote(ModeloUnidadTransporteFacadeRemote.class)
public class ModeloUnidadTransporteBussinesFacade implements ModeloUnidadTransporteFacadeRemote{
    @EJB
    private ModeloUnidadTransporteFacadeLocal modeloUnidadTransporteFacadeLocal;
    
    @Inject 
    private ModeloUnidadTransporteMapper modeloUnidadTransporteMapper;

    @Override
    public ModeloUnidadTransporteDTO create(ModeloUnidadTransporteDTO modeloUnidadTransporteDTO) {       
        ModeloUnidadTransporte modeloUnidadTransporte = new ModeloUnidadTransporte(modeloUnidadTransporteDTO);      
        modeloUnidadTransporteFacadeLocal.create(modeloUnidadTransporte);
        return modeloUnidadTransporteMapper.modeloUnidadTransporteToModeloUnidadTransporteDTO(modeloUnidadTransporte);
    }

    @Override
    public ModeloUnidadTransporteDTO edit(ModeloUnidadTransporteDTO modeloUnidadTransporteDTO) {
        ModeloUnidadTransporte modeloUnidadTransporte = modeloUnidadTransporteFacadeLocal.find(modeloUnidadTransporteDTO.getId());
        modeloUnidadTransporte.setDescripcion(modeloUnidadTransporteDTO.getDescripcion());
        modeloUnidadTransporteFacadeLocal.edit(modeloUnidadTransporte);
        return modeloUnidadTransporteMapper.modeloUnidadTransporteToModeloUnidadTransporteDTO(modeloUnidadTransporte);
    }

    @Override
    public void remove(ModeloUnidadTransporteDTO modeloUnidadTransporteDTO) {
        modeloUnidadTransporteFacadeLocal.remove(modeloUnidadTransporteFacadeLocal.find(modeloUnidadTransporteDTO.getId()));
    }

    @Override
    public ModeloUnidadTransporteDTO find(Object id) {
        return modeloUnidadTransporteMapper.modeloUnidadTransporteToModeloUnidadTransporteDTO(modeloUnidadTransporteFacadeLocal.find(id));
    }

    @Override
    public List<ModeloUnidadTransporteDTO> findAll() {
        return modeloUnidadTransporteMapper.modelosUnidadTransporteToModeloUnidadTransporteDTOs(modeloUnidadTransporteFacadeLocal.findAll());        
    }

    @Override
    public List<ModeloUnidadTransporteDTO> findRange(int[] range) {
        return modeloUnidadTransporteMapper.modelosUnidadTransporteToModeloUnidadTransporteDTOs(modeloUnidadTransporteFacadeLocal.findRange(range));
    }

    @Override
    public int count() {
        return modeloUnidadTransporteFacadeLocal.count();
    }

    @Override
    public boolean isAlive() {
        return true;
    }            
    
}
