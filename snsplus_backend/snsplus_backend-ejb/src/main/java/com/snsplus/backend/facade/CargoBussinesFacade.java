/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.backend.facade;

import com.snsplus.backend.client.dto.CargoDTO;
import com.snsplus.backend.client.facade.CargoFacadeRemote;
import com.snsplus.backend.model.Cargo;
import com.snsplus.backend.sql.facade.CargoFacadeLocal;
import com.snsplus.backend.utils.BackendConverter;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

/**
 *
 * @author conamerica15
 */
@Stateless(name = "CargoBussinesFacade", mappedName = CargoFacadeRemote.JNDI_REMOTE_NAME)
@Remote(CargoFacadeRemote.class)
public class CargoBussinesFacade implements CargoFacadeRemote{
    private final Mapper mapper = new DozerBeanMapper();
    
    @EJB
    private CargoFacadeLocal cargoFacadeLocal;

    @Override
    public CargoDTO create(CargoDTO cargoDTO) {
        Cargo cargo = mapper.map(cargoDTO, Cargo.class);
        cargoFacadeLocal.create(cargo);
        return cargo;
    }

    @Override
    public CargoDTO edit(CargoDTO cargoDTO) {
        Cargo cargo = cargoFacadeLocal.find(cargoDTO.getId());
        cargo.setCargo(cargoDTO.getCargo());
        cargoFacadeLocal.edit(cargo);
        return cargo;
    }

    @Override
    public void remove(CargoDTO cargoDTO) {
        cargoFacadeLocal.remove(cargoFacadeLocal.find(cargoDTO.getId()));
    }

    @Override
    public CargoDTO find(Object id) {
        return cargoFacadeLocal.find(id);
    }

    @Override
    public List<CargoDTO> findAll() {
        return BackendConverter.cargosTocargoDTOs(cargoFacadeLocal.findAll());
    }

    @Override
    public List<CargoDTO> findRange(int[] range) {
        return BackendConverter.cargosTocargoDTOs(cargoFacadeLocal.findRange(range));
    }

    @Override
    public int count() {
        return cargoFacadeLocal.count();
    }

    @Override
    public boolean isAlive() {
        return true;
    }            
}
