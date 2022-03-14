package uy.com.sofka.restaurante.reserva;

import java.util.List;
import java.util.Objects;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import uy.com.sofka.restaurante.cliente.Cliente;
import uy.com.sofka.restaurante.comida.value.ComidaId;
import uy.com.sofka.restaurante.reserva.Reserva;
import uy.com.sofka.restaurante.reserva.events.CantidadSillasMesaModificada;
import uy.com.sofka.restaurante.reserva.events.ComidaAgregada;
import uy.com.sofka.restaurante.reserva.events.ComidaQuitada;
import uy.com.sofka.restaurante.reserva.events.EstadoActualizado;
import uy.com.sofka.restaurante.reserva.events.EstadoMesaActualizado;
import uy.com.sofka.restaurante.reserva.events.MesaAsignada;
import uy.com.sofka.restaurante.reserva.events.MetodoPagoModificado;
import uy.com.sofka.restaurante.reserva.events.PrecioActualizado;
import uy.com.sofka.restaurante.reserva.events.ReservaCreada;
import uy.com.sofka.restaurante.reserva.value.ReservaId;
import uy.com.sofka.restaurante.reserva.value.*;

public class Reserva extends AggregateEvent<ReservaId> {
  protected Mesa mesa;
  protected Horario horario;
  protected Precio precio;
  protected Estado estado;
  protected MetodoPago metodoPago;
  protected List<ComidaId> comidasId;
  protected Cliente clienteId;

  /** Constructores */
  public Reserva(ReservaId reservaId, Estado estado, MetodoPago metodoPago, Precio precio) {
    super(reservaId);
    appendChange(new ReservaCreada(precio, estado, metodoPago)).apply(); //Crar obj Cliente
  }

  private Reserva(ReservaId reservaId){
    super(reservaId);
    subscribe(new ReservaChange(this));
  }

  public static Reserva from(ReservaId reservaId, List<DomainEvent> events){
    var reserva = new Reserva(reservaId);
    events.forEach(reserva::applyEvent); //recrea todos los agregados apartir de eventos guardados
    return reserva;
  }

  /** Metodos */
  public void asignarMesa(MesaId mesaId, EstadoMesa estado, CantidadSillas cantidadSillas, NumeroMesa numeroMesa){
    Objects.requireNonNull(mesaId);
    Objects.requireNonNull(estado);
    Objects.requireNonNull(cantidadSillas);
    Objects.requireNonNull(numeroMesa);
    appendChange(new MesaAsignada(mesaId, estado, cantidadSillas, numeroMesa)).apply();
  }

  public void modificarCantidadSillasMesa(MesaId mesaId, CantidadSillas cantidadSillas){
    Objects.requireNonNull(mesaId);
    Objects.requireNonNull(cantidadSillas);
    appendChange(new CantidadSillasMesaModificada(mesaId, cantidadSillas)).apply();
  }
  
  public void actualizarEstadoMesa(MesaId mesaId, EstadoMesa estadoMesa){
    Objects.requireNonNull(mesaId);
    Objects.requireNonNull(estadoMesa);
    appendChange(new EstadoMesaActualizado(mesaId, estadoMesa)).apply();
  }

  public void actualizarPrecio(Precio precio){
    Objects.requireNonNull(precio);
    appendChange(new PrecioActualizado(precio)).apply();
  }
  
  public void actualizarEstado(Estado estado){
    Objects.requireNonNull(estado);
    appendChange(new EstadoActualizado(estado)).apply();
  }
  
  public void modificarMetodoPago(MetodoPago metodoPago){
    Objects.requireNonNull(metodoPago);
    appendChange(new MetodoPagoModificado(metodoPago)).apply();
  }
  
  public void agregarComida(ComidaId comidaId) {
    Objects.requireNonNull(comidaId);
    appendChange(new ComidaAgregada(comidaId)).apply();
  }
  
  public void quitarComida(ComidaId comidaId){
    Objects.requireNonNull(comidaId);
    appendChange(new ComidaQuitada(comidaId)).apply();
  }
  
  
  /** Getters */

  
  public Mesa mesa() {
    return mesa;
  }

  public Horario horario() {
    return horario;
  }

  public Precio precio() {
    return precio;
  }

  public Estado estado() {
    return estado;
  }
  
  public MetodoPago metodoPago() {
    return metodoPago;
  }
  
  public List<ComidaId> comidasId() {
    return comidasId;
  }
  
  public Cliente clienteId() {
    return clienteId;
  }

}
