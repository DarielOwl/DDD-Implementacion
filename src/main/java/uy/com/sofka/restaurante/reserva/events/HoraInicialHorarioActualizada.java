package uy.com.sofka.restaurante.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.reserva.value.HoraInicial;
import uy.com.sofka.restaurante.reserva.value.HorarioId;

public class HoraInicialHorarioActualizada extends DomainEvent{
  private final HorarioId horarioId;
  private final HoraInicial horaInicial;

  public HoraInicialHorarioActualizada(HorarioId horarioId, HoraInicial horaInicial) {
    super("sofka.comida.actualizarhorainicialhorario");
    this.horarioId = horarioId;
    this.horaInicial = horaInicial;
  }

  public HorarioId getHorarioId() {
    return horarioId;
  }

  public HoraInicial getHoraInicial() {
    return horaInicial;
  }
  
}
