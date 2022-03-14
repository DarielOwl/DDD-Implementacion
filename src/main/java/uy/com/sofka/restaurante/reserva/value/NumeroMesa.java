package uy.com.sofka.restaurante.reserva.value;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class NumeroMesa implements ValueObject<Integer> {
  private final Integer value;

  public NumeroMesa(Integer value) {
    this.value = Objects.requireNonNull(value);

    if(this.value < 0)
      throw new IllegalArgumentException("El numero de mesa no puede ser negativo.");
  }

  @Override
  public Integer value() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof NumeroMesa)) {
      return false;
    }
    NumeroMesa numeromesa = (NumeroMesa) o;
    return Objects.equals(value, numeromesa.value);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }
  
  
}
