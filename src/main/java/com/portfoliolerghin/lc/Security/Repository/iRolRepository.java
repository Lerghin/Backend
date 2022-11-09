
package com.portfoliolerghin.lc.Security.Repository;



import com.portfoliolerghin.lc.Security.Entity.Rol;
import com.portfoliolerghin.lc.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
