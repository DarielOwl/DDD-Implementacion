package uy.com.sofka.restaurante.cliente;

import co.com.sofka.domain.generic.EventChange;
import uy.com.sofka.restaurante.cliente.events.ClienteCreado;
import uy.com.sofka.restaurante.cliente.events.NombreModificado;
import uy.com.sofka.restaurante.cliente.events.TelefonoModificado;

public class ClienteChange extends EventChange {
  
  public ClienteChange(Cliente cliente){

    apply((ClienteCreado event) -> {
      cliente.nombre = event.getNombre();
      cliente.telefono = event.getTelefono();
    });
    
    apply((NombreModificado event) -> {
      cliente.nombre = event.getNombre();
    });

    apply((TelefonoModificado event) -> {
      cliente.telefono = event.getTelefono();
    });
  }
}
