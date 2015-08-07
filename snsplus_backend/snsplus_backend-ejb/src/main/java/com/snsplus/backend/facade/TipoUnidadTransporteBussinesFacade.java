/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.facade;

import com.snsplus.backend.client.dto.TipoUnidadTransporteDTO;
import com.snsplus.backend.client.facade.TipoUnidadTransporteFacadeRemote;
import com.snsplus.backend.mapper.TipoUnidadTransporteMapper;
import com.snsplus.backend.model.TipoUnidadTransporte;
import com.snsplus.backend.sql.facade.TipoUnidadTransporteFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author conamerica15
 */
@Stateless(name = "TipoUnidadTransporteBussinesFacade", mappedName = TipoUnidadTransporteFacadeRemote.JNDI_REMOTE_NAME)
@Remote(TipoUnidadTransporteFacadeRemote.class)
public class TipoUnidadTransporteBussinesFacade implements TipoUnidadTransporteFacadeRemote {

    @EJB
    private TipoUnidadTransporteFacadeLocal tipoUnidadTransporteFacadeLocal;

    @Inject
    private TipoUnidadTransporteMapper tipoUnidadTransporteMapper;

    @Override
    public TipoUnidadTransporteDTO create(TipoUnidadTransporteDTO tipoUnidadTransporteDTO) {
        TipoUnidadTransporte tipoUnidadTransporte = new TipoUnidadTransporte(tipoUnidadTransporteDTO);
        tipoUnidadTransporteFacadeLocal.create(tipoUnidadTransporte);
        return tipoUnidadTransporteMapper.tipoUnidadTransporteToTipoUnidadTransporteDTO(tipoUnidadTransporte);
    }

    @Override
    public TipoUnidadTransporteDTO edit(TipoUnidadTransporteDTO tipoUnidadTransporteDTO) {
        TipoUnidadTransporte tipoUnidadTransporte = tipoUnidadTransporteFacadeLocal.find(tipoUnidadTransporteDTO.getId());
        tipoUnidadTransporte.setDescripcion(tipoUnidadTransporteDTO.getDescripcion());
        tipoUnidadTransporteFacadeLocal.edit(tipoUnidadTransporte);
        return tipoUnidadTransporteMapper.tipoUnidadTransporteToTipoUnidadTransporteDTO(tipoUnidadTransporte);
    }

    @Override
    public void remove(TipoUnidadTransporteDTO tipoUnidadTransporteDTO) {
        tipoUnidadTransporteFacadeLocal.remove(tipoUnidadTransporteFacadeLocal.find(tipoUnidadTransporteDTO.getId()));
    }

    @Override
    public TipoUnidadTransporteDTO find(Object id) {
        return tipoUnidadTransporteMapper.tipoUnidadTransporteToTipoUnidadTransporteDTO(tipoUnidadTransporteFacadeLocal.find(id));
    }

    @Override
    public List<TipoUnidadTransporteDTO> findAll() {
        return tipoUnidadTransporteMapper.tiposUnidadTransporteToTipoUnidadTransporteDTOs(tipoUnidadTransporteFacadeLocal.findAll());
    }

    @Override
    public List<TipoUnidadTransporteDTO> findRange(int[] range) {
        return tipoUnidadTransporteMapper.tiposUnidadTransporteToTipoUnidadTransporteDTOs(tipoUnidadTransporteFacadeLocal.findRange(range));
    }

    @Override
    public int count() {
        return tipoUnidadTransporteFacadeLocal.count();
    }

    @Override
    public boolean isAlive() {
        return true;
    }
    
}
