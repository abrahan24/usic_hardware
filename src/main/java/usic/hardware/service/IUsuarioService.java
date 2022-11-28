package usic.hardware.service;

import java.util.List;

import usic.hardware.models.entity.Usuario;

public interface IUsuarioService {
    public List<Usuario> findAll();

    public void save(Usuario usuario);

    public Usuario findOne( Long id);

    public void delete(Long id);
}
