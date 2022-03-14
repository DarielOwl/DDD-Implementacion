package uy.com.sofka.restaurante.reserva.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.comida.value.ComidaId;
import uy.com.sofka.restaurante.reserva.value.ReservaId;

public class QuitarComida extends Command {
  private final ReservaId reservaId;
  private final ComidaId comidaId;

  public QuitarComida(ReservaId reservaId, ComidaId comidaId) {
    this.reservaId = reservaId;
    this.comidaId = comidaId;
  } 

  public ReservaId getReservaId() {
    return reservaId;
  }

  public ComidaId getComidaId() {
    return comidaId;
  }

}
