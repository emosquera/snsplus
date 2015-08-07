/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.ModeloUnidadTransporteDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface ModeloUnidadTransporteFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/modeloUnidadTransporteFacadeRemote";
    
    ModeloUnidadTransporteDTO create(ModeloUnidadTransporteDTO empresa);

    ModeloUnidadTransporteDTO edit(ModeloUnidadTransporteDTO empresa);

    void remove(ModeloUnidadTransporteDTO empresa);

    ModeloUnidadTransporteDTO find(Object id);

    List<ModeloUnidadTransporteDTO> findAll();

    List<ModeloUnidadTransporteDTO> findRange(int[] range);

    int count();
}
