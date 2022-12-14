package usic.hardware.models.service;

import java.util.List;

import usic.hardware.models.entity.Persona;

public interface IPersonaService {
    public List<Persona> findAll();

    public void save(Persona persona);

    public Persona findOne( Long id);

    public void delete(Long id);
}
