package uy.com.sofka.restaurante.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.comida.value.ComidaId;

public class ComidaAgregada extends DomainEvent{
  private final ComidaId comidaId;

  public ComidaAgregada(ComidaId comidaId) {
    super("sofka.comida.agregarcomida");
    this.comidaId = comidaId;
  } 

  public ComidaId getComidaId() {
    return comidaId;
  }
}
