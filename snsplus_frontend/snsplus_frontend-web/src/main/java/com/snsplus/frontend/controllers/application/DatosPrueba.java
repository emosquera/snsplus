/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.frontend.controllers.application;

import com.snsplus.backend.client.delegate.TerminalDelegate;
import com.snsplus.backend.client.dto.CargoDTO;
import com.snsplus.backend.client.dto.EquipoSupervivenciaDTO;
import com.snsplus.backend.client.dto.FaseDTO;
import com.snsplus.backend.client.dto.FaseOperacionVueloDTO;
import com.snsplus.backend.client.dto.IndicadorDTO;
import com.snsplus.backend.client.dto.IndicadorFaseDTO;
import com.snsplus.backend.client.dto.MarcaUnidadTransporteDTO;
import com.snsplus.backend.client.dto.ModeloUnidadTransporteDTO;
import com.snsplus.backend.client.dto.OperacionDTO;
import com.snsplus.backend.client.dto.PersonaDTO;
import com.snsplus.backend.client.dto.RutaDTO;
import com.snsplus.backend.client.dto.TripulanteDTO;
import com.snsplus.backend.client.dto.TripulanteVueloDTO;
import com.snsplus.backend.client.dto.UnidadTransporteDTO;
import com.snsplus.backend.client.dto.ValorIndicadorFaseDTO;
import com.snsplus.backend.client.dto.VueloDTO;
import com.snsplus.backend.client.enums.TipoDato;
import com.snsplus.backend.client.enums.TipoFase;
import com.snsplus.backend.client.enums.TipoIndicador;
import com.snsplus.backend.client.enums.TipoOperacion;
import com.snsplus.backend.client.enums.TipoPadreIndicador;
import java.io.Serializable;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author conamerica15
 */
@Named(value = "datosPrueba")
@ApplicationScoped
public class DatosPrueba implements Serializable {

    private List<VueloDTO> vuelos;
    private List<RutaDTO> rutas;
    private TerminalDelegate terminalDelegate = new TerminalDelegate();
    private Map<String, EquipoSupervivenciaDTO> equipos = new HashMap<>();
    private Map<String, MarcaUnidadTransporteDTO> marcasAviones = new HashMap<>();
    private Map<String, ModeloUnidadTransporteDTO> modelosAviones = new HashMap<>();
    private Map<String, UnidadTransporteDTO> aviones = new HashMap<>();
    private Map<String, CargoDTO> cargos = new HashMap<>();
    private Map<String, PersonaDTO> personas = new HashMap<>();
    private Map<String, OperacionDTO> operaciones = new HashMap<>();

    /**
     * Creates a new instance of DatosPrueba
     */
    public DatosPrueba() {

    }

    @PostConstruct
    private void init() {
        vuelos = new ArrayList<>();
        rutas = new ArrayList<>();
        crearEquipos();
        crearMarcas();
        crearModelos();
        crearAviones();
        crearPersonas();
        crearCargos();
        crearRutas();
        crearOperaciones();
        crearVuelos();
    }

    public List<VueloDTO> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<VueloDTO> vuelos) {
        this.vuelos = vuelos;
    }

    public List<RutaDTO> getRutas() {
        return rutas;
    }

    public void setRutas(List<RutaDTO> rutas) {
        this.rutas = rutas;
    }

    public TerminalDelegate getTerminalDelegate() {
        return terminalDelegate;
    }

    public void setTerminalDelegate(TerminalDelegate terminalDelegate) {
        this.terminalDelegate = terminalDelegate;
    }

    public Map<String, EquipoSupervivenciaDTO> getEquipos() {
        return equipos;
    }

    public void setEquipos(Map<String, EquipoSupervivenciaDTO> equipos) {
        this.equipos = equipos;
    }

    public Map<String, MarcaUnidadTransporteDTO> getMarcasAviones() {
        return marcasAviones;
    }

    public void setMarcasAviones(Map<String, MarcaUnidadTransporteDTO> marcasAviones) {
        this.marcasAviones = marcasAviones;
    }

    public Map<String, ModeloUnidadTransporteDTO> getModelosAviones() {
        return modelosAviones;
    }

    public void setModelosAviones(Map<String, ModeloUnidadTransporteDTO> modelosAviones) {
        this.modelosAviones = modelosAviones;
    }

    public Map<String, UnidadTransporteDTO> getAviones() {
        return aviones;
    }

    public void setAviones(Map<String, UnidadTransporteDTO> aviones) {
        this.aviones = aviones;
    }

    public Map<String, CargoDTO> getCargos() {
        return cargos;
    }

    public void setCargos(Map<String, CargoDTO> cargos) {
        this.cargos = cargos;
    }

    public Map<String, PersonaDTO> getPersonas() {
        return personas;
    }

    public void setPersonas(Map<String, PersonaDTO> personas) {
        this.personas = personas;
    }

    public Map<String, OperacionDTO> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Map<String, OperacionDTO> operaciones) {
        this.operaciones = operaciones;
    }

    private Time setHora(int hora, int minutos, int am_pm) {
        Calendar h = Calendar.getInstance();
        h.set(Calendar.HOUR, hora);
        h.set(Calendar.MINUTE, minutos);
        h.set(Calendar.AM_PM, am_pm);
        return new Time(h.getTimeInMillis());
    }

    private Date setFecha(int annio, int mes, int dia) {
        Calendar f = Calendar.getInstance();
        f.set(Calendar.YEAR, annio);
        f.set(Calendar.MONTH, mes);
        f.set(Calendar.DAY_OF_MONTH, dia);
        return f.getTime();
    }

    private EquipoSupervivenciaDTO crearEquipo(Long id, String descripcion) {
        EquipoSupervivenciaDTO e = new EquipoSupervivenciaDTO();
        e.setId(id);
        e.setEquipo(descripcion);
        return e;
    }

    private void crearEquipos() {
        equipos.put("Chalecos", crearEquipo(Long.parseLong("1"), "Chalecos Salvavidas"));
        equipos.put("Linternas", crearEquipo(Long.parseLong("2"), "Linternas de Mano"));
        equipos.put("Bengalas", crearEquipo(Long.parseLong("3"), "Bengalas"));
        equipos.put("Botes", crearEquipo(Long.parseLong("4"), "Botes Salvavidas"));
        equipos.put("Luces", crearEquipo(Long.parseLong("5"), "Luces Fluorescentes"));
    }

    private MarcaUnidadTransporteDTO crearMarcaAvion(Long id, String descripcion) {
        MarcaUnidadTransporteDTO marcaUnidadTransporte = new MarcaUnidadTransporteDTO();
        marcaUnidadTransporte.setId(id);
        marcaUnidadTransporte.setDescripcion(descripcion);
        return marcaUnidadTransporte;
    }

    private void crearMarcas() {
        marcasAviones.put("Boeing", crearMarcaAvion(Long.parseLong("1"), "Boeing"));
        marcasAviones.put("Airbus", crearMarcaAvion(Long.parseLong("2"), "Airbus"));
    }

    private ModeloUnidadTransporteDTO crearModeloAvion(Long id, String descripcion) {
        ModeloUnidadTransporteDTO modeloaUnidadTransporte = new ModeloUnidadTransporteDTO();
        modeloaUnidadTransporte.setId(id);
        modeloaUnidadTransporte.setDescripcion(descripcion);
        return modeloaUnidadTransporte;
    }

    private void crearModelos() {
        modelosAviones.put("747", crearModeloAvion(Long.parseLong("1"), "747"));
        modelosAviones.put("777", crearModeloAvion(Long.parseLong("2"), "777"));
        modelosAviones.put("737", crearModeloAvion(Long.parseLong("3"), "737"));
        modelosAviones.put("A320", crearModeloAvion(Long.parseLong("4"), "A320"));
    }

    private UnidadTransporteDTO crearAvion(Long id, String color, String matricula, String serial, int annioVencimiento, int mesVencimiento, int diaVencimiento, String marca, String modelo, List<String> equiposAvion) {
        UnidadTransporteDTO unidadTransporte = new UnidadTransporteDTO();
        unidadTransporte.setId(id);
        unidadTransporte.setColor(color);
        unidadTransporte.setMatricula(matricula);
        unidadTransporte.setSerial(serial);
        unidadTransporte.setVencimientoCertificado(setFecha(annioVencimiento, mesVencimiento, diaVencimiento));
        unidadTransporte.setMarcaUnidadTransporteDTO(marcasAviones.get(marca));
        unidadTransporte.setModeloUnidadTransporteDTO(modelosAviones.get(modelo));
        for (String eq : equiposAvion) {
            unidadTransporte.getEquipoSupervivenciaDTOs().add(equipos.get(eq));
        }
        return unidadTransporte;
    }

    private void crearAviones() {
        List<String> equipos1 = new ArrayList<>();
        equipos1.add("Chalecos");
        equipos1.add("Botes");
        aviones.put("1", crearAvion(Long.parseLong("1"), "BLANCO - ROJO - NEGRO", "AV4YP3D", "KDH7D0D3SLN9JDLS96S2", 2017, 8, 13, "Boeing", "747", equipos1));

        List<String> equipos2 = new ArrayList<>();
        equipos2.add("Chalecos");
        equipos2.add("Botes");
        equipos2.add("Linternas");
        equipos2.add("Luces");
        aviones.put("2", crearAvion(Long.parseLong("2"), "AZUL - BLANCO", "G7SKJD8", "DY09SJS893AMCO93Y9", 2016, 2, 20, "Airbus", "A320", equipos2));

        List<String> equipos3 = new ArrayList<>();
        equipos3.add("Chalecos");
        aviones.put("3", crearAvion(Long.parseLong("3"), "BLANCO - AMARILLO", "Y8SIJA8", "LUSJ9937JS88WMXBS8", 2019, 12, 1, "Boeing", "777", equipos3));
    }

    private PersonaDTO crearPersona(Long id, String nombre, String apellido) {
        PersonaDTO p = new PersonaDTO();
        p.setId(id);
        p.setPrimerNombre(nombre);
        p.setPrimerApellido(apellido);
        return p;
    }

    private void crearPersonas() {
        personas.put("Piloto1", crearPersona(Long.parseLong("1"), "Luis", "Rodríguez"));
        personas.put("Piloto2", crearPersona(Long.parseLong("2"), "Carlos", "Méndez"));
        personas.put("Piloto3", crearPersona(Long.parseLong("3"), "José", "Gonzalez"));

        personas.put("Copiloto1", crearPersona(Long.parseLong("4"), "Juan", "Pérez"));
        personas.put("Copiloto2", crearPersona(Long.parseLong("5"), "Ramón", "Torres"));
        personas.put("Copiloto3", crearPersona(Long.parseLong("6"), "Guillermo", "Giménez"));

        personas.put("Aeromoza1", crearPersona(Long.parseLong("7"), "María", "Suárez"));
        personas.put("Aeromoza2", crearPersona(Long.parseLong("8"), "Carla", "Meléndez"));
        personas.put("Aeromoza3", crearPersona(Long.parseLong("9"), "Vanessa", "Rincón"));
        personas.put("Aeromoza4", crearPersona(Long.parseLong("10"), "Ana", "Rondón"));
        personas.put("Aeromoza5", crearPersona(Long.parseLong("11"), "Johanna", "Martínez"));
    }

    private CargoDTO crearCargo(Long id, String descripcion, List<PersonaDTO> personasCargo) {
        CargoDTO c = new CargoDTO();
        c.setId(id);
        c.setCargo(descripcion);
        c.setPersonaDTOs(personasCargo);
        return c;
    }

    private void crearCargos() {
        List<PersonaDTO> personasCargoPiloto = new ArrayList<>();
        personasCargoPiloto.add(personas.get("Piloto1"));
        personasCargoPiloto.add(personas.get("Piloto2"));
        personasCargoPiloto.add(personas.get("Piloto3"));
        cargos.put("Piloto", crearCargo(Long.parseLong("1"), "Piloto", personasCargoPiloto));

        List<PersonaDTO> personasCargoCoPiloto = new ArrayList<>();
        personasCargoCoPiloto.add(personas.get("Copiloto1"));
        personasCargoCoPiloto.add(personas.get("Copiloto2"));
        personasCargoCoPiloto.add(personas.get("Copiloto3"));
        cargos.put("Copiloto", crearCargo(Long.parseLong("2"), "Co-Piloto", personasCargoCoPiloto));

        List<PersonaDTO> personasCargoAeromoza = new ArrayList<>();
        personasCargoAeromoza.add(personas.get("Aeromoza1"));
        personasCargoAeromoza.add(personas.get("Aeromoza2"));
        personasCargoAeromoza.add(personas.get("Aeromoza3"));
        personasCargoAeromoza.add(personas.get("Aeromoza4"));
        personasCargoAeromoza.add(personas.get("Aeromoza5"));
        cargos.put("Aeromoza", crearCargo(Long.parseLong("3"), "Aeromoza", personasCargoAeromoza));
    }

    private RutaDTO crearRuta(String id, String descripcion, int horaSalida, int minutoSalida, int amPmSalida, int horaDuracion, int mintuDuracion, Long codigoTerminalOrigen, Long codigoTerminalDestino, String unidadTransporte) {
        RutaDTO ruta = new RutaDTO();
        ruta.setCodigoRuta(id);
        ruta.setDescripcion(descripcion);
        ruta.setHoraSalida(setHora(horaSalida, minutoSalida, amPmSalida));
        ruta.setTiempoRuta(setHora(horaDuracion, mintuDuracion, 0));
        ruta.setTerminalOrigenDTO(terminalDelegate.find(codigoTerminalOrigen));
        ruta.setTerminalDestinoDTO(terminalDelegate.find(codigoTerminalDestino));
        ruta.setUnidadTransporteDTO(aviones.get(unidadTransporte));
        return ruta;
    }

    private TripulanteDTO crearTripulante(Long id, PersonaDTO persona, CargoDTO cargo, RutaDTO ruta) {
        TripulanteDTO t = new TripulanteDTO();
        t.setId(id);
        t.setPersonaDTO(persona);
        t.setCargoDTO(cargo);
        return t;
    }

    private void crearRutas() {

        RutaDTO ruta1 = crearRuta("1", "456", 6, 45, 0, 0, 50, Long.parseLong("68"), Long.parseLong("22"), "1");
        ruta1.getTripulanteDTOs().add(crearTripulante(Long.parseLong("1"), personas.get("Piloto1"), cargos.get("Piloto"), ruta1));
        ruta1.getTripulanteDTOs().add(crearTripulante(Long.parseLong("2"), personas.get("Copiloto2"), cargos.get("Copiloto"), ruta1));
        ruta1.getTripulanteDTOs().add(crearTripulante(Long.parseLong("3"), personas.get("Aeromoza2"), cargos.get("Aeromoza"), ruta1));
        ruta1.getTripulanteDTOs().add(crearTripulante(Long.parseLong("4"), personas.get("Aeromoza5"), cargos.get("Aeromoza"), ruta1));
        rutas.add(ruta1);

        RutaDTO ruta2 = crearRuta("2", "478", 7, 15, 0, 0, 35, Long.parseLong("15"), Long.parseLong("71"), "2");
        ruta2.getTripulanteDTOs().add(crearTripulante(Long.parseLong("5"), personas.get("Piloto2"), cargos.get("Piloto"), ruta1));
        ruta2.getTripulanteDTOs().add(crearTripulante(Long.parseLong("6"), personas.get("Copiloto1"), cargos.get("Copiloto"), ruta1));
        ruta2.getTripulanteDTOs().add(crearTripulante(Long.parseLong("7"), personas.get("Aeromoza1"), cargos.get("Aeromoza"), ruta1));
        ruta2.getTripulanteDTOs().add(crearTripulante(Long.parseLong("8"), personas.get("Aeromoza3"), cargos.get("Aeromoza"), ruta1));
        ruta2.getTripulanteDTOs().add(crearTripulante(Long.parseLong("9"), personas.get("Aeromoza1"), cargos.get("Aeromoza"), ruta1));
        rutas.add(ruta2);

        RutaDTO ruta3 = crearRuta("3", "568", 10, 0, 0, 1, 20, Long.parseLong("43"), Long.parseLong("6"), "3");
        ruta3.getTripulanteDTOs().add(crearTripulante(Long.parseLong("5"), personas.get("Piloto2"), cargos.get("Piloto"), ruta1));
        ruta3.getTripulanteDTOs().add(crearTripulante(Long.parseLong("6"), personas.get("Copiloto1"), cargos.get("Copiloto"), ruta1));
        ruta3.getTripulanteDTOs().add(crearTripulante(Long.parseLong("7"), personas.get("Aeromoza1"), cargos.get("Aeromoza"), ruta1));
        rutas.add(ruta3);

        RutaDTO ruta4 = crearRuta("4", "713", 4, 0, 1, 0, 50, Long.parseLong("22"), Long.parseLong("68"), "1");
        ruta4.getTripulanteDTOs().add(crearTripulante(Long.parseLong("5"), personas.get("Piloto1"), cargos.get("Piloto"), ruta1));
        ruta4.getTripulanteDTOs().add(crearTripulante(Long.parseLong("6"), personas.get("Copiloto2"), cargos.get("Copiloto"), ruta1));
        ruta4.getTripulanteDTOs().add(crearTripulante(Long.parseLong("7"), personas.get("Aeromoza2"), cargos.get("Aeromoza"), ruta1));
        ruta4.getTripulanteDTOs().add(crearTripulante(Long.parseLong("7"), personas.get("Aeromoza5"), cargos.get("Aeromoza"), ruta1));
        rutas.add(ruta4);
    }

    private void crearVuelos() {
        int i = 0;
        for (RutaDTO ruta : rutas) {
            i++;
            VueloDTO v = new VueloDTO();
            v.setId(new Long(i));
            v.setRutaDTO(ruta);
            v.getEquipoSupervivenciaDTOs().addAll(ruta.getUnidadTransporteDTO().getEquipoSupervivenciaDTOs());
            for (TripulanteDTO t : ruta.getTripulanteDTOs()) {
                TripulanteVueloDTO tv = new TripulanteVueloDTO();
                tv.setId(t.getId());
                tv.setCargoDTO(t.getCargoDTO());
                tv.setPersonaDTO(t.getPersonaDTO());
                tv.setVueloDTO(v);
                v.getTripulanteVueloDTOs().add(tv);
            }
            v.setFecha(Calendar.getInstance());
            if (i == 1) {
                v.setEstatus("FIN");
            } else if (i > 1 && i < 4) {
                v.setEstatus("PRO");
            } else {
                v.setEstatus("PEN");
            }
            v.setFaseOperacionVueloDTO(crearFaseOperacionVuelo());
            vuelos.add(v);
        }
    }

    private IndicadorFaseDTO crearIndicadorFase(Long id, TipoPadreIndicador tipoPadreIndicador, TipoIndicador tipoIndicador, TipoDato tipoDato, int caracteres, String codigo, String descripcion, Boolean obligatorio, String titulo, int decimales) {
        IndicadorFaseDTO indicador = new IndicadorFaseDTO();
        indicador.setId(id);
        indicador.setTipoPadre(tipoPadreIndicador);
        indicador.setTipoIndicador(tipoIndicador);
        indicador.setTipoDato(tipoDato);
        indicador.setCaracteresPermitidos(caracteres);
        indicador.setCodigo(codigo);
        indicador.setDescripcion(descripcion);
        indicador.setObligatorio(obligatorio);
        indicador.setTitulo(titulo);
        indicador.setDecimalesPermitidos(decimales);
        return indicador;
    }

    private List<IndicadorFaseDTO> crearIndicadoresFase() {
        List<IndicadorFaseDTO> indicadoresFase = new ArrayList<>();
        indicadoresFase.add(crearIndicadorFase(Long.parseLong("1"), TipoPadreIndicador.FASE, TipoIndicador.COMBO_DESPLEGABLE, TipoDato.ALFANUMERICO, 20, "1", "Tipo de Vuelo", Boolean.TRUE, "Tipo de Vuelo", 0));
        indicadoresFase.add(crearIndicadorFase(Long.parseLong("2"), TipoPadreIndicador.FASE, TipoIndicador.BOTON, TipoDato.FECHA_HORA, 30, "2", "Hora de Llegada del Piloto", Boolean.TRUE, "Hora de Llegada del Piloto", 0));
        return indicadoresFase;
    }

    private FaseDTO crearFase(Long id, String descripcion, TipoFase tipoFase, int orden, List<IndicadorFaseDTO> listaIndicadores) {
        FaseDTO fase = new FaseDTO();
        fase.setId(id);
        fase.setDescripcion(descripcion);
        fase.setTipo(tipoFase);
        fase.setOrden(orden);
        if (listaIndicadores != null) {
            for (IndicadorFaseDTO indicador : listaIndicadores) {
                indicador.setPadreDTO(fase);
                fase.getIndicadorFaseDTO().add(indicador);
            }
        }
        return fase;
    }

    private List<FaseDTO> crearFases() {
        List<FaseDTO> fases = new ArrayList<>();
        fases.add(crearFase(Long.parseLong("1"), "Configuracion de Vuelo", TipoFase.CONFIGURA, 1, null));
        fases.add(crearFase(Long.parseLong("2"), "Plan de Vuelo", TipoFase.INICIA, 2, crearIndicadoresFase()));
        return fases;
    }

    private OperacionDTO crearOperacion(Long id, String descripcion, TipoOperacion tipo, List<FaseDTO> fases) {
        OperacionDTO operacion = new OperacionDTO();
        operacion.setId(id);
        operacion.setDescripcion(descripcion);
        operacion.setTipo(tipo);
        for (FaseDTO fase : fases) {
            fase.setOperacionDTO(operacion);
            operacion.getFaseDTOs().add(fase);
        }
        return operacion;
    }

    private void crearOperaciones() {
        operaciones.put("Vuelo Comercial", crearOperacion(Long.parseLong("1"), "Vuelo Comercial", TipoOperacion.VUELO, crearFases()));
    }

    private ValorIndicadorFaseDTO crearValorIndicador(Long id, TipoPadreIndicador tipoPadreIndicador, IndicadorDTO indicador) {
        ValorIndicadorFaseDTO valor = new ValorIndicadorFaseDTO();
        valor.setId(id);
        valor.setTipoPadre(tipoPadreIndicador);
        valor.setIndicadorDTO(indicador);
        return valor;
    }

    private List<FaseOperacionVueloDTO> crearFaseOperacionVuelo() {
        List<FaseOperacionVueloDTO> fasesOperacionVuelo = new ArrayList<>();
        OperacionDTO operacion = operaciones.get("Vuelo Comercial");
        int i = 0;
        for (FaseDTO fase : operacion.getFaseDTOs()) {
            i++;
            FaseOperacionVueloDTO faseOperacion = new FaseOperacionVueloDTO();
            faseOperacion.setId(new Long(1));
            faseOperacion.setFaseDTO(fase);
            faseOperacion.setTipoPadre(operacion.getTipo());
            int x = 0;
            for (IndicadorFaseDTO indicador : fase.getIndicadorFaseDTO()) {
                x++;
                faseOperacion.getValorIndicadorDTOs().add(crearValorIndicador(new Long(x), indicador.getTipoPadre(), indicador));
            }
        }
        return fasesOperacionVuelo;
    }
}
