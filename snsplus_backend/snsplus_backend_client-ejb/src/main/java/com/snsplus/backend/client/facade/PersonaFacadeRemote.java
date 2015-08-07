/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.client.facade;

import com.snsplus.backend.client.dto.PersonaDTO;
import com.snsplus.base.localtor.ServiceVerifier;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author conamerica15
 */
@Remote
public interface PersonaFacadeRemote extends ServiceVerifier{
    public final String JNDI_REMOTE_NAME = "ejb/personaFacadeRemote";
    
    PersonaDTO create(PersonaDTO empresa);

    PersonaDTO edit(PersonaDTO empresa);

    void remove(PersonaDTO empresa);

    PersonaDTO find(Object id);

    List<PersonaDTO> findAll();

    List<PersonaDTO> findRange(int[] range);

    int count();
}
