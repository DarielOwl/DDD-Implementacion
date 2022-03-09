package uy.com.sofka.restaurante.comida.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.comida.value.CocineroId;
import uy.com.sofka.restaurante.comida.value.ComidaId;
import uy.com.sofka.restaurante.comida.value.NombreCocinero;
import uy.com.sofka.restaurante.comida.value.TelefonoCocinero;

public class AsignarCocinero extends Command {
  private final ComidaId comidaId;
  private final CocineroId cocineroId;
  private final NombreCocinero nombre;
  private final TelefonoCocinero telefono;

  public AsignarCocinero(ComidaId comidaId, CocineroId cocineroId, NombreCocinero nombre, TelefonoCocinero telefono) {
    this.comidaId = comidaId;
    this.cocineroId = cocineroId;
    this.nombre = nombre;
    this.telefono = telefono;
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

  public TelefonoCocinero getTelefono() {
    return this.telefono;
  }

}
