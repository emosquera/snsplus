/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.delegate;

import com.snsplus.backend.client.dto.EmpresaDTO;
import com.snsplus.backend.client.facade.EmpresaFacadeRemote;
import com.snsplus.base.localtor.AbstractDelegate;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class EmpresaDelegate extends AbstractDelegate<EmpresaFacadeRemote> implements EmpresaFacadeRemote{

    @Override
    public EmpresaDTO create(EmpresaDTO empresa) {
        return this.getDelegado(JNDI_REMOTE_NAME).create(empresa);
    }

    @Override
    public EmpresaDTO edit(EmpresaDTO empresa) {
        return this.getDelegado(JNDI_REMOTE_NAME).edit(empresa);
    }

    @Override
    public void remove(EmpresaDTO empresa) {
        this.getDelegado(JNDI_REMOTE_NAME).remove(empresa);
    }

    @Override
    public EmpresaDTO find(Object id) {
        return this.getDelegado(JNDI_REMOTE_NAME).find(id);
    }

    @Override
    public int count() {
        return this.getDelegado(JNDI_REMOTE_NAME).count();
    }

    @Override
    public boolean isAlive() {
        return this.getDelegado(JNDI_REMOTE_NAME).isAlive();
    }
    
}
