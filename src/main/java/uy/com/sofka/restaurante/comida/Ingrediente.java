package uy.com.sofka.restaurante.comida;

import java.util.Objects;

import co.com.sofka.domain.generic.Entity;
import uy.com.sofka.restaurante.comida.value.*;

public class Ingrediente extends Entity<IngredienteId> {

  private Nombre nombre;
  private Descripcion descripcion;
  private Precio precio;

  public Ingrediente(IngredienteId ingredienteId, Nombre nombre, Descripcion descripcion, Precio precio) {
    super(ingredienteId);
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
  }

  // metodos (setters)
  public void modificarNombre(Nombre nombre) {
    this.nombre = Objects.requireNonNull(nombre);
  }

  public void modificarDescripcion(Descripcion descripcion) {
    this.descripcion = Objects.requireNonNull(descripcion);
  }
  
  public void actualizarPrecio(Precio precio) {
    this.precio = Objects.requireNonNull(precio);
  }
  
  //Getters
  public Nombre nombre() {
    return nombre;
  }
  
  public Descripcion descripcion() {
    return descripcion;
  }

  public Precio precio() {
    return precio;
  }
}
