package uy.com.sofka.restaurante.reserva.value;

import co.com.sofka.domain.generic.Identity;

public class MesaId extends Identity {
  
  
  public MesaId(){
    
  }

  private MesaId(String id){
    super (id);
  }

  public static MesaId of (String id){
    return new MesaId(id);
  }
}
