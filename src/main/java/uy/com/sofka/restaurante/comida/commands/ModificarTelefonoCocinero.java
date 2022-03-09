package uy.com.sofka.restaurante.comida.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.comida.value.CocineroId;
import uy.com.sofka.restaurante.comida.value.ComidaId;
import uy.com.sofka.restaurante.comida.value.TelefonoCocinero;

public class ModificarTelefonoCocinero extends Command {
  
  private final ComidaId comidaId;
  private final CocineroId cocineroId;
  private final TelefonoCocinero telefono;

  public ModificarTelefonoCocinero(ComidaId comidaId, CocineroId cocineroId, TelefonoCocinero telefono) {
    this.comidaId = comidaId;
    this.cocineroId = cocineroId;
    this.telefono = telefono;
  }

  public ComidaId getComidaId() {
    return this.comidaId;
  }

  public CocineroId getCocineroId() {
    return this.cocineroId;
  }

  public TelefonoCocinero getNombre() {
    return this.telefono;
  }
}
