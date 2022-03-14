package uy.com.sofka.restaurante.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.reserva.value.Estado;
import uy.com.sofka.restaurante.reserva.value.MetodoPago;
import uy.com.sofka.restaurante.reserva.value.Precio;

public class ReservaCreada extends DomainEvent {
  private final Precio precio;
  private final Estado estado;
  private final MetodoPago metodoPago;

  public ReservaCreada(Precio precio, Estado estado, MetodoPago metodoPago) {
    super("sofka.reserva.reservacreada");
    this.estado = estado;
    this.metodoPago = metodoPago;
    this.precio = precio;
  }

  public Estado getEstado() {
    return estado;
  }

  public MetodoPago getMetodoPago() {
    return metodoPago;
  }
  
  public Precio getPrecio() {
    return precio;
  }
}
