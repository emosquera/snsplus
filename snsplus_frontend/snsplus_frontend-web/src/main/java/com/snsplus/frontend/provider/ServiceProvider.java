/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.frontend.provider;

import com.snsplus.backend.client.facade.PaisFacadeRemote;
import javax.ejb.EJB;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

/**
 *
 * @author conamerica15
 */
public class ServiceProvider {

    @EJB(lookup = "ejb/paisFacadeRemote")
    private PaisFacadeRemote paisFacadeRemote;

    @Produces
    @Default
    public PaisFacadeRemote getPaisFacadeRemote() {
        return paisFacadeRemote;
    }

    
}
    
