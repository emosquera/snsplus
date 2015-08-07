/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.facade;

import com.snsplus.backend.client.dto.EmpresaDTO;
import com.snsplus.backend.client.facade.EmpresaFacadeRemote;
import com.snsplus.backend.mapper.EmpresaMapper;
import com.snsplus.backend.model.Empresa;
import com.snsplus.backend.sql.facade.EmpresaFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author conamerica15
 */
@Stateless(name = "EmpresaBussinesFacade", mappedName = EmpresaFacadeRemote.JNDI_REMOTE_NAME)
@Remote(EmpresaFacadeRemote.class)
public class EmpresaBussinesFacade implements EmpresaFacadeRemote{
    @EJB EmpresaFacadeLocal empresaFacadeLocal;

    @Inject EmpresaMapper empresaMapper;
    
    @Override
    public EmpresaDTO create(EmpresaDTO empresaDTO) {
        Empresa empresa = new Empresa(empresaDTO);
        empresaFacadeLocal.create(empresa);
        return empresaMapper.empresaToEmpresaDTO(empresa);
    }

    @Override
    public EmpresaDTO edit(EmpresaDTO empresaDTO) {
        Empresa empresa = empresaFacadeLocal.find(empresaDTO.getId());
        empresa.setDireccionPrincipal(empresaDTO.getDireccionPrincipal());
        empresaFacadeLocal.edit(empresa);
        return empresa;
    }

    @Override
    public void remove(EmpresaDTO empresaDTO) {
        empresaFacadeLocal.remove(empresaFacadeLocal.find(empresaDTO.getId()));
    }

    @Override
    public EmpresaDTO find(Object id) {
        return empresaFacadeLocal.find(id);
    }

    @Override
    public int count() {
        return empresaFacadeLocal.count();
    }

    @Override
    public boolean isAlive() {
        return true;
    }            
}
