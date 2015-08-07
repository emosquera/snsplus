/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.IndicadorDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface IndicadorFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/indicadorFacadeRemote";
    
    IndicadorDTO create(IndicadorDTO empresa);

    IndicadorDTO edit(IndicadorDTO empresa);

    void remove(IndicadorDTO empresa);

    IndicadorDTO find(Object id);

    List<IndicadorDTO> findAll();

    List<IndicadorDTO> findRange(int[] range);

    int count();
}
