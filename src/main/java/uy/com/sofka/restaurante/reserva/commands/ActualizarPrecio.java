package uy.com.sofka.restaurante.reserva.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.reserva.value.Precio;
import uy.com.sofka.restaurante.reserva.value.ReservaId;

public class ActualizarPrecio extends Command {
  private final ReservaId reservaId;
  private final Precio precio;

  public ActualizarPrecio(ReservaId reservaId, Precio precio) {
    this.reservaId = reservaId;
    this.precio = precio;
  }

  public ReservaId getReservaId() {
    return reservaId;
  }

  public Precio getPrecio() {
    return precio;
  }
  
}
