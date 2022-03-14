package uy.com.sofka.restaurante.cliente;

import java.util.List;
import java.util.Objects;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.cliente.events.ClienteCreado;
import uy.com.sofka.restaurante.cliente.events.NombreModificado;
import uy.com.sofka.restaurante.cliente.events.TelefonoModificado;
import uy.com.sofka.restaurante.cliente.value.*;

public class Cliente extends AggregateEvent<ClienteId> {
  protected Nombre nombre;
  protected Telefono telefono;

  /** Constructores */
  public Cliente(ClienteId entityId, Nombre nombre, Telefono telefono) {
    super(entityId);
    appendChange(new ClienteCreado(nombre, telefono)).apply(); //Crar obj Cliente
  }
  
  private Cliente(ClienteId clienteId){
    super(clienteId);
    subscribe(new ClienteChange(this));
  }

  public static Cliente from(ClienteId clienteId, List<DomainEvent> events){
    var cliente = new Cliente(clienteId);
    events.forEach(cliente::applyEvent); //recrea todos los agregados apartir de eventos guardados
    return cliente;
  }
  
  /** Metodos */  
  public void modificarNombre(Nombre nombre){
    Objects.requireNonNull(nombre);
    appendChange(new NombreModificado(nombre)).apply();
  }
  
  public void modificarTelefono(Telefono telefono){
    Objects.requireNonNull(telefono);
    appendChange(new TelefonoModificado(telefono)).apply();
  }

  
  /** Getters */
  public Nombre nombre() {
    return nombre;
  }
  
  public Telefono telefono() {
    return telefono;
  }
}