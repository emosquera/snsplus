/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.utils;


import com.snsplus.backend.client.dto.CargoDTO;
import com.snsplus.backend.client.dto.CiudadDTO;
import com.snsplus.backend.client.dto.EstadoDTO;
import com.snsplus.backend.client.dto.PaisDTO;
import com.snsplus.backend.model.Cargo;
import com.snsplus.backend.model.Ciudad;
import com.snsplus.backend.model.Estado;
import com.snsplus.backend.model.Pais;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author conamerica15
 */
public class BackendConverter {
    public static CargoDTO cargoTocargoDTO(Cargo cargo) {
        CargoDTO cargoDTO = new CargoDTO();
        cargoDTO.setId(cargo.getId());
        cargoDTO.setCargo(cargo.getCargo());
        return cargoDTO;
    }
    
    public static List<CargoDTO> cargosTocargoDTOs(List<Cargo> cargos){
        if (cargos == null) {
            return null;
        }
        List<CargoDTO> cargoDTOs = new ArrayList<>();
        for (Cargo cargo : cargos) {
            cargoDTOs.add(cargoTocargoDTO(cargo));
        }
        return cargoDTOs;
    }
    
    public static PaisDTO paisTopaisDTO(Pais pais) {
        PaisDTO paisDTO = new PaisDTO();
        paisDTO.setId(pais.getId());
        paisDTO.setAbreviatura(pais.getAbreviatura());
        paisDTO.setPais(pais.getPais());
        paisDTO.setEstadoDTOs(estadosToestadoDTOs(pais.getEstados()));
        return paisDTO;
    }
    
    public static List<PaisDTO> paisesTopaisDTOs(List<Pais> paises){
        if (paises == null) {
            return null;
        }
        List<PaisDTO> paisDTOs = new ArrayList<>();
        for (Pais pais : paises) {
            paisDTOs.add(paisTopaisDTO(pais));
        }
        return paisDTOs;
    }
    
    public static EstadoDTO estadoToestadoDTO(Estado estado) {
        EstadoDTO estadoDTO = new EstadoDTO();
        estadoDTO.setId(estado.getId());
        estadoDTO.setAbreviatura(estado.getAbreviatura());
        estadoDTO.setEstado(estado.getEstado());
        estadoDTO.setCiudadDTOs(ciudadesTociudadDTOs(estado.getCiudades()));
        return estadoDTO;
    }
    
    public static List<EstadoDTO> estadosToestadoDTOs(List<Estado> estados){
        if (estados == null) {
            return null;
        }
        List<EstadoDTO> estadoDTOs = new ArrayList<>();
        for (Estado estado : estados) {
            estadoDTOs.add(estadoToestadoDTO(estado));
        }
        return estadoDTOs;
    }
    
    public static CiudadDTO ciudadTociudadDTO(Ciudad ciudad) {
        CiudadDTO ciudadDTO = new CiudadDTO();
        ciudadDTO.setId(ciudad.getId());
        ciudadDTO.setAbreviatura(ciudad.getAbreviatura());
        ciudadDTO.setCiudad(ciudad.getCiudad());
        return ciudadDTO;
    }
    
    public static List<CiudadDTO> ciudadesTociudadDTOs(List<Ciudad> ciudades){
        if (ciudades == null) {
            return null;
        }
        List<CiudadDTO> ciudadDTOs = new ArrayList<>();
        for (Ciudad ciudad : ciudades) {
            ciudadDTOs.add(ciudadTociudadDTO(ciudad));
        }
        return ciudadDTOs;
    }
}
