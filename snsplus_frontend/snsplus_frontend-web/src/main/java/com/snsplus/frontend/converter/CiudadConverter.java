/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.frontend.converter;

import com.snsplus.backend.client.dto.CiudadDTO;
import com.snsplus.frontend.controllers.view.IndexViewBean;
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
@FacesConverter(value = "ciudadConverter", forClass = CiudadDTO.class)
public class CiudadConverter implements Converter {

    @Inject
    IndexViewBean indexViewBean;

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {

        if (value == null || value.equals("")) {
            return "";
        } else {
            return String.valueOf(((CiudadDTO) value).getId());
        }

    }

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value.trim().equals("")) {
            return null;
        } else {
            try {
                int numero = Integer.parseInt(value);
                for (CiudadDTO p : indexViewBean.getEstado().getCiudadDTOs()) {
                    if (p.getId() == numero) {
                        return p;
                    }
                }
            } catch (NumberFormatException exception) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Ciudad Invalida"));
            }
        }
        return null;
    }
}
