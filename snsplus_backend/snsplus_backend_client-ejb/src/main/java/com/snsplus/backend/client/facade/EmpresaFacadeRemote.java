/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.EmpresaDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface EmpresaFacadeRemote extends ServiceVerifier {
    
    public final String JNDI_REMOTE_NAME = "ejb/empresaFacadeRemote";
    
    EmpresaDTO create(EmpresaDTO empresa);

    EmpresaDTO edit(EmpresaDTO empresa);

    void remove(EmpresaDTO empresa);

    EmpresaDTO find(Object id);
    
    int count();
}
