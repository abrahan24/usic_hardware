package usic.hardware.models.dao;

import org.springframework.data.repository.CrudRepository;

import usic.hardware.models.entity.Cargo;

public interface ICargoDao extends CrudRepository<Cargo, Long>{
    
}
