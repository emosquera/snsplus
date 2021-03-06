/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.MarcaUnidadTransporteDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface MarcaUnidadTransporteFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/marcaUnidadTransporteFacadeRemote";
    
    MarcaUnidadTransporteDTO create(MarcaUnidadTransporteDTO empresa);

    MarcaUnidadTransporteDTO edit(MarcaUnidadTransporteDTO empresa);

    void remove(MarcaUnidadTransporteDTO empresa);

    MarcaUnidadTransporteDTO find(Object id);

    List<MarcaUnidadTransporteDTO> findAll();

    List<MarcaUnidadTransporteDTO> findRange(int[] range);

    int count();
}
