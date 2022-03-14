package uy.com.sofka.restaurante.comida.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.comida.value.CocineroId;
import uy.com.sofka.restaurante.comida.value.TelefonoCocinero;

public class TelefonoCocineroModificado extends DomainEvent{
  private final CocineroId cocineroId;
  private final TelefonoCocinero telefono;

  public TelefonoCocineroModificado(CocineroId cocineroId, TelefonoCocinero telefono) {
    super("sofka.comida.modificartelefonococinero");
    this.cocineroId = cocineroId;
    this.telefono = telefono;
  }

  public CocineroId getCocineroId() {
    return cocineroId;
  }

  public TelefonoCocinero getTelefono() {
    return telefono;
  }
  
}
