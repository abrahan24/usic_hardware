package usic.hardware.service;

import java.util.List;

import usic.hardware.models.entity.Equipo;

public interface IEquipoService {
    public List<Equipo> findAll();

    public void save(Equipo equipo);

    public Equipo findOne( Long id);

    public void delete(Long id);
}
