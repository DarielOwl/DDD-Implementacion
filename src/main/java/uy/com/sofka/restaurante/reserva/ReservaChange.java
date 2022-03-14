package uy.com.sofka.restaurante.reserva;

import java.util.ArrayList;

import co.com.sofka.domain.generic.EventChange;
import uy.com.sofka.restaurante.comida.value.ComidaId;
import uy.com.sofka.restaurante.reserva.events.CantidadSillasMesaModificada;
import uy.com.sofka.restaurante.reserva.events.ComidaAgregada;
import uy.com.sofka.restaurante.reserva.events.ComidaQuitada;
import uy.com.sofka.restaurante.reserva.events.EstadoActualizado;
import uy.com.sofka.restaurante.reserva.events.EstadoMesaActualizado;
import uy.com.sofka.restaurante.reserva.events.FechaHorarioActualizada;
import uy.com.sofka.restaurante.reserva.events.HoraFinalHorarioActualizada;
import uy.com.sofka.restaurante.reserva.events.HoraInicialHorarioActualizada;
import uy.com.sofka.restaurante.reserva.events.HorarioAsignado;
import uy.com.sofka.restaurante.reserva.events.MesaAsignada;
import uy.com.sofka.restaurante.reserva.events.PrecioActualizado;
import uy.com.sofka.restaurante.reserva.events.ReservaCreada;

public class ReservaChange extends EventChange {
  public ReservaChange(Reserva reserva){

    apply((ReservaCreada event) -> {
      reserva.precio = event.getPrecio();
      reserva.estado = event.getEstado();
      reserva.metodoPago = event.getMetodoPago();
      reserva.comidasId = new ArrayList<ComidaId>();
    });
    
    apply((MesaAsignada event) -> {
      reserva.mesa = new Mesa(
        event.getMesaId(),
        event.getCantidadSillas(),
        event.getEstado(),
        event.getNumero()
      );
    });

    apply((EstadoMesaActualizado event) -> {
      if(!reserva.mesa().identity().equals(event.getMesaId()))
        throw new IllegalArgumentException("La mesa no coincide con la de la reserva");
      reserva.mesa.actualizarEstado(event.getEstado());
    });

    apply((CantidadSillasMesaModificada event) -> {
      if(!reserva.mesa().identity().equals(event.getMesaId()))
        throw new IllegalArgumentException("La mesa no coincide con la de la reserva");
      reserva.mesa.modificarCantidadSillas(event.getCantidadSillas());
    });

    apply((HorarioAsignado event) -> {
      reserva.horario = new Horario(
        event.getHorarioId(),
        event.getFecha(),
        event.getHoraInicial(),
        event.getHoraFinal()
      );
    });
   
    
    apply((FechaHorarioActualizada event) -> {
      if(!reserva.horario().identity().equals(event.getHorarioId()))
        throw new IllegalArgumentException("El horario no coincide con el de la reserva");
      reserva.horario.actualizarFecha(event.getFecha());
    });

    apply((HoraInicialHorarioActualizada event) -> {
      if(!reserva.horario().identity().equals(event.getHorarioId()))
        throw new IllegalArgumentException("El horario no coincide con el de la reserva");
      reserva.horario.actualizarHoraInicial(event.getHoraInicial());
    });

    apply((HoraFinalHorarioActualizada event) -> {
      if(!reserva.horario().identity().equals(event.getHorarioId()))
        throw new IllegalArgumentException("El horario no coincide con el de la reserva");
      reserva.horario.actualizarHoraFinal(event.getHoraFinal());
    });

    apply((PrecioActualizado event) -> {
      reserva.precio = event.getPrecio();
    });    

    apply((EstadoActualizado event) -> {
      reserva.estado = event.getEstado();
    });    


    apply((ComidaAgregada event) -> {
      reserva.comidasId.add(event.getComidaId());
    });

    apply((ComidaQuitada event) -> {
      if(!reserva.comidasId.contains(event.getComidaId()))
        throw new IllegalArgumentException("No se encuentra la comida de la reserva");
      reserva.comidasId.removeIf(comida -> comida.equals(event.getComidaId()));
    });

  }
}
