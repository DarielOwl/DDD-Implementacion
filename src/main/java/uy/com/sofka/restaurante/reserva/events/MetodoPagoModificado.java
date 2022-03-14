package uy.com.sofka.restaurante.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.reserva.value.MetodoPago;

public class MetodoPagoModificado extends DomainEvent {
  private final MetodoPago metodoPago;

  public MetodoPagoModificado(MetodoPago metodoPago) {
    super("sofka.cliente.modificarmetodopago");
    this.metodoPago = metodoPago;
  }

  public MetodoPago getMetodoPago() {
    return metodoPago;
  }
  
}
