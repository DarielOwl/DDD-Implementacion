package uy.com.sofka.restaurante.comida.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.comida.value.CocineroId;
import uy.com.sofka.restaurante.comida.value.ComidaId;
import uy.com.sofka.restaurante.comida.value.NombreCocinero;

public class ModificarNombreCocinero extends Command {
  
  private final ComidaId comidaId;
  private final CocineroId cocineroId;
  private final NombreCocinero nombre;

  public ModificarNombreCocinero(ComidaId comidaId, CocineroId cocineroId, NombreCocinero nombre) {
    this.comidaId = comidaId;
    this.cocineroId = cocineroId;
    this.nombre = nombre;
  }

  public ComidaId getComidaId() {
    return this.comidaId;
  }

  public CocineroId getCocineroId() {
    return this.cocineroId;
  }

  public NombreCocinero getNombre() {
    return this.nombre;
  }
}
