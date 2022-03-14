package uy.com.sofka.restaurante.comida;

import java.util.HashSet;

import co.com.sofka.domain.generic.EventChange;
import uy.com.sofka.restaurante.comida.events.*;

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

    apply((NombreCocineroModificado event) -> {
      if(!comida.cocinero().identity().equals(event.getCocineroId()))
        throw new IllegalArgumentException("EL cocinero no coincide con el de la comida");
      comida.cocinero.modificarNombre(event.getNombre());
    });

    apply((TelefonoCocineroModificado event) -> {
      if(!comida.cocinero().identity().equals(event.getCocineroId()))
        throw new IllegalArgumentException("EL cocinero no coincide con el de la comida");
      comida.cocinero.modificarTelefono(event.getTelefono());
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
      comida.getIngredientePorId(event.getIngredienteId())
          .orElseThrow(() -> new IllegalArgumentException("No se encuentra el ingrediente de la comida"));
      comida.ingredientes.removeIf(ingrediente -> ingrediente.identity().equals(event.getIngredienteId()));
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

    apply((CantidadIngredienteModificado event) -> {
      var ingrediente = comida.getIngredientePorId(event.getIngredienteId())
              .orElseThrow(() -> new IllegalArgumentException("No se encuentra el ingrediente de la comida"));
      ingrediente.modificarCantidad(event.getCantidad());
    });
    
    apply((PrecioIngredienteActualizado event) -> {
      var ingrediente = comida.getIngredientePorId(event.getIngredienteId())
              .orElseThrow(() -> new IllegalArgumentException("No se encuentra el ingrediente de la comida"));
      ingrediente.actualizarPrecio(event.getPrecio());
    });
  }
}
