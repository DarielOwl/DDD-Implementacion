package uy.com.sofka.restaurante.comida.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.comida.value.Descripcion;
import uy.com.sofka.restaurante.comida.value.IngredienteId;

public class DescripcionIngredienteModificada extends DomainEvent {
  private final IngredienteId ingredienteId;
  private final Descripcion descripcion;

  public DescripcionIngredienteModificada(IngredienteId ingredienteId, Descripcion descripcion) {
    super("sofka.comida.modificardescripcioningrediente");
    this.ingredienteId = ingredienteId;
    this.descripcion = descripcion;
  }

  public IngredienteId getIngredienteId() {
    return ingredienteId;
  }

  public Descripcion getDescripcion() {
    return descripcion;
  }
  
}