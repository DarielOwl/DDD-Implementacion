package uy.com.sofka.restaurante.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.cliente.value.Nombre;

public class NombreModificado extends DomainEvent {
  private final Nombre nombre;

  public NombreModificado(Nombre nombre) {
    super("sofka.cliente.modificarnombre");
    this.nombre = nombre;
  }

  public Nombre getNombre() {
    return nombre;
  }
  
}
