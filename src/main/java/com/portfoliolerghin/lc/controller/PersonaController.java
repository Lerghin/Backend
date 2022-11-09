
package com.portfoliolerghin.lc.controller;


import com.portfoliolerghin.lc.Entity.Persona;
import com.portfoliolerghin.lc.interfaz.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")

@CrossOrigin(origins= "http://localhost:4200")
public class PersonaController {
    @Autowired 
    private IPersonaService ipersonaService;

    @GetMapping
    public List <Persona> getPersona(){
        return ipersonaService.getPersona();
    }

    @PostMapping
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona (persona); 
    return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/{id}")
    public String deletePersona (@PathVariable Long id){
        ipersonaService.deletePersona(id);
        return "La Persona fue eliminada correctamente";
    }
    
    @PutMapping ("/{id}")
    public Persona editPersona (@PathVariable(name = "id") Long id ,@RequestBody Persona personaModif){
        Persona persona= ipersonaService.findPersona (id);
        persona.setNombre (personaModif.getNombre());
        persona.setApellido (personaModif.getApellido());
        persona.setImg(personaModif.getImg());
        ipersonaService.savePersona(persona); 
        return persona;
    }
    
    @GetMapping ("/traer/perfil")
    public Persona findpersona(){
        return ipersonaService.findPersona((long)1);
    }
    
}
