package ar.edu.utn.frba.dds.ejercicio_02.elementos;

import ar.edu.utn.frba.dds.ejercicio_02.personajes.Personaje;
import javax.persistence.*;
@Entity
@DiscriminatorValue("ARCO")
public class Arco extends ElementoDefensor{
  @Override
  public void defenderA(Personaje personaje) {

  }
}
