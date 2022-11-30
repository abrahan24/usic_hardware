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
@Table(name= "tecnico_colaborador")
@Setter
@Getter
public class TecnicoColaborador implements Serializable{

    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tecnico_colaborador;
    private String estado_tec_cola;

     //Tabla Tecnico Usuario
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;


    //Lista Solicitud Servicio
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tecnicoColaborador", fetch = FetchType.LAZY)
    private List<SolicitudServicio> solicitudServicios;
    
}
