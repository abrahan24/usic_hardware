package usic.hardware.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import usic.hardware.models.dao.IFallaDao;
import usic.hardware.models.entity.Falla;

public class FallaServiceImpl implements IFallaService{

    @Autowired
    private IFallaDao fallaDao;

    @Override
    public List<Falla> findAll() {
        // TODO Auto-generated method stub
        return (List<Falla>) fallaDao.findAll();
    }

    @Override
    public void save(Falla falla) {
        // TODO Auto-generated method stub
        fallaDao.save(falla);
        
    }

    @Override
    public Falla findOne(Long id) {
        // TODO Auto-generated method stub
        return fallaDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        fallaDao.deleteById(id);
        
    }
    
}
