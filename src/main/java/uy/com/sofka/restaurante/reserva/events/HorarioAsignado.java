package uy.com.sofka.restaurante.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.reserva.value.HoraInicial;
import uy.com.sofka.restaurante.reserva.value.Fecha;
import uy.com.sofka.restaurante.reserva.value.HorarioId;
import uy.com.sofka.restaurante.reserva.value.HoraFinal;

public class HorarioAsignado extends DomainEvent {
  private final HorarioId horarioId;
  private final Fecha fecha;
  private final HoraInicial horaInicial;
  private final HoraFinal horaFinal;

  public HorarioAsignado(HorarioId horarioId, Fecha fecha, HoraInicial horaInicial, HoraFinal horaFinal) {
    super("sofka.comida.asignarhorario");
    this.horarioId = horarioId;
    this.fecha = fecha;
    this.horaInicial = horaInicial;
    this.horaFinal = horaFinal;
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