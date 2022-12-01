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
@Table(name= "persona")
@Setter
@Getter
public class Persona implements Serializable{
    
    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;

    @Column(length = 25,nullable = true)
    private String persona_nom;

    @Column(length = 25)
    private String ap_paterno;

    @Column(length = 25)
    private String ap_materno;

    @Column(length = 15)
    private String num_celular;

    @Column(length = 1,nullable = true)
    private String genero;

    @Column(length = 1)
    private String estado_per;

    //Tabla Cargo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cargo")
    private Cargo cargo;
    //Tabla Unidad
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_unidad")
    private Unidad unidad;


    //Lista Tipo Equipo 
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona", fetch = FetchType.LAZY)
	private List<Equipo> equipos;

    //Lista Usuario
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona", fetch = FetchType.LAZY)
	private List<Usuario> usuarios;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona", fetch = FetchType.LAZY)
	private List<SolicitudServicio> solicitudServicios;
    
    
}
