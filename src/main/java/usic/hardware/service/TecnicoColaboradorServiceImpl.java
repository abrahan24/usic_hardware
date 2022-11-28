package usic.hardware.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usic.hardware.models.dao.ITecnicoColaboradorDao;
import usic.hardware.models.entity.TecnicoColaborador;

@Service
public class TecnicoColaboradorServiceImpl implements ITecnicoColaboradorService{

    @Autowired
    private ITecnicoColaboradorDao tecnicoColaboradorDao;

    @Override
    public List<TecnicoColaborador> findAll() {
        // TODO Auto-generated method stub
        return (List<TecnicoColaborador>)tecnicoColaboradorDao.findAll();
    }

    @Override
    public void save(TecnicoColaborador tecnicoColaborador) {
        // TODO Auto-generated method stub
        tecnicoColaboradorDao.save(tecnicoColaborador);
        
    }

    @Override
    public TecnicoColaborador findOne(Long id) {
        // TODO Auto-generated method stub
        return tecnicoColaboradorDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        tecnicoColaboradorDao.deleteById(id);
    }
    
}
