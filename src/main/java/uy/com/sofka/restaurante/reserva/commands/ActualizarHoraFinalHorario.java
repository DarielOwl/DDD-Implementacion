package uy.com.sofka.restaurante.reserva.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.reserva.value.HoraFinal;
import uy.com.sofka.restaurante.reserva.value.HorarioId;
import uy.com.sofka.restaurante.reserva.value.ReservaId;

public class ActualizarHoraFinalHorario extends Command{
  private final ReservaId reservaId;
  private final HorarioId horarioId;
  private final HoraFinal horaFinal;

  public ActualizarHoraFinalHorario(ReservaId reservaId, HorarioId horarioId, HoraFinal horaFinal) {
    this.reservaId = reservaId;
    this.horarioId = horarioId;
    this.horaFinal = horaFinal;
  }

  public ReservaId getReservaId() {
    return reservaId;
  }

  public HorarioId getHorarioId() {
    return horarioId;
  }

  public HoraFinal getHoraFinal() {
    return horaFinal;
  }
  
}
