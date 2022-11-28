package usic.hardware.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usic.hardware.models.dao.ICargoDao;
import usic.hardware.models.entity.Cargo;

@Service
public class CargoServiceImpl implements ICargoService{
    
    @Autowired
    private ICargoDao cargoDao;

    @Override
    public List<Cargo> findAll() {
        // TODO Auto-generated method stub
        return (List<Cargo>) cargoDao.findAll();
    }

    @Override
    public void save(Cargo cargo) {
        // TODO Auto-generated method stub
        cargoDao.save(cargo);
        
    }

    @Override
    public Cargo findOne(Long id) {
        // TODO Auto-generated method stub
        return cargoDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        cargoDao.deleteById(id);
        
    }
    
}
