package uy.com.sofka.restaurante.comida.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.comida.value.Descripcion;
import uy.com.sofka.restaurante.comida.value.Nombre;
import uy.com.sofka.restaurante.comida.value.Precio;
import uy.com.sofka.restaurante.comida.value.CantidadIngrediente;
import uy.com.sofka.restaurante.comida.value.IngredienteId;

public class IngredienteAgregado extends DomainEvent{
  private final IngredienteId ingredienteId;
  private final Nombre nombre;
  private final Descripcion descripcion;
  private final Precio precio;
  private final CantidadIngrediente cantidad;

  public IngredienteAgregado(IngredienteId ingredienteId, Nombre nombre, Descripcion descripcion, Precio precio, CantidadIngrediente cantidad) {
    super("sofka.comida.agregaringrediente");
    this.ingredienteId = ingredienteId;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
    this.cantidad = cantidad;
  } 

  public IngredienteId getIngredienteId() {
    return ingredienteId;
  }

  public Nombre getNombre() {
    return nombre;
  }

  public Descripcion getDescripcion() {
    return descripcion;
  }
  
  public Precio getPrecio() {
    return precio;
  }

  public CantidadIngrediente getCantidad() {
    return cantidad;
  }
}
