package uy.com.sofka.restaurante.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.cliente.value.Telefono;

public class TelefonoModificado extends DomainEvent {
  private final Telefono telefono;

  public TelefonoModificado(Telefono telefono) {
    super("sofka.cliente.modificartelefono");
    this.telefono = telefono;
  }

  public Telefono getTelefono() {
    return telefono;
  }
  
}
