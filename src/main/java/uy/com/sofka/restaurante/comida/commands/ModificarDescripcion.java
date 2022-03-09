package uy.com.sofka.restaurante.comida.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.comida.value.ComidaId;
import uy.com.sofka.restaurante.comida.value.Descripcion;

public class ModificarDescripcion extends Command {
  
  private final ComidaId comidaId;
  private final Descripcion descripcion;

  public ModificarDescripcion(ComidaId comidaId, Descripcion descripcion) {
    this.comidaId = comidaId;
    this.descripcion = descripcion;
  }

  public ComidaId getComidaId() {
    return this.comidaId;
  }

  public Descripcion getDescripcion() {
    return this.descripcion;
  }
}
