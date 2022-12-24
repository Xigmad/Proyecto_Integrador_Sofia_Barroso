package com.porfolio.mgb.Security.Controller;

import com.porfolio.mgb.Security.Service.RolService;
import com.porfolio.mgb.Security.Service.UsuarioService;
import com.porfolio.mgb.Security.jwt.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {

@Autowired
PasswordEncoder passwordEncoder;
@Autowired
AuthenticationManager authenticationManager;
@Autowired
UsuarioService usuarioService;
@Autowired
RolService rolService;
@Autowired
JwtProvider jwtProvider;







}
