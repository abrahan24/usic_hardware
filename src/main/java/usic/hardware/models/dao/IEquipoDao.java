package usic.hardware.models.dao;

import org.springframework.data.repository.CrudRepository;

import usic.hardware.models.entity.Equipo;

public interface IEquipoDao extends CrudRepository<Equipo, Long>{
    
}
