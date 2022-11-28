package usic.hardware.models.service;

import java.util.List;

import usic.hardware.models.entity.TipoEquipo;

public interface ITipoEquipoService {
    public List<TipoEquipo> findAll();

    public void save(TipoEquipo tipoEquipo);

    public TipoEquipo findOne( Long id);

    public void delete(Long id);
}
