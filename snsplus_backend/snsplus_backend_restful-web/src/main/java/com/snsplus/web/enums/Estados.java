/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.web.enums;

/**
 *
 * @author conamerica15
 */
public enum Estados {
    AMAZONAS("Amazonas", "AMZ"),
    ANZOATEGUI("Anzoátegui", "ANZ"),
    APURE("Apure", "APU"),
    ARAGUA("Aragua", "ARA"),
    BARINAS("Barinas", "BAR"),
    BOLIVAR("Bolivar", "BOL"),
    CARABOBO("Carabobo", "CAR"),
    COJEDES("Cojedes", "COJ"),
    DELTA_AMACURO("Delta Amacuro", "DAM"),
    DEPENDENCIAS_FEDERALES("Dependencias Federales", "DFD"),
    FALCON("Falcón", "FAL"),
    GUARICO("Guárico", "GUA"),
    LARA("Lara", "LAR"),
    MERIDA("Mérida", "MER"),
    MIRANDA("Miranda", "MIR"),
    MONAGAS("Monagas", "MON"),
    NUEVA_ESPARTA("Nueva Esparta","NVE"),
    PORTUGUESA("Portuguesa", "POR"),
    SUCRE("Sucre", "SUC"),
    TACHIRA("Táchira", "TAC"),
    TRUJILLO("Trujillo", "TRU"),
    VARGAS("Vargas", "VAR"),
    YARACUY("Yaracuy","YAR"),
    ZULIA("Zulia", "ZUL");
    
    private final String nombre;
    private final String abreviatura;

    private Estados(String nombre, String abreviatura) {
        this.nombre = nombre;
        this.abreviatura = abreviatura;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public String getNombre() {
        return nombre;
    }
}
