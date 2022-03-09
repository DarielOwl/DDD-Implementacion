package uy.com.sofka.restaurante.comida.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.comida.value.ComidaId;
import uy.com.sofka.restaurante.comida.value.IngredienteId;
import uy.com.sofka.restaurante.comida.value.Precio;

public class ActualizarPrecioIngrediente extends Command {
  
  private final ComidaId comidaId;
  private final IngredienteId ingredienteId; 
  private final Precio precio;

  public ActualizarPrecioIngrediente(ComidaId comidaId, IngredienteId ingredienteId, Precio precio) {
    this.comidaId = comidaId;
    this.ingredienteId = ingredienteId;
    this.precio = precio;
  }
  
  public ComidaId getComidaId() {
    return this.comidaId;
  }

  public IngredienteId getIngredienteId() {
    return this.ingredienteId;
  }

  public Precio getPrecio() {
    return this.precio;
  }
}
