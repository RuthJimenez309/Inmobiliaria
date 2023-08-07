package hn.unah.lenguajes.Models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Consultas {
	
	 @Id
	   private int id_consultas;
	   private int id_cliente;
	   private int id_duenos;
	   private int id_propiedad;
	   private Date fecha_Consulta;
	   private String comentario;
	  
}
