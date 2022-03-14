package uy.com.sofka.restaurante.comida.value;

import co.com.sofka.domain.generic.Identity;

public class IngredienteId extends Identity {
  
  public IngredienteId(){
    
  }

  private IngredienteId(String id){
    super (id);
  }

  public static IngredienteId of (String id){
    return new IngredienteId(id);
  }
}
