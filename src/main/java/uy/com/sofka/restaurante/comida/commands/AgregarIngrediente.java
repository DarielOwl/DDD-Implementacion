package uy.com.sofka.restaurante.comida.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.comida.value.Cantidad;
import uy.com.sofka.restaurante.comida.value.ComidaId;
import uy.com.sofka.restaurante.comida.value.Descripcion;
import uy.com.sofka.restaurante.comida.value.IngredienteId;
import uy.com.sofka.restaurante.comida.value.Nombre;
import uy.com.sofka.restaurante.comida.value.Precio;

public class AgregarIngrediente extends Command {
  private final ComidaId comidaId;
  private final IngredienteId ingredienteId;
  private final Nombre nombre;
  private final Descripcion descripcion;
  private final Precio precio;
  private final Cantidad cantidad;

  public AgregarIngrediente(ComidaId comidaId, IngredienteId ingredienteId, Nombre nombre, Descripcion descripcion, Precio precio, Cantidad cantidad) {
    this.comidaId = comidaId;
    this.ingredienteId = ingredienteId;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
    this.cantidad = cantidad;
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

  public Descripcion getDescripcion() {
    return this.descripcion;
  }

  public Precio getPrecio() {
    return this.precio;
  }

  public Cantidad getCantidad() {
    return this.cantidad;
  }

}
