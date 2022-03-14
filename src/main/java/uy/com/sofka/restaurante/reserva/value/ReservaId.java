package uy.com.sofka.restaurante.reserva.value;

import co.com.sofka.domain.generic.Identity;

public class ReservaId extends Identity {
  
  
  public ReservaId(){
    
  }

  private ReservaId(String id){
    super (id);
  }

  public static ReservaId of (String id){
    return new ReservaId(id);
  }
}
