package uy.com.sofka.restaurante.comida.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.comida.value.CocineroId;
import uy.com.sofka.restaurante.comida.value.NombreCocinero;
import uy.com.sofka.restaurante.comida.value.TelefonoCocinero;

public class CocineroAsignado extends DomainEvent {
  private final CocineroId cocineroId;
  private final NombreCocinero nombre;
  private final TelefonoCocinero telefono;

  public CocineroAsignado(CocineroId cocineroId, NombreCocinero nombre, TelefonoCocinero telefono) {
    super("sofka.comida.asignarcocinero");
    this.cocineroId = cocineroId;
    this.nombre = nombre;
    this.telefono = telefono;
  }
  
  public CocineroId getCocineroId() {
    return cocineroId;
  }

  public NombreCocinero getNombre() {
    return nombre;
  }

  public TelefonoCocinero getTelefono() {
    return telefono;
  }
}
