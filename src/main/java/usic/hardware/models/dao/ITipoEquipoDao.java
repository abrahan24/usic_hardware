package usic.hardware.models.dao;

import org.springframework.data.repository.CrudRepository;

import usic.hardware.models.entity.TipoEquipo;

public interface ITipoEquipoDao extends CrudRepository<TipoEquipo, Long>{
    
}
