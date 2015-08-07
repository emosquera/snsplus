/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.web.service;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.annotation.JacksonFeatures;
import com.snsplus.backend.client.dto.PaisDTO;
import com.snsplus.web.bussines.CargaDatosInicial;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author conamerica15
 */
@Stateless
@Path("init")
public class Init {
    @GET
    @Produces({"application/json; charset=UTF-8"})
    @JacksonFeatures(serializationEnable =  { SerializationFeature.INDENT_OUTPUT })
    public PaisDTO iniciar() {
        PaisDTO pais = CargaDatosInicial.init();
        return pais;
    }
    
}
