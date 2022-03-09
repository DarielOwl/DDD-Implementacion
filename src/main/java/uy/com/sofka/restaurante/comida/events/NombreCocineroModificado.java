package uy.com.sofka.restaurante.comida.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.comida.value.CocineroId;
import uy.com.sofka.restaurante.comida.value.NombreCocinero;

public class NombreCocineroModificado extends DomainEvent{
  private final CocineroId cocineroId;
  private final NombreCocinero nombre;

  public NombreCocineroModificado(CocineroId cocineroId, NombreCocinero nombre) {
    super("sofka.comida.modificarnombrecocinero");
    this.cocineroId = cocineroId;
    this.nombre = nombre;
  }

  public CocineroId getCocinero() {
    return cocineroId;
  }

  public NombreCocinero getNombre() {
    return nombre;
  }
  
}
