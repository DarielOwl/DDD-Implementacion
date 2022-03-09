package uy.com.sofka.restaurante.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.cliente.value.Nombre;
import uy.com.sofka.restaurante.cliente.value.Telefono;

public class ClienteCreado extends DomainEvent {
  private final Nombre nombre;
  private final Telefono telefono;

  public ClienteCreado(Nombre nombre, Telefono telefono) {
    super("sofka.cliente.clientecreado");
    this.nombre = nombre;
    this.telefono = telefono;
  }
  
  public Nombre getNombre() {
    return nombre;
  }

  public Telefono getTelefono() {
    return telefono;
  }
}
