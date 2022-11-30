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
@Table(name= "detallefalla")
@Setter
@Getter
public class DetalleFalla implements Serializable{
    
    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_detallefalla;
    private String estado_df;

    //Tabla Falla
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_falla")
    private Falla falla;

    //Tabla Persona
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "detalleFalla", fetch = FetchType.LAZY)
	private List<Diagnostico> diagnosticos;

}
