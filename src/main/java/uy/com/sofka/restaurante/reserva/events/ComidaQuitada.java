package uy.com.sofka.restaurante.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.comida.value.ComidaId;

public class ComidaQuitada extends DomainEvent {
  private final ComidaId comidaId;

  public ComidaQuitada(ComidaId comidaId) {
    super("sofka.comida.quitarcomida");
    this.comidaId = comidaId;
  } 

  public ComidaId getComidaId() {
    return comidaId;
  }

}
