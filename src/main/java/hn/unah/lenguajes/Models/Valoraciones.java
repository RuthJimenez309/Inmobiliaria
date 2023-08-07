package hn.unah.lenguajes.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Valoraciones {
	
	@Id
	private int id_valoracion;
	private int id_usuario;
	private int id_propiedad;
	private String calificacion;
	

}
