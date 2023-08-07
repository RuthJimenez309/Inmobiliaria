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
public class Duenos {
	
	@Id
	   private int id_duenio;
 	   private int id_usario;
	   private String descripcioon;

}
