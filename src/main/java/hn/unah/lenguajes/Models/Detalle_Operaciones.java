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
public class Detalle_Operaciones {
	
	@Id
	private int id_detalleoperacion; 
	 private Date fechaInicio;
	   private int id_cliente;
	   private int id_propiedad;
	   private int id_dueno;
	   private int id_operacion;
	   private Date fechaFin;
	   private Double montoInicial;
	   private Double totalPagar;
	   private Date fechaPago;

}
