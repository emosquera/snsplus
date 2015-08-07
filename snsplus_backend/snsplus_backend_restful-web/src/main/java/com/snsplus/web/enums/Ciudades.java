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
public enum Ciudades {
    PUERTO_AYACUCHO("Puerto Ayacucho","PYH",Estados.AMAZONAS),
    ANACO("Anaco","AAO",Estados.ANZOATEGUI),
    BARCELONA("Barcelona","BLA",Estados.ANZOATEGUI),
    SAN_TOME("San Tomé","SOM",Estados.ANZOATEGUI),
    GUASDALITO("Guasdualito","GDO",Estados.APURE),
    ELORZA("Elorza","EOZ",Estados.APURE),
    PALMARITO("Palmarito","PTM",Estados.APURE),
    SAN_FERNANDO_DE_APURE("San Fernando de Apure","SFD",Estados.APURE),
    PUERTO_PAEZ("Puerto Páez","PPZ",Estados.APURE),
    MARACAY("Maracay","MYC",Estados.ARAGUA),
    BARINAS("Barinas","MNS",Estados.BARINAS),
    SANA_BARBARA_DE_BARINAS("Santa Bárbara de Barinas","SBB",Estados.BARINAS),
    CIUDAD_BOLIVAR("Ciudad Bolivar","CBL",Estados.BOLIVAR),
    CAICARA_DEL_ORINOCO("Caicara del Orinoco","CXA",Estados.BOLIVAR),
    PIJIGUAOS("Pijiguaos","LPJ",Estados.BOLIVAR),
    CANAIMA("Canaima","CAJ",Estados.BOLIVAR),
    EL_DORADO("El Dorado","EOR",Estados.BOLIVAR),
    ICABARU("Icabaru","ICA",Estados.BOLIVAR),
    URIMAN("Uriman","KAV",Estados.BOLIVAR),
    KAMARATA("Kamarata","KTV",Estados.BOLIVAR),
    MARIPA("Maripa","000",Estados.BOLIVAR),
    PUERTO_ORDAZ("Puerto Ordáz","PZO",Estados.BOLIVAR),
    SANTA_ELENA_DE_UAIREN("Santa Elena de Uairén","SNV",Estados.BOLIVAR),
    TUMEREMO("Tumeremo","TMO",Estados.BOLIVAR),
    SAN_FELIX("San Félix","SFX",Estados.BOLIVAR),
    SAN_SALVADOR("San Salvador","SVV",Estados.BOLIVAR),
    WONKEN("Wonken","WOK",Estados.BOLIVAR),
    PERAITEPUY("Peraitepuy","PPH",Estados.BOLIVAR),
    PUERTO_CABELLO("Puerto Cabello","PBL",Estados.CARABOBO),
    VALENCIA("Valencia","VLN",Estados.CARABOBO),
    SAN_CARLOS("San Carlos","000",Estados.COJEDES),
    PEDERNALES("Pedernales","PDZ",Estados.DELTA_AMACURO),
    TUCUPITA("TUCUPITA","TUV",Estados.DELTA_AMACURO),
    LA_ORCHILA("La Orchila","000",Estados.DEPENDENCIAS_FEDERALES),
    LOS_ROQUES("Los Roques","LRV",Estados.DELTA_AMACURO),
    CORO("Coro","CZE",Estados.FALCON),
    CHURUGUARA("Churuguara","000",Estados.FALCON),
    PUNTO_FIJO("Punto Fijo","LSP",Estados.FALCON),
    DABAJURO("Dabajuro","000",Estados.FALCON),
    CALABOZO("Calabozo","CLZ",Estados.GUARICO),
    VALLE_DE_LA_PASCUA("Valle de la Pascua","VDP",Estados.GUARICO),
    ALTAGRACIA_DE_ORITUCO("Altagracia de Orituco","000",Estados.GUARICO),
    ZARAZA("Zaraza","ZRZ",Estados.GUARICO),
    BARQUISIMETO("Barquisimeto","BRM",Estados.LARA),
    CARORA("Carora","VCR",Estados.LARA),
    MERIDA("Mérida","MRD",Estados.MERIDA),
    EL_VIGIA("El Vigía","VIG",Estados.MERIDA),
    LAGUNILLAS("Lagunillas","LGY",Estados.MERIDA),
    CHARALLAVE("Charallave","000",Estados.MIRANDA),
    LA_CARLOTA("La Carlota","000",Estados.MIRANDA),
    HIGUEROTE("Higuerote","HIU",Estados.MIRANDA),
    OCUMARE_DEL_TUY("Ocumere del Tuy","000",Estados.MIRANDA),
    MATURTIN("Matrurín","MUN",Estados.MONAGAS),
    ISLA_DE_COCHE("Isla de Coche","000",Estados.NUEVA_ESPARTA),
    PORLAMAR("Porlamar","PMV",Estados.NUEVA_ESPARTA),
    ACARIGUA("Acarigua","AGV",Estados.PORTUGUESA),
    GUANARE("Guanare","GUQ",Estados.PORTUGUESA),
    CARUPANO("Carúpano","CUP",Estados.SUCRE),
    CUMANA("Cumaná","CUM",Estados.SUCRE),
    GUIRIA("Güiria","GUI",Estados.SUCRE),
    LA_FRIA("La Fría","LFR",Estados.TACHIRA),
    SAN_CRISTOBAL("San Cristóbal","SCI",Estados.TACHIRA),
    SAN_ANTONIO_DEL_TACHIRA("San Antonio del Táchira","SVZ",Estados.TACHIRA),
    SANTO_DOMINGO("Santo Domingo","STD",Estados.TACHIRA),
    BOCONO("Boconó","000",Estados.TRUJILLO),
    VALERA("Valera","VLV",Estados.TRUJILLO),
    MAIQUETIA("Maiquetía","CCS",Estados.VARGAS),
    SAN_FELIPE("San Felipe","SNF",Estados.YARACUY),
    BACHAQUERO("Bachaquero","000",Estados.ZULIA),
    CASIGUA("Casigua","CUV",Estados.ZULIA),
    MARACAIBO("Maracaibo","MAR",Estados.ZULIA),
    CABIMAS("Cabimas","CBS",Estados.ZULIA),
    SANTA_BARBARA_DEL_ZULIA("Santa Bárbara del Zulia","STB",Estados.ZULIA);
    
    private final String nombre;
    private final String abreviabura;
    private final Estados estado;

    private Ciudades(String nombre, String abreviabura, Estados estado) {
        this.nombre = nombre;
        this.abreviabura = abreviabura;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAbreviabura() {
        return abreviabura;
    }

    public Estados getEstado() {
        return estado;
    }
    
    
}
