package uy.com.sofka.restaurante.reserva.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.reserva.value.HoraInicial;
import uy.com.sofka.restaurante.reserva.value.Fecha;
import uy.com.sofka.restaurante.reserva.value.HorarioId;
import uy.com.sofka.restaurante.reserva.value.ReservaId;
import uy.com.sofka.restaurante.reserva.value.HoraFinal;

public class AsignarHorario extends Command {
  private final ReservaId reservaId;
  private final HorarioId horarioId;
  private final Fecha fecha;
  private final HoraInicial horaInicial;
  private final HoraFinal horaFinal;

  public AsignarHorario(ReservaId reservaId, HorarioId horarioId, Fecha fecha, HoraInicial horaInicial, HoraFinal horaFinal) {
    this.reservaId = reservaId;
    this.horarioId = horarioId;
    this.fecha = fecha;
    this.horaInicial = horaInicial;
    this.horaFinal = horaFinal;
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

  public HoraInicial getHoraInicial() {
    return horaInicial;
  }

  public HoraFinal getHoraFinal() {
    return horaFinal;
  }
}