package usic.hardware.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usic.hardware.models.dao.ISolicitudServicioDao;
import usic.hardware.models.entity.SolicitudServicio;

@Service
public class SolicitudServicioServiceImpl implements ISolicitudServicioService{

    @Autowired
    private ISolicitudServicioDao solicitudServicioDao;

    @Override
    public List<SolicitudServicio> findAll() {
        // TODO Auto-generated method stub
        return (List<SolicitudServicio>) solicitudServicioDao.findAll();
    }

    @Override
    public void save(SolicitudServicio solicitudServicio) {
        // TODO Auto-generated method stub
        solicitudServicioDao.save(solicitudServicio);
        
    }

    @Override
    public SolicitudServicio findOne(Long id) {
        // TODO Auto-generated method stub
        return solicitudServicioDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        solicitudServicioDao.deleteById(id);
        
    }
    
}
