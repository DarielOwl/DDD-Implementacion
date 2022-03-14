package uy.com.sofka.restaurante.comida.value;

import co.com.sofka.domain.generic.Identity;

public class CocineroId extends Identity {
  
  public CocineroId(){
    
  }

  private CocineroId(String id){
    super (id);
  }

  public static CocineroId of (String id){
    return new CocineroId(id);
  }
}
