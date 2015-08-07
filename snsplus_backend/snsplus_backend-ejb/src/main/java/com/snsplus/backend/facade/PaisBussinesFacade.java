/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.facade;

import com.snsplus.backend.client.facade.PaisFacadeRemote;
import com.snsplus.backend.client.dto.PaisDTO;
import com.snsplus.backend.mapper.PaisMapper;
import com.snsplus.backend.model.Pais;
import com.snsplus.backend.sql.facade.PaisFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author conamerica15
 */
@Stateless(name = "PaisBussinesFacade", mappedName = PaisFacadeRemote.JNDI_REMOTE_NAME)
@Remote(PaisFacadeRemote.class)
public class PaisBussinesFacade implements PaisFacadeRemote{
    
    @EJB
    private PaisFacadeLocal paisFacadeLocal;
    
    @Inject 
    private PaisMapper paisMapper;

    @Override
    public PaisDTO create(PaisDTO paisDTO) {       
        Pais pais = new Pais(paisDTO);      
        paisFacadeLocal.create(pais);
        return paisMapper.paisToPaisDTO(pais);
    }

    @Override
    public PaisDTO edit(PaisDTO paisDTO) {
        Pais pais = paisFacadeLocal.find(paisDTO.getId());
        pais.setPais(paisDTO.getPais());
        paisFacadeLocal.edit(pais);
        return paisMapper.paisToPaisDTO(pais);
    }

    @Override
    public void remove(PaisDTO paisDTO) {
        paisFacadeLocal.remove(paisFacadeLocal.find(paisDTO.getId()));
    }

    @Override
    public PaisDTO find(Object id) {
        return paisMapper.paisToPaisDTO(paisFacadeLocal.find(id));
    }

    @Override
    public List<PaisDTO> findAll() {
        return paisMapper.paisesToPaisDTOs(paisFacadeLocal.findAll());        
    }

    @Override
    public List<PaisDTO> findRange(int[] range) {
        return paisMapper.paisesToPaisDTOs(paisFacadeLocal.findRange(range));
    }

    @Override
    public int count() {
        return paisFacadeLocal.count();
    }

    @Override
    public boolean isAlive() {
        return true;
    }            
}
