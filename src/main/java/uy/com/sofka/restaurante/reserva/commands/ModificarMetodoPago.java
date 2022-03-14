package uy.com.sofka.restaurante.reserva.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.reserva.value.MetodoPago;
import uy.com.sofka.restaurante.reserva.value.ReservaId;

public class ModificarMetodoPago extends Command {
  private final ReservaId reservaId;
  private final MetodoPago metodoPago;

  public ModificarMetodoPago(ReservaId reservaId, MetodoPago metodoPago) {
    this.reservaId = reservaId;
    this.metodoPago = metodoPago;
  }

  public ReservaId getReservaId() {
    return reservaId;
  }

  public MetodoPago getMetodoPago() {
    return metodoPago;
  }
  
}
