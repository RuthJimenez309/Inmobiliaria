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
public class Usuarios {
	@Id
	   private int Id_usuario;
		private String DNI;
		private String p_nombre;
		private String s_nombre;
		private String p_apellido;
		private String s_apellido;
		
		private String tipo_usuario;
	

}
