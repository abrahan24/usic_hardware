package usic.hardware.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usic.hardware.models.dao.IDiagnosticoDao;
import usic.hardware.models.entity.Diagnostico;

@Service
public class DiagnosticoServiceImpl implements IDiagnosticoService{

    @Autowired
    private IDiagnosticoDao diagnosticoDao;

    @Override
    public List<Diagnostico> findAll() {
        // TODO Auto-generated method stub
        return (List<Diagnostico>) diagnosticoDao.findAll();
    }

    @Override
    public void save(Diagnostico diagnostico) {
        // TODO Auto-generated method stub
        diagnosticoDao.save(diagnostico);
        
    }

    @Override
    public Diagnostico findOne(Long id) {
        // TODO Auto-generated method stub
        return diagnosticoDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        diagnosticoDao.deleteById(id);
        
    }
    
}
