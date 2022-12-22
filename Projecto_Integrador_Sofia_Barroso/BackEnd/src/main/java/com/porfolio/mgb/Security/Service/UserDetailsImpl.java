package com.porfolio.mgb.Security.Service;

import com.porfolio.mgb.Security.Entity.Usuario;
import com.porfolio.mgb.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImpl implements UserDetailsService {
    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nompreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.getByNombreUsuraio(nompreUsuario).get();
        return UsuarioPrincipal.build(usuario) ;
    }
    
}
