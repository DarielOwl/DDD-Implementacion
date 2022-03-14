package uy.com.sofka.restaurante.reserva;

import java.util.Objects;

import co.com.sofka.domain.generic.Entity;
import uy.com.sofka.restaurante.reserva.value.Fecha;
import uy.com.sofka.restaurante.reserva.value.HoraFinal;
import uy.com.sofka.restaurante.reserva.value.HoraInicial;
import uy.com.sofka.restaurante.reserva.value.HorarioId;

public class Horario extends Entity<HorarioId> {

  private Fecha fecha;
  private HoraInicial horaInicial;
  private HoraFinal horaFinal;

  public Horario(HorarioId mesaId, Fecha fecha, HoraInicial horaInicial, HoraFinal horaFinal) {
    super(mesaId);
    this.fecha = fecha;
    this.horaInicial = horaInicial;
    this.horaFinal = horaFinal;
  }

  // metodos (setters)
  public void actualizarFecha(Fecha fecha) {
    this.fecha = Objects.requireNonNull(fecha);
  }

  public void actualizarHoraInicial(HoraInicial horaInicial) {
    this.horaInicial = Objects.requireNonNull(horaInicial);
  }

  public void actualizarHoraFinal(HoraFinal horaFinal) {
    this.horaFinal = Objects.requireNonNull(horaFinal);
  }

  //Getters
  public Fecha fecha() {
    return fecha;
  }
  
  public HoraInicial horaInicial() {
    return horaInicial;
  }
  
  public HoraFinal horaFinal() {
    return horaFinal;
  }
}