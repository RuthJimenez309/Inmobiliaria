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

public class Ubicacion {
	 @Id
	   private int id_ubicacion; 
	   private String zona;
	   private Double monto;
}
