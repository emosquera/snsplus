/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.ValorIndicadorDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface ValorIndicadorFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/valorIndicadorFacadeRemote";
    
    ValorIndicadorDTO create(ValorIndicadorDTO empresa);

    ValorIndicadorDTO edit(ValorIndicadorDTO empresa);

    void remove(ValorIndicadorDTO empresa);

    ValorIndicadorDTO find(Object id);

    List<ValorIndicadorDTO> findAll();

    List<ValorIndicadorDTO> findRange(int[] range);

    int count();
}
