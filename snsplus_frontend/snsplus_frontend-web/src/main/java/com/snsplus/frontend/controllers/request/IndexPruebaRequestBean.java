/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.frontend.controllers.request;

import com.snsplus.backend.client.dto.VueloDTO;
import com.snsplus.frontend.controllers.session.VueloSessionBean;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author conamerica15
 */
@Named(value = "indexPruebaRequestBean")
@RequestScoped
public class IndexPruebaRequestBean implements Serializable{

    @Inject
    VueloSessionBean vueloSessionBean;
    /**
     * Creates a new instance of IndexPruebaRequestBean
     */
    public IndexPruebaRequestBean() {
    }
    
    public void setVueloSeleccionado(VueloDTO vuelo){
        vueloSessionBean.setVuelo(vuelo);
    }
    
}
