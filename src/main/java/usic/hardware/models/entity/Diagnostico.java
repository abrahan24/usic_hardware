package usic.hardware.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "diagnostico")
@Setter
@Getter
public class Diagnostico implements Serializable{
    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_diagnostico;

    @Column(length = 1000)
    private String observacion;

    @Column(length = 1000)
    private String recomendacion;

    @Column(length = 1000)
    private String conclusion;

    @Column(length = 1)
    private String estado_diagnostico;

    //Tabla Falla
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_detallefalla")
    private DetalleFalla detalleFalla;

    
    //Lista Solicitudes de Servicio
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "diagnostico", fetch = FetchType.LAZY)
    private List<SolicitudServicio> solicitudServicios;
}
