package uy.com.sofka.restaurante.reserva.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.reserva.value.CantidadSillas;
import uy.com.sofka.restaurante.reserva.value.MesaId;
import uy.com.sofka.restaurante.reserva.value.ReservaId;

public class ModificarCantidadSillasMesa extends Command{
  private final ReservaId reservaId;
  private final MesaId mesaId;
  private final CantidadSillas cantidadSillas;

  public ModificarCantidadSillasMesa(ReservaId reservaId, MesaId mesaId, CantidadSillas cantidadSillas) {
    this.reservaId = reservaId;
    this.mesaId = mesaId;
    this.cantidadSillas = cantidadSillas;
  }

  public ReservaId getReservaId() {
    return reservaId;
  }

  public MesaId getMesaId() {
    return mesaId;
  }

  public CantidadSillas getCantidadSillas() {
    return cantidadSillas;
  }
  
}
