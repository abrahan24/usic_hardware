package usic.hardware.models.dao;

import org.springframework.data.repository.CrudRepository;

import usic.hardware.models.entity.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long>{
    
}
