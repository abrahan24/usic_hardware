package usic.hardware.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "predio")
@Setter
@Getter
public class Predio implements Serializable{
    
    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_predio;
    private String predio_nom;
    private String estado_predio;

    //Lista Unidades
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "predio", fetch = FetchType.LAZY)
	private List<Unidad> unidades;

    //Lista Solicitudes de Servicio
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "predio", fetch = FetchType.LAZY)
	private List<SolicitudServicio> solicitudServicios;
    
}
