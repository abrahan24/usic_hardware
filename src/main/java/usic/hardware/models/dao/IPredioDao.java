package usic.hardware.models.dao;

import org.springframework.data.repository.CrudRepository;

import usic.hardware.models.entity.Predio;

public interface IPredioDao extends CrudRepository<Predio, Long>{
    
}
