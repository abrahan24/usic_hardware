package usic.hardware.models.dao;

import org.springframework.data.repository.CrudRepository;

import usic.hardware.models.entity.Unidad;

public interface IUnidadDao extends CrudRepository<Unidad, Long>{
    
}
