package usic.hardware.service;

import java.util.List;

import usic.hardware.models.entity.SolicitudServicio;

public interface ISolicitudServicioService {
    public List<SolicitudServicio> findAll();

    public void save(SolicitudServicio cargo);

    public SolicitudServicio findOne( Long id);

    public void delete(Long id);
}
