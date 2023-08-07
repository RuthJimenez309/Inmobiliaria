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

public class Tipo_Propiedad {
	@Id
	private int id_tipoPropiedad;
	   private String descripcioon;
	   private Double monto;

}
