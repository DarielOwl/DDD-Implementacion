package uy.com.sofka.restaurante.cliente.value;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Telefono implements ValueObject<String> {
  private final String value;

  public Telefono(String value) {
    this.value = Objects.requireNonNull(value).replaceAll("\\s","");

    if(this.value.isBlank())
      throw new IllegalArgumentException("El telefono no puede estar vacio");

    if(this.value.length() < 8)
      throw new IllegalArgumentException("El telefono debe tener minimo 8 caracteres");
      
    try {
      Integer.parseInt(this.value);
    } catch(NumberFormatException e) {
      throw new IllegalArgumentException("El telefono debe contener numeros");
    }
  }

  @Override
  public String value() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Telefono)) {
      return false;
    }
    Telefono telefonoCliente = (Telefono) o;
    return Objects.equals(value, telefonoCliente.value);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }

}
