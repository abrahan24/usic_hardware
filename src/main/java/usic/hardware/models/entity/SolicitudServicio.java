package usic.hardware.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "solicitudservicio")
@Setter
@Getter
public class SolicitudServicio implements Serializable{

    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_solicitudservicio;

    @Column(length = 1)
    private String estado_soli_servicio;
    

    //Tabla Persona
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_persona")
    private Persona persona;

    //Tabla Tecnico Colaborador
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tecnico_colaborador")
    private TecnicoColaborador tecnicoColaborador;

    //Tabla Predio
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_predio")
    private Predio predio;

    //Tabla Diagnostico
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_diagnostico")
    private Diagnostico diagnostico;

     //Tabla Diagnostico
     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "id_tipoequipo")
     private TipoEquipo tipoEquipo;
}
