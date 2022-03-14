package uy.com.sofka.restaurante.reserva.value;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class HoraFinal implements ValueObject<String> {
  private final LocalTime value;
  private final String valueFormateado;

  public HoraFinal() {
    this.value = LocalTime.now();
    this.valueFormateado = formatear();
  }
  
  private String formatear(){
    return this.value.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
  }

  @Override
  public String value() {
    return valueFormateado;
  }


  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof HoraFinal)) {
      return false;
    }
    HoraFinal horafinal = (HoraFinal) o;
    return Objects.equals(value, horafinal.value) && Objects.equals(valueFormateado, horafinal.valueFormateado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, valueFormateado);
  }
  

}
