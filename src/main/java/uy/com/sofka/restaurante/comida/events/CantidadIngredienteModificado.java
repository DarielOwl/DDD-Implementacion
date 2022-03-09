package uy.com.sofka.restaurante.comida.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.comida.value.CantidadIngrediente;
import uy.com.sofka.restaurante.comida.value.IngredienteId;

public class CantidadIngredienteModificado extends DomainEvent{
  private final IngredienteId ingredienteId;
  private final CantidadIngrediente cantidad;

  public CantidadIngredienteModificado(IngredienteId ingredienteId, CantidadIngrediente cantidad) {
    super("sofka.comida.modificarcantidadingrediente");
    this.ingredienteId = ingredienteId;
    this.cantidad = cantidad;
  }

  public IngredienteId getIngredienteId() {
    return ingredienteId;
  }

  public CantidadIngrediente getCantidad() {
    return cantidad;
  }
}
