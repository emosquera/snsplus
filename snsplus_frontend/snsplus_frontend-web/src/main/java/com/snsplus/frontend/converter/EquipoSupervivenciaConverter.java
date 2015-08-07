/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.frontend.converter;

import com.snsplus.backend.client.dto.EquipoSupervivenciaDTO;
import com.snsplus.frontend.controllers.application.DatosPrueba;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

/**
 *
 * @author conamerica15
 */
@FacesConverter(value = "equipoSupervivenciaConverter", forClass = EquipoSupervivenciaDTO.class)
public class EquipoSupervivenciaConverter implements Converter{
    @Inject
    DatosPrueba datosPrueba;
    
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {

        if (value == null || value.equals("")) {
            return "";
        } else {
            return String.valueOf(((EquipoSupervivenciaDTO) value).getId());
        }

    }

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value.trim().equals("")) {
            return null;
        } else {
            try {
                int numero = Integer.parseInt(value);
                for (Map.Entry<String, EquipoSupervivenciaDTO> u : datosPrueba.getEquipos().entrySet()) {
                    if (u.getValue().getId() == numero) {
                        return u.getValue();
                    }
                }
            } catch (NumberFormatException exception) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Unidad Transporte Invalido"));
            }
        }
        return null;
    }
}
