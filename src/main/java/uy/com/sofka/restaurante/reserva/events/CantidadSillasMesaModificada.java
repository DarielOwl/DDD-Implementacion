package uy.com.sofka.restaurante.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.reserva.value.CantidadSillas;
import uy.com.sofka.restaurante.reserva.value.MesaId;

public class CantidadSillasMesaModificada extends DomainEvent{
  private final MesaId mesaId;
  private final CantidadSillas cantidadSillas;

  public CantidadSillasMesaModificada(MesaId mesaId, CantidadSillas cantidadSillas) {
    super("sofka.comida.modificarcantidadsillasmesa");
    this.mesaId = mesaId;
    this.cantidadSillas = cantidadSillas;
  }

  public MesaId getMesaId() {
    return mesaId;
  }

  public CantidadSillas getCantidadSillas() {
    return cantidadSillas;
  }
  
}
