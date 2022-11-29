package usic.hardware.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usic.hardware.models.dao.ITipoEquipoDao;
import usic.hardware.models.entity.TipoEquipo;

@Service
public class TipoEquipoServiceImpl implements ITipoEquipoService{

    @Autowired
    private ITipoEquipoDao tipoEquipoDao;

    @Override
    public List<TipoEquipo> findAll() {
        // TODO Auto-generated method stub
        return (List<TipoEquipo>) tipoEquipoDao.findAll();
    }

    @Override
    public void save(TipoEquipo tipoEquipo) {
        // TODO Auto-generated method stub
        tipoEquipoDao.save(tipoEquipo);
        
    }

    @Override
    public TipoEquipo findOne(Long id) {
        // TODO Auto-generated method stub
        return tipoEquipoDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        tipoEquipoDao.deleteById(id);
        
    }
    
}
