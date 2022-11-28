package usic.hardware.models.dao;

import org.springframework.data.repository.CrudRepository;

import usic.hardware.models.entity.Falla;

public interface IFallaDao extends CrudRepository<Falla, Long>{
    
}
