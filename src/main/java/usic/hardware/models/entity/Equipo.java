package usic.hardware.models.entity;

import java.io.Serializable;
import java.util.Date;
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

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "equipo")
@Setter
@Getter
public class Equipo implements Serializable{
    
    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_equipo;

    @Column(length = 1000)
    private String descripcion;

    @Column(length = 25)
    private String cod_equipo;

    @Column(length = 1)
    private String estado_equipo;

    @DateTimeFormat( pattern = "yyyy-MM-dd")
    private Date fecha_adquisicion;

     //Tabla Tipo Equipo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipoequipo")
    private TipoEquipo tipoEquipo;
    
    //Tabla Tipo Equipo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_persona")
    private Persona persona;
        

}
