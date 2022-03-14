package uy.com.sofka.restaurante.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.reserva.value.EstadoMesa;
import uy.com.sofka.restaurante.reserva.value.MesaId;

public class EstadoMesaActualizado extends DomainEvent{
  private final MesaId mesaId;
  private final EstadoMesa estado;

  public EstadoMesaActualizado(MesaId mesaId, EstadoMesa estado) {
    super("sofka.comida.modificarestadomesamesa");
    this.mesaId = mesaId;
    this.estado = estado;
  }

  public MesaId getMesaId() {
    return mesaId;
  }

  public EstadoMesa getEstado() {
    return estado;
  }
  
}
