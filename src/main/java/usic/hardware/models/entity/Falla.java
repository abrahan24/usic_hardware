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
@Table(name= "falla")
@Setter
@Getter
public class Falla implements Serializable{
    
    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_falla;
    private String falla_nom;
    private String estado_falla;

    //Lista Tipo Detalle Falla 
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "falla", fetch = FetchType.LAZY)
    private List<Falla> fallas;
}
