package uy.com.sofka.restaurante.comida;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import co.com.sofka.domain.generic.AggregateEvent;
import uy.com.sofka.restaurante.comida.events.CantidadIngredienteModificado;
import uy.com.sofka.restaurante.comida.events.CocineroAsignado;
import uy.com.sofka.restaurante.comida.events.ComidaCreada;
import uy.com.sofka.restaurante.comida.events.DescripcionIngredienteModificada;
import uy.com.sofka.restaurante.comida.events.DescripcionModificada;
import uy.com.sofka.restaurante.comida.events.IngredienteAgregado;
import uy.com.sofka.restaurante.comida.events.IngredienteQuitado;
import uy.com.sofka.restaurante.comida.events.NombreCocineroModificado;
import uy.com.sofka.restaurante.comida.events.NombreIngredienteModificado;
import uy.com.sofka.restaurante.comida.events.NombreModificado;
import uy.com.sofka.restaurante.comida.events.PrecioActualizado;
import uy.com.sofka.restaurante.comida.events.PrecioIngredienteActualizado;
import uy.com.sofka.restaurante.comida.events.TelefonoCocineroModificado;
import uy.com.sofka.restaurante.comida.value.*;

public class Comida extends AggregateEvent<ComidaId> {
  protected Nombre nombre;
  protected Descripcion descripcion;
  protected Precio precio;
  protected Set<Ingrediente> ingredientes;
  protected Cocinero cocinero;
  
  /** Constructores */
  public Comida(ComidaId comidaId, Nombre nombre, Descripcion descripcion, Precio precio) {
    super(comidaId);
    appendChange(new ComidaCreada(nombre, descripcion, precio)).apply(); //Crar obj Cliente
  }

  private Comida(ComidaId comidaId){
    super(comidaId);
    subscribe(new ComidaChange(this));
  }
  
  /** Metodos */
  public void actualizarPrecio(Precio precio){
    Objects.requireNonNull(precio);
    appendChange(new PrecioActualizado(precio)).apply();
  }
  
  public void modificarNombre(Nombre nombre){
    Objects.requireNonNull(nombre);
    appendChange(new NombreModificado(nombre)).apply();
  }
  
  public void modificarDescripcion(Descripcion descripcion){
    Objects.requireNonNull(descripcion);
    appendChange(new DescripcionModificada(descripcion)).apply();
  }
  
  public void asignarCocinero(CocineroId cocineroId, NombreCocinero nombre, TelefonoCocinero telefono){
    Objects.requireNonNull(cocineroId);
    Objects.requireNonNull(nombre);
    Objects.requireNonNull(telefono);
    appendChange(new CocineroAsignado(cocineroId, nombre, telefono)).apply();
  }
  
  public void agregarIngrediente(IngredienteId ingredienteId, Nombre nombre, Descripcion descripcion, Precio precio, Cantidad cantidad) {
    Objects.requireNonNull(ingredienteId);
    Objects.requireNonNull(nombre);
    Objects.requireNonNull(descripcion);
    Objects.requireNonNull(precio);
    Objects.requireNonNull(cantidad);
    appendChange(new IngredienteAgregado(ingredienteId, nombre, descripcion, precio, cantidad)).apply();
  }
  
  public void quitarIngrediente(IngredienteId ingredienteId){
    Objects.requireNonNull(ingredienteId);
    appendChange(new IngredienteQuitado(ingredienteId)).apply();
  }
  
  public void modificarCantidadIngrediente(IngredienteId ingredienteId, Cantidad cantidadIngrediente){
    Objects.requireNonNull(ingredienteId);
    Objects.requireNonNull(cantidadIngrediente);
    appendChange(new CantidadIngredienteModificado(ingredienteId, cantidadIngrediente)).apply();
  }
  
  public void modificarNombreIngrediente(IngredienteId ingredienteId, Nombre nombreIngrediente){
    Objects.requireNonNull(ingredienteId);
    Objects.requireNonNull(nombreIngrediente);
    appendChange(new NombreIngredienteModificado(ingredienteId, nombreIngrediente)).apply();
  }
  
  public void modificarDescripcionIngrediente(IngredienteId ingredienteId, Descripcion descripcionIngrediente){
    Objects.requireNonNull(ingredienteId);
    Objects.requireNonNull(descripcionIngrediente);
    appendChange(new DescripcionIngredienteModificada(ingredienteId, descripcionIngrediente)).apply();
  }
  
  public void actualizarPrecioIngrediente(IngredienteId ingredienteId, Precio precioIngrediente){
    Objects.requireNonNull(ingredienteId);
    Objects.requireNonNull(precioIngrediente);
    appendChange(new PrecioIngredienteActualizado(ingredienteId, precioIngrediente)).apply();
  }
  
  public void modificarTelefonoCocinero(CocineroId cocineroId, TelefonoCocinero telefonoCocinero){
    Objects.requireNonNull(cocineroId);
    Objects.requireNonNull(telefonoCocinero);
    appendChange(new TelefonoCocineroModificado(cocineroId, telefonoCocinero)).apply();
  }
  
  public void modificarNombreCocinero(CocineroId cocineroId, NombreCocinero nombreCocinero){
    Objects.requireNonNull(cocineroId);
    Objects.requireNonNull(nombreCocinero);
    appendChange(new NombreCocineroModificado(cocineroId, nombreCocinero)).apply();
  }
  
  /** Getters */
  public Nombre nombre() {
    return nombre;
  }
  
  public Descripcion descripcion() {
    return descripcion;
  }
  
  public Precio precio() {
    return precio;
  }
  
  public Set<Ingrediente> ingredientes() {
    return ingredientes;
  }
  
  public Optional<Ingrediente> getIngredientePorId(IngredienteId ingredienteId){
    return ingredientes().stream().filter(key -> key.identity().equals(ingredienteId)).findFirst();
  }
  
  public Cocinero getCocinero() {
    return cocinero;
  }
}
