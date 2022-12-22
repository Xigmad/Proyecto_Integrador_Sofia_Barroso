package com.porfolio.mgb.Security.Service;

import com.porfolio.mgb.Security.Entity.Rol;
import com.porfolio.mgb.Security.Enums.RolNombre;
import com.porfolio.mgb.Security.Repository.iRolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    public Optional<Rol> getByNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
public void save(Rol rol){
    irolRepository.save(rol);
}
}
