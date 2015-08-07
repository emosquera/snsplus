/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.facade;

import com.snsplus.backend.client.dto.UnidadTransporteDTO;
import com.snsplus.backend.client.facade.UnidadTransporteFacadeRemote;
import com.snsplus.backend.mapper.UnidadTransporteMapper;
import com.snsplus.backend.model.UnidadTransporte;
import com.snsplus.backend.sql.facade.UnidadTransporteFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author conamerica15
 */
@Stateless(name = "UnidadTransporteBussinesFacade", mappedName = UnidadTransporteFacadeRemote.JNDI_REMOTE_NAME)
@Remote(UnidadTransporteFacadeRemote.class)
public class UnidadTransporteBussinesFacade implements UnidadTransporteFacadeRemote {

    @EJB
    private UnidadTransporteFacadeLocal unidadTransporteFacadeLocal;

    @Inject
    private UnidadTransporteMapper unidadTransporteMapper;

    @Override
    public UnidadTransporteDTO create(UnidadTransporteDTO unidadTransporteDTO) {
        UnidadTransporte unidadTransporte = new UnidadTransporte(unidadTransporteDTO);
        unidadTransporteFacadeLocal.create(unidadTransporte);
        return unidadTransporteMapper.unidadTransporteToUnidadTransporteDTO(unidadTransporte);
    }

    @Override
    public UnidadTransporteDTO edit(UnidadTransporteDTO unidadTransporteDTO) {
        UnidadTransporte unidadTransporte = unidadTransporteFacadeLocal.find(unidadTransporteDTO.getId());
        unidadTransporte.setCantidadPasajerosPermitidos(unidadTransporteDTO.getCantidadPasajerosPermitidos());
        unidadTransporteFacadeLocal.edit(unidadTransporte);
        return unidadTransporteMapper.unidadTransporteToUnidadTransporteDTO(unidadTransporte);
    }

    @Override
    public void remove(UnidadTransporteDTO unidadTransporteDTO) {
        unidadTransporteFacadeLocal.remove(unidadTransporteFacadeLocal.find(unidadTransporteDTO.getId()));
    }

    @Override
    public UnidadTransporteDTO find(Object id) {
        return unidadTransporteMapper.unidadTransporteToUnidadTransporteDTO(unidadTransporteFacadeLocal.find(id));
    }

    @Override
    public List<UnidadTransporteDTO> findAll() {
        return unidadTransporteMapper.unidadesTransporteToUnidadTransporteDTOs(unidadTransporteFacadeLocal.findAll());
    }

    @Override
    public List<UnidadTransporteDTO> findRange(int[] range) {
        return unidadTransporteMapper.unidadesTransporteToUnidadTransporteDTOs(unidadTransporteFacadeLocal.findRange(range));
    }

    @Override
    public int count() {
        return unidadTransporteFacadeLocal.count();
    }

    @Override
    public boolean isAlive() {
        return true;
    }
}
