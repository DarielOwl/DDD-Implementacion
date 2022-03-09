package uy.com.sofka.restaurante.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import uy.com.sofka.restaurante.cliente.events.ClienteCreado;
import uy.com.sofka.restaurante.cliente.value.*;

public class Cliente extends AggregateEvent<ClienteId> {
  protected Nombre nombre;
  protected Telefono telefono;

  public Cliente(ClienteId entityId, Nombre nombre, Telefono telefono) {
    super(entityId);
    appendChange(new ClienteCreado(nombre, telefono)).apply(); //Crar obj Cliente
  }
  
}