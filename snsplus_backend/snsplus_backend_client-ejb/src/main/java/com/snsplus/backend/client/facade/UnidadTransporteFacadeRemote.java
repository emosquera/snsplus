/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.UnidadTransporteDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface UnidadTransporteFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/unidadTransporteFacadeRemote";
    
    UnidadTransporteDTO create(UnidadTransporteDTO empresa);

    UnidadTransporteDTO edit(UnidadTransporteDTO empresa);

    void remove(UnidadTransporteDTO empresa);

    UnidadTransporteDTO find(Object id);

    List<UnidadTransporteDTO> findAll();

    List<UnidadTransporteDTO> findRange(int[] range);

    int count();
}
