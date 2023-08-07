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
public class Propiedades {

   @Id
   private int Id_propiedad;
   private int Id_documento;
   private String descripcion;
   private Double precio;
   private Double area;
   private Boolean disponiibilidad;
   private int id_imagenes;
   private int id_dueno;
   private int id_tipoPropiedad;
   private int id_ubicacion;
  
	

}
