package usic.hardware.models.entity;

import java.io.Serializable;

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
@Table(name= "usuario")
@Setter
@Getter
public class Usuario implements Serializable{
    
    private static final long serialVersionUID = 2629195288020321924L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_usuario;
    private String usuario_nom;
    private String contrasena;
    private String estado_usu;

    //Tabla Persona
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_persona")
    private Persona persona;

    //Tabla Tecnico Colaborador
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tecnico_colaborador")
    private TecnicoColaborador tecnicoColaborador;
}
