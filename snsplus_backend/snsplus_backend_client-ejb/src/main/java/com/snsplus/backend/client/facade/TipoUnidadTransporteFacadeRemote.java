/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.TipoUnidadTransporteDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface TipoUnidadTransporteFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/tipoUnidadTransporteFacadeRemote";
    
    TipoUnidadTransporteDTO create(TipoUnidadTransporteDTO empresa);

    TipoUnidadTransporteDTO edit(TipoUnidadTransporteDTO empresa);

    void remove(TipoUnidadTransporteDTO empresa);

    TipoUnidadTransporteDTO find(Object id);

    List<TipoUnidadTransporteDTO> findAll();

    List<TipoUnidadTransporteDTO> findRange(int[] range);

    int count();
}
