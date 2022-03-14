package uy.com.sofka.restaurante.reserva.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.reserva.value.EstadoMesa;
import uy.com.sofka.restaurante.reserva.value.MesaId;
import uy.com.sofka.restaurante.reserva.value.ReservaId;

public class ActualizarEstadoMesa extends Command{
  private final ReservaId reservaId;
  private final MesaId mesaId;
  private final EstadoMesa estado;

  public ActualizarEstadoMesa(ReservaId reservaId, MesaId mesaId, EstadoMesa estado) {
    this.reservaId = reservaId;
    this.mesaId = mesaId;
    this.estado = estado;
  }

  public ReservaId getReservaId() {
    return reservaId;
  }

  public MesaId getMesaId() {
    return mesaId;
  }

  public EstadoMesa getEstado() {
    return estado;
  }
  
}
