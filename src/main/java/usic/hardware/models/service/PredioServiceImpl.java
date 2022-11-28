package usic.hardware.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usic.hardware.models.dao.IPredioDao;
import usic.hardware.models.entity.Predio;

@Service
public class PredioServiceImpl implements IPredioService{

    @Autowired
    private IPredioDao predioDao;

    @Override
    public List<Predio> findAll() {
        // TODO Auto-generated method stub
        return (List<Predio>) predioDao.findAll();
    }

    @Override
    public void save(Predio predio) {
        // TODO Auto-generated method stub
        predioDao.save(predio);
        
    }

    @Override
    public Predio findOne(Long id) {
        // TODO Auto-generated method stub
        return predioDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        predioDao.deleteById(id);
    }
    
}
