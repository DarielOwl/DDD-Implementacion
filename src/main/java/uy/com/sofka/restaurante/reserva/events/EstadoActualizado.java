package uy.com.sofka.restaurante.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.reserva.value.Estado;

public class EstadoActualizado extends DomainEvent {
  private final Estado estado;

  public EstadoActualizado(Estado estado) {
    super("sofka.cliente.actualizarestado");
    this.estado = estado;
  }

  public Estado getEstado() {
    return estado;
  }
  
}
