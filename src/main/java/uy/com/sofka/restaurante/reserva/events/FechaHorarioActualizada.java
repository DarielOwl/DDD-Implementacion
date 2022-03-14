package uy.com.sofka.restaurante.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.reserva.value.Fecha;
import uy.com.sofka.restaurante.reserva.value.HorarioId;

public class FechaHorarioActualizada extends DomainEvent{
  private final HorarioId horarioId;
  private final Fecha fecha;

  public FechaHorarioActualizada(HorarioId horarioId, Fecha fecha) {
    super("sofka.comida.actualizarfechahorario");
    this.horarioId = horarioId;
    this.fecha = fecha;
  }

  public HorarioId getHorarioId() {
    return horarioId;
  }

  public Fecha getFecha() {
    return fecha;
  }
  
}
