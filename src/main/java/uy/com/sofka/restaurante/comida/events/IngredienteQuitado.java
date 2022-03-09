package uy.com.sofka.restaurante.comida.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.comida.value.IngredienteId;

public class IngredienteQuitado extends DomainEvent{
  private final IngredienteId ingredienteId;

  public IngredienteQuitado(IngredienteId ingredienteId) {
    super("sofka.comida.quitaringrediente");
    this.ingredienteId = ingredienteId;
  }
  
  public IngredienteId getIngredienteId() {
    return ingredienteId;
  }
}
