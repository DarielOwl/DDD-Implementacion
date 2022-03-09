package uy.com.sofka.restaurante.comida.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.comida.value.Cantidad;
import uy.com.sofka.restaurante.comida.value.ComidaId;
import uy.com.sofka.restaurante.comida.value.IngredienteId;

public class ModificarCantidadIngrediente extends Command {
  
  private final ComidaId comidaId;
  private final IngredienteId ingredienteId; 
  private final Cantidad cantidad;

  public ModificarCantidadIngrediente(ComidaId comidaId, IngredienteId ingredienteId, Cantidad cantidad) {
    this.comidaId = comidaId;
    this.ingredienteId = ingredienteId;
    this.cantidad = cantidad;
  }
  
  public ComidaId getComidaId() {
    return this.comidaId;
  }

  public IngredienteId getIngredienteId() {
    return this.ingredienteId;
  }

  public Cantidad getCantidad() {
    return this.cantidad;
  }
  
}
