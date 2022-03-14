package uy.com.sofka.restaurante.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.reserva.value.Precio;

public class PrecioActualizado extends DomainEvent {
  private final Precio precio;

  public PrecioActualizado(Precio precio) {
    super("sofka.cliente.actualizarprecio");
    this.precio = precio;
  }

  public Precio getPrecio() {
    return precio;
  }
  
}
