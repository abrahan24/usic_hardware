package usic.hardware.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
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
@Table(name= "tipoequipo")
@Setter
@Getter
public class TipoEquipo implements Serializable{
    
    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_tipoequipo;
    private String tipoequipo_nom;
    private String estado_tipoequipo;

    //Tabla Equipo Equipo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_equipo")
    private Equipo equipo;

    //Tabla Equipo Equipo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_persona")
    private Persona persona;

    //Lista Solicitud de servicio
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoequipo", fetch = FetchType.LAZY)
    private List<SolicitudServicio> solicitudServicios;
}
