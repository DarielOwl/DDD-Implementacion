package uy.com.sofka.restaurante.reserva.value;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class EstadoMesa implements ValueObject<String> {
  private final EstadoMesa.Type value;

  public EstadoMesa() {
    this(Type.OCUPADA);
  }
  public EstadoMesa(EstadoMesa.Type value) {
    this.value = Objects.requireNonNull(value, "El estado de la mesa no puede estar vacio");
  }
  
  @Override
  public String value() {
    return value.name();
  }

  public enum Type {
    OCUPADA, LIBRE
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof EstadoMesa)) {
      return false;
    }
    EstadoMesa estadoMesa = (EstadoMesa) o;
    return Objects.equals(value, estadoMesa.value);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }
  
}
