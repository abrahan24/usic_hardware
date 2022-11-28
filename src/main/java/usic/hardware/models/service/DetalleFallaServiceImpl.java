package usic.hardware.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usic.hardware.models.dao.IDetalleFallaDao;
import usic.hardware.models.entity.DetalleFalla;

@Service
public class DetalleFallaServiceImpl implements IDetalleFallaService{

    @Autowired
    private IDetalleFallaDao detalleFallaDao;

    @Override
    public List<DetalleFalla> findAll() {
        // TODO Auto-generated method stub
        return (List<DetalleFalla>) detalleFallaDao.findAll();
    }

    @Override
    public void save(DetalleFalla detalleFalla) {
        // TODO Auto-generated method stub
        detalleFallaDao.save(null);
        
    }

    @Override
    public DetalleFalla findOne(Long id) {
        // TODO Auto-generated method stub
        return detalleFallaDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        detalleFallaDao.deleteById(id);
        
    }
    
}
