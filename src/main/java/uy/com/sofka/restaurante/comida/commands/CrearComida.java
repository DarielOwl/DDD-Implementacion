package uy.com.sofka.restaurante.comida.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.comida.value.ComidaId;
import uy.com.sofka.restaurante.comida.value.Descripcion;
import uy.com.sofka.restaurante.comida.value.Nombre;
import uy.com.sofka.restaurante.comida.value.Precio;

public class CrearComida extends Command {
  private final ComidaId comidaId;
  private final Nombre nombre;
  private final Descripcion descripcion;
  private final Precio precio;

  public CrearComida(ComidaId comidaId, Nombre nombre, Descripcion descripcion, Precio precio) {
    this.comidaId = comidaId;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
  }

  public ComidaId getComidaId() {
    return this.comidaId;
  }

  public Nombre getNombre() {
    return this.nombre;
  }

  public Descripcion getDescripcion() {
    return this.descripcion;
  }

  public Precio getPrecio() {
    return this.precio;
  }

}
