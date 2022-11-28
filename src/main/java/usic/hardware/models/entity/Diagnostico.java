package usic.hardware.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "diagnostico")
@Setter
@Getter
public class Diagnostico implements Serializable{
    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_diagnostico;
    private String observacion;
    private String recomendacion;
    private String conclusion;
    private String estado_diagnostico;
    
}
