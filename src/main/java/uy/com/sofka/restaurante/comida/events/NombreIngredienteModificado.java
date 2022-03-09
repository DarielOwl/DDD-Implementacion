package uy.com.sofka.restaurante.comida.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.comida.value.IngredienteId;
import uy.com.sofka.restaurante.comida.value.Nombre;

public class NombreIngredienteModificado extends DomainEvent{
  private final IngredienteId ingredienteId;
  private final Nombre nombre;

  public NombreIngredienteModificado(IngredienteId ingredienteId, Nombre nombre) {
    super("sofka.comida.modificarnombreingrediente");
    this.ingredienteId = ingredienteId;
    this.nombre = nombre;
  }

  public IngredienteId getIngredienteId() {
    return ingredienteId;
  }

  public Nombre getNombre() {
    return nombre;
  }
  
}
