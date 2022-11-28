package usic.hardware.models.dao;

import org.springframework.data.repository.CrudRepository;

import usic.hardware.models.entity.DetalleFalla;

public interface IDetalleFallaDao extends CrudRepository<DetalleFalla, Long>{
    
}
