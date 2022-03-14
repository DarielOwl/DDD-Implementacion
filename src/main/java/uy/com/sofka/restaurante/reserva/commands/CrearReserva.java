package uy.com.sofka.restaurante.reserva.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.reserva.value.Estado;
import uy.com.sofka.restaurante.reserva.value.MetodoPago;
import uy.com.sofka.restaurante.reserva.value.Precio;
import uy.com.sofka.restaurante.reserva.value.ReservaId;

public class CrearReserva extends Command {
  private final ReservaId reservaId;
  private final Precio precio;
  private final Estado estado;
  private final MetodoPago metodoPago;

  public CrearReserva(ReservaId reservaId, Precio precio, Estado estado, MetodoPago metodoPago) {
    this.reservaId = reservaId;
    this.estado = estado;
    this.metodoPago = metodoPago;
    this.precio = precio;
  }

  public ReservaId getReservaId() {
    return reservaId;
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
