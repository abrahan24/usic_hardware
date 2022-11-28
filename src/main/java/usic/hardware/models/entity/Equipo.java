package usic.hardware.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private long id_equipo;
    private String descripcion;
    private String cod_equipo;
    private String estado_equipo;

    @DateTimeFormat( pattern = "yyyy-MM-dd")
    private Date fecha_adquisicion;
}
