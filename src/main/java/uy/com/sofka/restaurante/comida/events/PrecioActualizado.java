package uy.com.sofka.restaurante.comida.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.comida.value.Precio;

public class PrecioActualizado extends DomainEvent{
  private final Precio precio;

  public PrecioActualizado(Precio precio) {
    super("sofka.comida.actualizarprecio");
    this.precio = precio;
  } 

  public Precio getPrecio() {
    return precio;
  }

}
