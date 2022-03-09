package uy.com.sofka.restaurante.comida.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.comida.value.ComidaId;
import uy.com.sofka.restaurante.comida.value.Precio;

public class ActualizarPrecio extends Command {
  private final ComidaId comidaId;
  private final Precio precio;

  public ActualizarPrecio(ComidaId comidaId, Precio precio) {
    this.comidaId = comidaId;
    this.precio = precio;
  }

  public ComidaId getComidaId() {
    return this.comidaId;
  }

  public Precio getPrecio() {
    return this.precio;
  }

}
