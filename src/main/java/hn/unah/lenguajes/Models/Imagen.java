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
public class Imagen {

	 @Id
	   private int id_imagen;
	   private String imagen;
	
}
