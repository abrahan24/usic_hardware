package usic.hardware.models.service;

import java.util.List;

import usic.hardware.models.entity.Falla;

public interface IFallaService {
    public List<Falla> findAll();

    public void save(Falla falla);

    public Falla findOne( Long id);

    public void delete(Long id);
}
