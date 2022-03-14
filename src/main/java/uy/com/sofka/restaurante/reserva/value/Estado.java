package uy.com.sofka.restaurante.reserva.value;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Estado implements ValueObject<String> {
  private final Estado.Type value;

  public Estado() {
    this(Type.PENDIENTE);
  }
  public Estado(Estado.Type value) {
    this.value = Objects.requireNonNull(value, "El estado de la reserva no puede estar vacio");
  }
  
  @Override
  public String value() {
    return value.name();
  }

  public enum Type {
    PENDIENTE, EJECUTANDOSE, TERMINADA
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Estado)) {
      return false;
    }
    Estado estado = (Estado) o;
    return Objects.equals(value, estado.value);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }
  
}
