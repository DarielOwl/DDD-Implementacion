package uy.com.sofka.restaurante.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.reserva.value.HoraFinal;
import uy.com.sofka.restaurante.reserva.value.HorarioId;

public class HoraFinalHorarioActualizada extends DomainEvent{
  private final HorarioId horarioId;
  private final HoraFinal horaFinal;

  public HoraFinalHorarioActualizada(HorarioId horarioId, HoraFinal horaFinal) {
    super("sofka.comida.actualizarhorafinalhorario");
    this.horarioId = horarioId;
    this.horaFinal = horaFinal;
  }

  public HorarioId getHorarioId() {
    return horarioId;
  }

  public HoraFinal getHoraFinal() {
    return horaFinal;
  }
  
}
