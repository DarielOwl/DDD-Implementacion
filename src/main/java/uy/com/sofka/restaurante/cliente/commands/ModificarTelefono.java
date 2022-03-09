package uy.com.sofka.restaurante.cliente.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.cliente.value.ClienteId;
import uy.com.sofka.restaurante.cliente.value.Telefono;

public class ModificarTelefono extends Command {
  
  private final ClienteId clienteId;
  private final Telefono telefono;

  public ModificarTelefono(ClienteId clienteId, Telefono telefono) {
    this.clienteId = clienteId;
    this.telefono = telefono;
  }

  public ClienteId getClienteId() {
    return this.clienteId;
  }

  public Telefono getTelefono() {
    return this.telefono;
  }
}
