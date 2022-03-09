package uy.com.sofka.restaurante.comida.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.comida.value.ComidaId;
import uy.com.sofka.restaurante.comida.value.IngredienteId;

public class QuitarIngrediente extends Command {
  private final ComidaId comidaId;
  private final IngredienteId ingredienteId;

  public QuitarIngrediente(ComidaId comidaId, IngredienteId ingredienteId) {
    this.comidaId = comidaId;
    this.ingredienteId = ingredienteId;
  }

  public ComidaId getComidaId() {
    return this.comidaId;
  }

  public IngredienteId getIngredienteId() {
    return this.ingredienteId;
  }
}
