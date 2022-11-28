package usic.hardware.models.dao;

import org.springframework.data.repository.CrudRepository;

import usic.hardware.models.entity.Diagnostico;

public interface IDiagnosticoDao extends CrudRepository<Diagnostico, Long>{
    
}
