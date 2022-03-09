package uy.com.sofka.restaurante.comida.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.comida.value.Nombre;

public class NombreModificado extends DomainEvent {
  private final Nombre nombre;

  public NombreModificado(Nombre nombre) {
    super("sofka.comida.modificarnombre");
    this.nombre = nombre;
  }

  public Nombre getNombre() {
    return nombre;
  }
  
}
