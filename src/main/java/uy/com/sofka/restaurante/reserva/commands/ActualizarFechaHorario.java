package uy.com.sofka.restaurante.reserva.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.reserva.value.Fecha;
import uy.com.sofka.restaurante.reserva.value.HorarioId;
import uy.com.sofka.restaurante.reserva.value.ReservaId;

public class ActualizarFechaHorario extends Command{
  private final ReservaId reservaId;
  private final HorarioId horarioId;
  private final Fecha fecha;

  public ActualizarFechaHorario(ReservaId reservaId, HorarioId horarioId, Fecha fecha) {
    this.reservaId = reservaId;
    this.horarioId = horarioId;
    this.fecha = fecha;
  }

  public ReservaId getReservaId() {
    return reservaId;
  }

  public HorarioId getHorarioId() {
    return horarioId;
  }

  public Fecha getFecha() {
    return fecha;
  }
  
}
