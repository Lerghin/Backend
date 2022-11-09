
package com.portfoliolerghin.lc.interfaz;

import com.portfoliolerghin.lc.Entity.Persona;
import java.util.List;



public interface IPersonaService {
   //traer una persona
    public List <Persona> getPersona();
    //Guardar un objeto de tipo persona
    public void savePersona (Persona persona);
    
   //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona (Long id);
    //Necesitamos buscar persona id
    
    public Persona findPersona(Long id);

    public void setPersona(Persona persona);
}