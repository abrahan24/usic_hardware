package usic.hardware.models.service;

import java.util.List;

import usic.hardware.models.entity.TecnicoColaborador;

public interface ITecnicoColaboradorService {
    public List<TecnicoColaborador> findAll();

    public void save(TecnicoColaborador tecnicoColaborador);

    public TecnicoColaborador findOne( Long id);

    public void delete(Long id);
}
