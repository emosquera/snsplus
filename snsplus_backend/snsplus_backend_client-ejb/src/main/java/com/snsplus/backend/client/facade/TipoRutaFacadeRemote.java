/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.TipoRutaDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface TipoRutaFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/tipoRutaFacadeRemote";
    
    TipoRutaDTO create(TipoRutaDTO empresa);

    TipoRutaDTO edit(TipoRutaDTO empresa);

    void remove(TipoRutaDTO empresa);

    TipoRutaDTO find(Object id);

    List<TipoRutaDTO> findAll();

    List<TipoRutaDTO> findRange(int[] range);

    int count();
}
