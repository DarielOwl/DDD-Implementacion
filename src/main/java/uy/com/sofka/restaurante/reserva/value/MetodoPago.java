package uy.com.sofka.restaurante.reserva.value;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class MetodoPago implements ValueObject<String> {
  
  private final String value;

  public MetodoPago(String value) {
    this.value = Objects.requireNonNull(value).trim();

    if(this.value.isBlank())
      throw new IllegalArgumentException("El metodo de pago no puede estar vacio");

    if(this.value.length() < 4)
      throw new IllegalArgumentException("El metodo de pago debe tener minimo 4 caracteres");
      
    if(this.value.length() > 30)
      throw new IllegalArgumentException("El metodo de pago debe tener maximo 30 caracteres");
  }

  @Override
  public String value() {
    return value;
  }
  
  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof MetodoPago)) {
      return false; 
    }
    MetodoPago nombre = (MetodoPago) o;
    return Objects.equals(value, nombre.value);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }
}
