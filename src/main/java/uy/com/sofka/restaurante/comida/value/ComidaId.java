package uy.com.sofka.restaurante.comida.value;

import co.com.sofka.domain.generic.Identity;

public class ComidaId extends Identity {
  
  public ComidaId(){
    
  }

  private ComidaId(String id){
    super (id);
  }

  public static ComidaId of (String id){
    return new ComidaId(id);
  }
}
