package uy.com.sofka.restaurante.comida.value;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Cantidad implements ValueObject<Integer> {
  private final Integer value;

  public Cantidad(Integer value) {
    this.value = Objects.requireNonNull(value);

    if(this.value < 0)
      throw new IllegalArgumentException("La cantidad no puede ser negativa.");
  }

  @Override
  public Integer value() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Cantidad)) {
      return false;
    }
    Cantidad cantidad = (Cantidad) o;
    return Objects.equals(value, cantidad.value);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }
  
  
}
