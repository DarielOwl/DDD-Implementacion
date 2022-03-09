package uy.com.sofka.restaurante.comida.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.comida.value.Cantidad;
import uy.com.sofka.restaurante.comida.value.IngredienteId;

public class CantidadIngredienteModificado extends DomainEvent{
  private final IngredienteId ingredienteId;
  private final Cantidad cantidad;

  public CantidadIngredienteModificado(IngredienteId ingredienteId, Cantidad cantidad) {
    super("sofka.comida.modificarcantidadingrediente");
    this.ingredienteId = ingredienteId;
    this.cantidad = cantidad;
  }

  public IngredienteId getIngredienteId() {
    return ingredienteId;
  }

  public Cantidad getCantidad() {
    return cantidad;
  }
}
