package usic.hardware.service;

import java.util.List;

import usic.hardware.models.entity.Predio;

public interface IPredioService {
    public List<Predio> findAll();

    public void save(Predio predio);

    public Predio findOne( Long id);

    public void delete(Long id);
}
