package uy.com.sofka.restaurante.comida.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.cliente.value.Nombre;
import uy.com.sofka.restaurante.comida.value.ComidaId;

public class ModificarNombre extends Command {
  private final ComidaId comidaId;
  private final Nombre nombre;

  public ModificarNombre(ComidaId comidaId, Nombre nombre) {
    this.comidaId = comidaId;
    this.nombre = nombre;
  }

  public ComidaId getComidaId() {
    return this.comidaId;
  }

  public Nombre getNombre() {
    return this.nombre;
  }
}
