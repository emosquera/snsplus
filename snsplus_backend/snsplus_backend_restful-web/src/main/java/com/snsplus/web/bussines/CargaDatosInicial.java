/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.web.bussines;

import com.snsplus.backend.client.delegate.PaisDelegate;
import com.snsplus.backend.client.delegate.TerminalDelegate;
import com.snsplus.backend.client.dto.CiudadDTO;
import com.snsplus.backend.client.dto.EstadoDTO;
import com.snsplus.backend.client.dto.PaisDTO;
import com.snsplus.backend.client.dto.TerminalDTO;
import com.snsplus.web.enums.Ciudades;
import com.snsplus.web.enums.Estados;
import com.snsplus.web.enums.Terminales;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author conamerica15
 */
public class CargaDatosInicial {
    private static Map<Estados, EstadoDTO> estados;
    private static Map<Ciudades, CiudadDTO> ciudades;

    public static PaisDTO init() {
        
        PaisDTO venezuela = new PaisDTO("Venezuela", "VEN");
        venezuela.setPais("Venezuela");
        
        estados = new HashMap<>();
        for (Estados estado : Estados.values()){
            estados.put(estado, new EstadoDTO(estado.getNombre(), estado.getAbreviatura(), venezuela));
            venezuela.getEstadoDTOs().add(estados.get(estado));
        }
        
        ciudades = new HashMap<>();
        for (Ciudades ciudad: Ciudades.values()) {            
            ciudades.put(ciudad, new CiudadDTO(ciudad.getNombre(), ciudad.getAbreviabura(), estados.get(ciudad.getEstado())));    
            estados.get(ciudad.getEstado()).getCiudadDTOs().add(ciudades.get(ciudad));
        }
        
        for (Terminales terminal : Terminales.values()) {
            ciudades.get(terminal.getCiudad()).getTerminalDTOs().add(new TerminalDTO(terminal.getNombre(), terminal.getAbreviatura(),ciudades.get(terminal.getCiudad())));
        }            
                
        venezuela = new PaisDelegate().create(venezuela);
        return venezuela;       
    }
    
}
