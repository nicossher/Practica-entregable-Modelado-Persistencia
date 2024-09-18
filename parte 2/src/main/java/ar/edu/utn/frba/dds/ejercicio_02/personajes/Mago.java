package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "mago")
@PrimaryKeyJoinColumn(name = "personaje_id")
public class Mago  extends Personaje{
  @Column(name = "nivel_de_magia", nullable = false)
  private Integer nivelDeMagia;

  @Column(name = "tiene_alas", nullable = false)
  private Boolean tieneAlas;

  public void atacar(Personaje personaje) {
 //TODO
  }


}
