package uy.com.sofka.restaurante.comida.value;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Nombre implements ValueObject<String> {
  
  private final String value;

  public Nombre(String value) {
    this.value = Objects.requireNonNull(value).trim();

    if(this.value.isBlank())
      throw new IllegalArgumentException("El nombre no puede estar vacio");

    if(this.value.length() < 3)
      throw new IllegalArgumentException("El nombre debe tener minimo 3 caracteres");
      
    if(this.value.length() > 50)
      throw new IllegalArgumentException("El nombre debe tener maximo 50 caracteres");
  }

  @Override
  public String value() {
    return value;
  }
  
  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Nombre)) {
      return false; 
    }
    Nombre nombre = (Nombre) o;
    return Objects.equals(value, nombre.value);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }
}
