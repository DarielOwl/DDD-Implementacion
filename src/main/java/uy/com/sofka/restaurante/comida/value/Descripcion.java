package uy.com.sofka.restaurante.comida.value;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Descripcion implements ValueObject<String> {
  
  private final String value;

  public Descripcion(String value) {
    this.value = Objects.requireNonNull(value).trim();

    if(this.value.isBlank())
      throw new IllegalArgumentException("La descripcion no puede estar vacia");

    if(this.value.length() <= 10)
      throw new IllegalArgumentException("La descripcion debe tener minimo 10 caracteres");
      
    if(this.value.length() >= 40)
      throw new IllegalArgumentException("La descripcion debe tener maximo 40 caracteres");
  }

  @Override
  public String value() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Descripcion)) {
      return false;
    }
    Descripcion descripcion = (Descripcion) o;
    return Objects.equals(value, descripcion.value);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }
}
