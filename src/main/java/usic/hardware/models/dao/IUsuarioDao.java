package usic.hardware.models.dao;

import org.springframework.data.repository.CrudRepository;

import usic.hardware.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
    
}
