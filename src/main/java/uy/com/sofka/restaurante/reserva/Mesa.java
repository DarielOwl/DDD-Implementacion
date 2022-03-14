package uy.com.sofka.restaurante.reserva;

import java.util.Objects;

import co.com.sofka.domain.generic.Entity;
import uy.com.sofka.restaurante.reserva.value.CantidadSillas;
import uy.com.sofka.restaurante.reserva.value.EstadoMesa;
import uy.com.sofka.restaurante.reserva.value.MesaId;
import uy.com.sofka.restaurante.reserva.value.NumeroMesa;

public class Mesa extends Entity<MesaId> {

  private CantidadSillas cantidadSillas;
  private EstadoMesa estado;
  private NumeroMesa numero;

  public Mesa(MesaId mesaId, CantidadSillas cantidadSillas, EstadoMesa estado, NumeroMesa numero) {
    super(mesaId);
    this.cantidadSillas = cantidadSillas;
    this.estado = estado;
    this.numero = numero;
  }

  // metodos (setters)
  public void actualizarEstado(EstadoMesa estado) {
    this.estado = Objects.requireNonNull(estado);
  }

  public void modificarCantidadSillas(CantidadSillas cantidadSillas) {
    this.cantidadSillas = Objects.requireNonNull(cantidadSillas);
  }
  
  //Getters
  public CantidadSillas cantidadSillas() {
    return cantidadSillas;
  }
  
  public EstadoMesa estado() {
    return estado;
  }
  
  public NumeroMesa numero() {
    return numero;
  }
}