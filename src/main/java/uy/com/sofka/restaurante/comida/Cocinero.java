package uy.com.sofka.restaurante.comida;

import java.util.Objects;

import co.com.sofka.domain.generic.Entity;
import uy.com.sofka.restaurante.comida.value.CocineroId;
import uy.com.sofka.restaurante.comida.value.NombreCocinero;
import uy.com.sofka.restaurante.comida.value.TelefonoCocinero;

public class Cocinero extends Entity<CocineroId> {

  private NombreCocinero nombre;
  private TelefonoCocinero telefono;

  public Cocinero(CocineroId cocineroId, NombreCocinero nombre, TelefonoCocinero telefono) {
    super(cocineroId);
    this.nombre = nombre;
    this.telefono = telefono;
  }

  // metodos (setters)
  public void modificarNombre(NombreCocinero nombre) {
    this.nombre = Objects.requireNonNull(nombre);
  }

  public void modificarTelefono(TelefonoCocinero telefono) {
    this.telefono = Objects.requireNonNull(telefono);
  }
  
  //Getters
  public NombreCocinero nombre() {
    return nombre;
  }
  
  public TelefonoCocinero telefono() {
    return telefono;
  }
}
