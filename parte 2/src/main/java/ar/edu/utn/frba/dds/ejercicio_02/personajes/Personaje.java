package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "personaje")
@Inheritance(strategy = InheritanceType.JOINED)
public class Personaje {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Getter
  @OneToMany(cascade = CascadeType.ALL)
  @JoinTable(
          name = "personaje_elemento_defensor",
          joinColumns = @JoinColumn(name = "personaje_id"),
          inverseJoinColumns = @JoinColumn(name = "elemento_defensor_id")
  )
  private List<ElementoDefensor> elementos;

  @Getter @Setter
  @Column(name = "estamina", nullable = false)
  private Integer estamina;

  @Getter @Setter
  @Column(name = "puntos_de_vida", nullable = false)
  private Integer puntosDeVida;

  public Personaje(){
    this.elementos = new ArrayList<>();
  }

  public void atacar(Personaje personaje) {
  //todo
  }

  public void agregarElemento(ElementoDefensor elemento){
    this.elementos.add(elemento);
  }

}

/*
  Para las clases que heredan de personaje se utilizo la estrategia de joined,
  ya que tiene a todos en una clase padre y a los hijos en tablas separadas,
  para que cada hijo pueda tener en su tabla separada sus atributos independientes,
  esto permite que no haya columnas nulas, y que sea mas facil de escalar si en un futuro se agregan mas tipos de personaje.


  Se uso un cascade all para que al borrar un personaje se borren todos sus elementos defensores.

 */