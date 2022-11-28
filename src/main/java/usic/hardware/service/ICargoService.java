package usic.hardware.service;
import java.util.List;

import usic.hardware.models.entity.Cargo;

public interface ICargoService {
    public List<Cargo> findAll();

    public void save(Cargo cargo);

    public Cargo findOne( Long id);

    public void delete(Long id);
}
