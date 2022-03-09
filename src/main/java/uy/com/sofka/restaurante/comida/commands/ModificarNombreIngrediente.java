package uy.com.sofka.restaurante.comida.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.comida.value.ComidaId;
import uy.com.sofka.restaurante.comida.value.IngredienteId;
import uy.com.sofka.restaurante.comida.value.Nombre;

public class ModificarNombreIngrediente extends Command {
  private final ComidaId comidaId;
  private final IngredienteId ingredienteId; 
  private final Nombre nombre;

  public ModificarNombreIngrediente(ComidaId comidaId, IngredienteId ingredienteId, Nombre nombre) {
    this.comidaId = comidaId;
    this.ingredienteId = ingredienteId;
    this.nombre = nombre;
  }
  
  public ComidaId getComidaId() {
    return this.comidaId;
  }

  public IngredienteId getIngredienteId() {
    return this.ingredienteId;
  }

  public Nombre getNombre() {
    return this.nombre;
  }
}
