package usic.hardware.service;

import java.util.List;

import usic.hardware.models.entity.DetalleFalla;

public interface IDetalleFallaService {
    public List<DetalleFalla> findAll();

    public void save(DetalleFalla detalleFalla);

    public DetalleFalla findOne( Long id);

    public void delete(Long id);
}
