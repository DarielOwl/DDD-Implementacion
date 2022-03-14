package uy.com.sofka.restaurante.reserva.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.reserva.value.Estado;
import uy.com.sofka.restaurante.reserva.value.ReservaId;

public class ActualizarEstado extends Command {
  private final ReservaId reservaId;
  private final Estado estado;

  public ActualizarEstado(ReservaId reservaId, Estado estado) {
    this.reservaId = reservaId;
    this.estado = estado;
  }

  public ReservaId getReservaId() {
    return reservaId;
  }

  public Estado getEstado() {
    return estado;
  }
  
}
