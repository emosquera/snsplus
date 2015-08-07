/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.web.service;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.annotation.JacksonFeatures;
import com.snsplus.backend.client.delegate.PaisDelegate;
import com.snsplus.backend.client.dto.PaisDTO;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author conamerica15
 */
@Stateless
@Path("pais")
public class PaisService {
    @GET
    @Produces({"application/json; charset=UTF-8"})
    @JacksonFeatures(serializationEnable =  { SerializationFeature.INDENT_OUTPUT })
    @Path("{id}")
    public PaisDTO find(@PathParam("id") Long id) {   
        return new PaisDelegate().find(id);
    }
    
    @GET
    @Produces({"application/json; charset=UTF-8"})
    @JacksonFeatures(serializationEnable =  { SerializationFeature.INDENT_OUTPUT })
    public List<PaisDTO> findAll() {        
        return new PaisDelegate().findAll();
    }
}
