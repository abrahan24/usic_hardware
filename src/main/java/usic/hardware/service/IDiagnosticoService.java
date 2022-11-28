package usic.hardware.service;

import java.util.List;

import usic.hardware.models.entity.Diagnostico;

public interface IDiagnosticoService {
    public List<Diagnostico> findAll();

    public void save(Diagnostico diagnostico);

    public Diagnostico findOne( Long id);

    public void delete(Long id);
}
