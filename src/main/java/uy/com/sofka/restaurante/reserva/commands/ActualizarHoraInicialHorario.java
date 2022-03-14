package uy.com.sofka.restaurante.reserva.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.reserva.value.HoraInicial;
import uy.com.sofka.restaurante.reserva.value.HorarioId;
import uy.com.sofka.restaurante.reserva.value.ReservaId;

public class ActualizarHoraInicialHorario extends Command{
  private final ReservaId reservaId;
  private final HorarioId horarioId;
  private final HoraInicial horaInicial;

  public ActualizarHoraInicialHorario(ReservaId reservaId, HorarioId horarioId, HoraInicial horaInicial) {
    this.reservaId = reservaId;
    this.horarioId = horarioId;
    this.horaInicial = horaInicial;
  }

  public ReservaId getReservaId() {
    return reservaId;
  }

  public HorarioId getHorarioId() {
    return horarioId;
  }

  public HoraInicial getHoraInicial() {
    return horaInicial;
  }
  
}
