package uy.com.sofka.restaurante.comida.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.comida.value.CocineroId;

public class CocineroAsignado extends DomainEvent {
  private final CocineroId cocineroId;

  public CocineroAsignado(CocineroId cocineroId) {
    super("sofka.comida.asignarcocinero");
    this.cocineroId = cocineroId;
  }
  
  public CocineroId getCocineroId() {
    return cocineroId;
  }
}
