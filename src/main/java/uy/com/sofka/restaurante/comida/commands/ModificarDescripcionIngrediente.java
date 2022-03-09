package uy.com.sofka.restaurante.comida.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.comida.value.ComidaId;
import uy.com.sofka.restaurante.comida.value.Descripcion;
import uy.com.sofka.restaurante.comida.value.IngredienteId;

public class ModificarDescripcionIngrediente extends Command {
  private final ComidaId comidaId;
  private final IngredienteId ingredienteId; 
  private final Descripcion descripcion;

  public ModificarDescripcionIngrediente(ComidaId comidaId, IngredienteId ingredienteId, Descripcion descripcion) {
    this.comidaId = comidaId;
    this.ingredienteId = ingredienteId;
    this.descripcion = descripcion;
  }
  
  public ComidaId getComidaId() {
    return this.comidaId;
  }

  public IngredienteId getIngredienteId() {
    return this.ingredienteId;
  }

  public Descripcion getDescripcion() {
    return this.descripcion;
  }
}
