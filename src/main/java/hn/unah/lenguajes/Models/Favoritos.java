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
public class Favoritos {
	
	 @Id
	   private int id_favoritos;
       private int id_clientes;
       private int id_propiedad;
	   private String descripcioon;


}
