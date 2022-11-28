package usic.hardware.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usic.hardware.models.dao.IUnidadDao;
import usic.hardware.models.entity.Unidad;

@Service
public class UnidadServiceImpl implements IUnidadService{

    @Autowired
    private IUnidadDao unidadDao;

    @Override
    public List<Unidad> findAll() {
        // TODO Auto-generated method stub
        return (List<Unidad>) unidadDao.findAll();
    }

    @Override
    public void save(Unidad unidad) {
        // TODO Auto-generated method stub
        unidadDao.save(unidad);
        
    }

    @Override
    public Unidad findOne(Long id) {
        // TODO Auto-generated method stub
        return unidadDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        unidadDao.deleteById(id);
        
    }
    
}
