package uy.com.sofka.restaurante.reserva.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.reserva.value.CantidadSillas;
import uy.com.sofka.restaurante.reserva.value.EstadoMesa;
import uy.com.sofka.restaurante.reserva.value.MesaId;
import uy.com.sofka.restaurante.reserva.value.NumeroMesa;
import uy.com.sofka.restaurante.reserva.value.ReservaId;

public class AsignarMesa extends Command {
  private final ReservaId reservaId;
  private final MesaId mesaId;
  private final EstadoMesa estado;
  private final CantidadSillas cantidadSillas;
  private final NumeroMesa numero;

  public AsignarMesa(ReservaId reservaId, MesaId mesaId, EstadoMesa estado, CantidadSillas cantidadSillas, NumeroMesa numero) {
    this.reservaId = reservaId;
    this.mesaId = mesaId;
    this.estado = estado;
    this.cantidadSillas = cantidadSillas;
    this.numero = numero;
  }

  public ReservaId getReservaId() {
    return reservaId;
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