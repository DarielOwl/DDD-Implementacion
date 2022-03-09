package uy.com.sofka.restaurante.comida.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.comida.value.Descripcion;

public class DescripcionModificada extends DomainEvent {
  private final Descripcion descripcion;

  public DescripcionModificada(Descripcion descripcion) {
    super("sofka.comida.modificardescripcion");
    this.descripcion = descripcion;
  }

  public Descripcion getDescripcion() {
    return descripcion;
  }
  
}
