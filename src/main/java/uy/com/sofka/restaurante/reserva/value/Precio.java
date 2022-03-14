package uy.com.sofka.restaurante.reserva.value;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Precio implements ValueObject<Double> {

  private final Double value;

  public Precio(Double value) {
    this.value = Objects.requireNonNull(value);

    if(this.value < 0)
      throw new IllegalArgumentException("El precio no puede ser negativo.");
  }

  @Override
  public Double value() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Precio)) {
      return false;
    }
    Precio precio = (Precio) o;
    return Objects.equals(value, precio.value);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }

}
