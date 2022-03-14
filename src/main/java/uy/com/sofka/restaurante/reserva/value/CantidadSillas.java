package uy.com.sofka.restaurante.reserva.value;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class CantidadSillas implements ValueObject<Integer> {
  private final Integer value;

  public CantidadSillas(Integer value) {
    this.value = Objects.requireNonNull(value);

    if(this.value < 0)
      throw new IllegalArgumentException("La cantidad de sillas no puede ser negativa.");
  }

  @Override
  public Integer value() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof CantidadSillas)) {
      return false;
    }
    CantidadSillas cantidad = (CantidadSillas) o;
    return Objects.equals(value, cantidad.value);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }
  
  
}
