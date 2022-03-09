package uy.com.sofka.restaurante.comida;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

import co.com.sofka.domain.generic.AggregateEvent;
import uy.com.sofka.restaurante.comida.events.ComidaCreada;
import uy.com.sofka.restaurante.comida.value.*;

public class Comida extends AggregateEvent<ComidaId> {
  protected Nombre nombre;
  protected Descripcion descripcion;
  protected Precio precio;
  protected Map<Ingrediente, CantidadIngrediente> ingredientes;
  protected CocineroId cocineroId;

  public Comida(ComidaId entityId, Nombre nombre, Descripcion descripcion, Precio precio) {
    super(entityId);
    appendChange(new ComidaCreada(nombre, descripcion, precio)).apply(); //Crar obj Cliente
  }

  /** Metodos */
  public void actualizarPrecio(Precio precio){
    Objects.requireNonNull(precio);
    //appendChange(new PrecioActualizado(precio)).apply();
  }

  public void modificarNombre(Nombre nombre){
    Objects.requireNonNull(nombre);
    //appendChange(new NombreModificado(nombre)).apply();
  }

  public void modificarDescripcion(Descripcion descripcion){
    Objects.requireNonNull(descripcion);
    //appendChange(new DescripcionModificada(precio)).apply();
  }

  public void asignarCocinero(CocineroId cocineroId){
    Objects.requireNonNull(cocineroId);
    //appendChange(new CocineroAsignado(cocineroId)).apply();
  }

  public void agregarIngrediente(IngredienteId ingredienteId, Nombre nombre, Descripcion descripcion, Precio precio, CantidadIngrediente cantidad) {
    Objects.requireNonNull(entityId);
    Objects.requireNonNull(nombre);
    Objects.requireNonNull(descripcion);
    Objects.requireNonNull(precio);
    Objects.requireNonNull(cantidad);
    // appendChange(new IngredienteAgregado(entityId, nombre, descripcion, precio, cantidad)).apply();
  }
  
  public void quitarIngrediente(IngredienteId ingredienteId){
    Objects.requireNonNull(ingredienteId);
    // appendChange(new IngredienteQuitado(ingredienteId)).apply();
  }

  public void modificarCantidadIngrediente(CantidadIngrediente cantidadIngrediente){
    Objects.requireNonNull(cantidadIngrediente);
    // appendChange(new CantidadIngredienteModificado(cantidadIngrediente)).apply();
  }

  public void modificarNombreIngrediente(Nombre nombreIngrediente){
    Objects.requireNonNull(nombreIngrediente);
    // appendChange(new NombreIngredienteModificado(nombreIngrediente)).apply();
  }

  public void modificarDescripcionIngrediente(Descripcion descripcionIngrediente){
    Objects.requireNonNull(descripcionIngrediente);
    // appendChange(new DescripcionIngredienteModificado(descripcionIngrediente)).apply();
  }

  public void actualizarPrecioIngrediente(Precio precioIngrediente){
    Objects.requireNonNull(precioIngrediente);
    // appendChange(new PrecioIngredienteActualizar(precioIngrediente)).apply();
  }

  public void modificarTelefonoCocinero(TelefonoCocinero telefonoCocinero){
    Objects.requireNonNull(telefonoCocinero);
    // appendChange(new TelefonoCocineroModificado(telefonoCocinero)).apply();
  }

  public void modificarNombreCocinero(NombreCocinero nombreCocinero){
    Objects.requireNonNull(nombreCocinero);
    // appendChange(new NombreCocineroModificado(nombreCocinero)).apply();
  }

  // getters
  public Nombre nombre() {
    return nombre;
  }

  public Descripcion descripcion() {
    return descripcion;
  }

  public Precio precio() {
    return precio;
  }

  public Map<Ingrediente, CantidadIngrediente> ingredientes() {
    return ingredientes;
  }

  // public Ingrediente ingredientePorId(IngredienteId ingredienteId){
  //   Iterator it = ingredientes().keySet().iterator();
  //   while(it.hasNext()){  
  //     Ingrediente key = it.next();
  //     if(key.ingredienteId().equals(ingredienteId))
  //     return key;
  //   }
  // }

  public CocineroId getCocineroId() {
    return cocineroId;
  }
}
