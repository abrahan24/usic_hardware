package usic.hardware.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usic.hardware.models.dao.IEquipoDao;
import usic.hardware.models.entity.Equipo;

@Service
public class EquipoServiceImpl implements IEquipoService{

    @Autowired
    private IEquipoDao equipoDao;

    @Override
    public List<Equipo> findAll() {
        // TODO Auto-generated method stub
        return (List<Equipo>) equipoDao.findAll();
    }

    @Override
    public void save(Equipo equipo) {
        // TODO Auto-generated method stub
        equipoDao.save(equipo);
        
    }

    @Override
    public Equipo findOne(Long id) {
        // TODO Auto-generated method stub
        return equipoDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        equipoDao.deleteById(id);
    }
    
}
