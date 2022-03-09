package uy.com.sofka.restaurante.comida.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.comida.value.IngredienteId;
import uy.com.sofka.restaurante.comida.value.Precio;

public class PrecioIngredienteActualizado extends DomainEvent{
  private final IngredienteId ingredienteId;
  private final Precio precio;

  public PrecioIngredienteActualizado(IngredienteId ingredienteId, Precio precio) {
    super("sofka.comida.actualizarprecioingrediente");
    this.ingredienteId = ingredienteId;
    this.precio = precio;
  } 

  public IngredienteId getIngredienteId() {
    return ingredienteId;
  }

  public Precio getPrecio() {
    return precio;
  }

}
