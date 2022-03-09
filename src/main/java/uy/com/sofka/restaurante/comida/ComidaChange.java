package uy.com.sofka.restaurante.comida;

import java.util.HashSet;

import co.com.sofka.domain.generic.EventChange;
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

public class ComidaChange extends EventChange{
  public ComidaChange(Comida comida){

    apply((ComidaCreada event) -> {
      comida.nombre = event.getNombre();
      comida.descripcion = event.getDescripcion();
      comida.precio = event.getPrecio();
      comida.ingredientes = new HashSet<>();
    });

    apply((PrecioActualizado event) -> {
      comida.precio = event.getPrecio();
    });    
    
    apply((NombreModificado event) -> {
      comida.nombre = event.getNombre();
    });

    apply((DescripcionModificada event) -> {
      comida.descripcion = event.getDescripcion();
    });

    apply((CocineroAsignado event) -> {
      comida.cocinero = new Cocinero(
        event.getCocineroId(),
        event.getNombre(),
        event.getTelefono()
      );
    });

    apply((IngredienteAgregado event) -> {
      comida.ingredientes.add(new Ingrediente(
          event.getIngredienteId(),
          event.getNombre(),
          event.getDescripcion(),
          event.getPrecio(),
          event.getCantidad()
      ));
    });

    apply((IngredienteQuitado event) -> {
      comida.ingredientes.removeIf(ingrediente -> ingrediente.identity().equals(event.getIngredienteId()));
    });

    apply((CantidadIngredienteModificado event) -> {
      var ingrediente = comida.getIngredientePorId(event.getIngredienteId())
              .orElseThrow(() -> new IllegalArgumentException("No se encuentra el ingrediente de la comida"));
      ingrediente.modificarCantidad(event.getCantidad());
    });

    apply((NombreIngredienteModificado event) -> {
      var ingrediente = comida.getIngredientePorId(event.getIngredienteId())
              .orElseThrow(() -> new IllegalArgumentException("No se encuentra el ingrediente de la comida"));
      ingrediente.modificarNombre(event.getNombre());
    });

    apply((DescripcionIngredienteModificada event) -> {
      var ingrediente = comida.getIngredientePorId(event.getIngredienteId())
              .orElseThrow(() -> new IllegalArgumentException("No se encuentra el ingrediente de la comida"));
      ingrediente.modificarDescripcion(event.getDescripcion());
    });
    
    apply((PrecioIngredienteActualizado event) -> {
      var ingrediente = comida.getIngredientePorId(event.getIngredienteId())
              .orElseThrow(() -> new IllegalArgumentException("No se encuentra el ingrediente de la comida"));
      ingrediente.actualizarPrecio(event.getPrecio());
    });

    apply((NombreCocineroModificado event) -> {
      comida.cocinero.modificarNombre(event.getNombre());
    });

    apply((TelefonoCocineroModificado event) -> {
      comida.cocinero.modificarTelefono(event.getTelefono());
    });
  }
}
