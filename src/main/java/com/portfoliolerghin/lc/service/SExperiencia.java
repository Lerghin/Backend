
package com.portfoliolerghin.lc.service;

import com.portfoliolerghin.lc.entity.Experiencia;
import com.portfoliolerghin.lc.repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    @Autowired
    RExperiencia rExperiencia;
    public List<Experiencia> List(){
    return rExperiencia.findAll();
}
    public Optional<Experiencia> getOne(int id){
        return rExperiencia.findById(id);
    }
    
    public Optional<Experiencia> getByNombreE (String NombreE){
        return rExperiencia.findByNombreE(NombreE);
    }
    public void save(Experiencia expe){
        rExperiencia.save(expe);
    }
    public void delete (int id){
        rExperiencia.deleteById(id);
    }
    public boolean existsById (int id){
        return rExperiencia.existsById(id);
    }
    public boolean existsByNombreE (String nombreE){
        return rExperiencia.existsByNombreE(nombreE);
    }

    public List<Experiencia> list() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return rExperiencia.findAll();
    }

       
}