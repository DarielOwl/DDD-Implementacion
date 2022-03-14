package uy.com.sofka.restaurante.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.reserva.value.CantidadSillas;
import uy.com.sofka.restaurante.reserva.value.EstadoMesa;
import uy.com.sofka.restaurante.reserva.value.MesaId;
import uy.com.sofka.restaurante.reserva.value.NumeroMesa;

public class MesaAsignada extends DomainEvent {
  private final MesaId mesaId;
  private final EstadoMesa estado;
  private final CantidadSillas cantidadSillas;
  private final NumeroMesa numero;

  public MesaAsignada(MesaId mesaId, EstadoMesa estado, CantidadSillas cantidadSillas, NumeroMesa numero) {
    super("sofka.comida.asignarmesa");
    this.mesaId = mesaId;
    this.estado = estado;
    this.cantidadSillas = cantidadSillas;
    this.numero = numero;
  }
  
  public MesaId getMesaId() {
    return mesaId;
  }

  public EstadoMesa getEstado() {
    return estado;
  }

  public CantidadSillas getCantidadSillas() {
    return cantidadSillas;
  }

  public NumeroMesa getNumero() {
    return numero;
  }
}