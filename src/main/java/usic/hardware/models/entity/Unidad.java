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
@Table(name= "unidad")
@Setter
@Getter
public class Unidad implements Serializable{
    
    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_unidad;

    @Column(length = 60)
    private String unidad_nom;

    @Column(length = 1)
    private String estado_unidad;

    //Tabla Predio
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_predio")
    private Predio predio;

    // Lista Personas
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "unidad", fetch = FetchType.LAZY)
	private List<Persona> personas;
}
