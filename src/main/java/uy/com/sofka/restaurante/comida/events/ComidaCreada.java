package uy.com.sofka.restaurante.comida.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.comida.value.Descripcion;
import uy.com.sofka.restaurante.comida.value.Nombre;
import uy.com.sofka.restaurante.comida.value.Precio;

public class ComidaCreada extends DomainEvent {
  private final Nombre nombre;
  private final Descripcion descripcion;
  private final Precio precio;

  public ComidaCreada(Nombre nombre, Descripcion descripcion, Precio precio) {
    super("sofka.comida.comidacreada");
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
  }

  public Nombre getNombre() {
    return nombre;
  }

  public Descripcion getDescripcion() {
    return descripcion;
  }
  
  public Precio getPrecio() {
    return precio;
  }
}
