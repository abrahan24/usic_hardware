package usic.hardware.models.dao;

import org.springframework.data.repository.CrudRepository;

import usic.hardware.models.entity.TecnicoColaborador;

public interface ITecnicoColaboradorDao extends CrudRepository<TecnicoColaborador, Long>{
    
}
