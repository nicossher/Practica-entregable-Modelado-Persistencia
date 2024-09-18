package ar.edu.utn.frba.dds.ejercicio_02.elementos;

import ar.edu.utn.frba.dds.ejercicio_02.personajes.Personaje;
import javax.persistence.*;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_elemento")
public abstract class ElementoDefensor {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  public void defenderA(Personaje personaje){};

}

/*
    Modificamos la interfaz ElementoDefensor para que sea una clase abstracta
  facilitando la persistencia con hibernate

    Aplicamos la estrategia de herencia Single Table para que los elementos defensores
  dado que no tienen atributos diferentes entre ellos
  esto reduce la complejidad de la base de datos y facilita la gestión.
 */