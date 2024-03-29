package uy.com.sofka.restaurante.cliente.commands;

import co.com.sofka.domain.generic.Command;
import uy.com.sofka.restaurante.cliente.value.Nombre;
import uy.com.sofka.restaurante.cliente.value.ClienteId;

public class ModificarNombre extends Command {
  private final ClienteId clienteId;
  private final Nombre nombre;

  public ModificarNombre(ClienteId clienteId, Nombre nombre) {
    this.clienteId = clienteId;
    this.nombre = nombre;
  }

  public ClienteId getClienteId() {
    return this.clienteId;
  }

  public Nombre getNombre() {
    return this.nombre;
  }
}
