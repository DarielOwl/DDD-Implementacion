package uy.com.sofka.restaurante.comida.events;

import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.comida.value.ComidaId;
import uy.com.sofka.restaurante.comida.value.Descripcion;
import uy.com.sofka.restaurante.comida.value.Nombre;
import uy.com.sofka.restaurante.comida.value.Precio;
import uy.com.sofka.restaurante.comida.value.CantidadIngrediente;
import uy.com.sofka.restaurante.comida.value.IngredienteId;

public class IngredienteAgregado extends DomainEvent{

  public IngredienteAgregado() {
    super("sofka.comida.agregaringrediente");
    //TODO Auto-generated constructor stub
  }

}
