package usic.hardware.models.dao;

import org.springframework.data.repository.CrudRepository;

import usic.hardware.models.entity.SolicitudServicio;

public interface ISolicitudServicioDao extends CrudRepository<SolicitudServicio, Long>{
    
}
