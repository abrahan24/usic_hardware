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
    private Long id_tipoequipo;
    private String tipoequipo_nom;
    private String estado_tipoequipo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoEquipo", fetch = FetchType.LAZY)
	private List<Equipo> equipos;
}



