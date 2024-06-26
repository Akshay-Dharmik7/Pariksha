package com.exam.controller;

import com.exam.config.javaUtils;
import com.exam.model.JwtRequest;
import com.exam.model.JwtResponse;
import com.exam.service.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@CrossOrigin("*")
public class AuthenticateController {


  @Autowired
  private AuthenticationManager authenticationManager;


  @Autowired
  private javaUtils jwtutils;

  @Autowired
  private UserDetailsServiceImpl userDetailServiceImpl;


  @PostMapping("/generate-token")
  public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception {

    try
    {

      authenticate(jwtRequest.getUsername(),jwtRequest.getPassword());


    }
    catch (UsernameNotFoundException e)
    {
      e.printStackTrace();
      throw new Exception("User Not found");
    }

    UserDetails userDetails=this.userDetailServiceImpl.loadUserByUsername(jwtRequest.getUsername());
    String token=this.jwtutils.generateToken(userDetails);
    return ResponseEntity.ok(new JwtResponse(token));

  }

  private  void  authenticate(String username,String password) throws Exception {

    try {
      authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username,password));


    }
    catch (DisabledException e)
    {
      throw  new Exception("User disabled");
    }
    catch (BadCredentialsException e)
    {
      throw  new Exception("Invalid Credentials"+e.getMessage());
    }
  }

  @GetMapping("/current-user")
  public UserDetails getCurrentUser(Principal principal)
  {
    return this.userDetailServiceImpl.loadUserByUsername(principal.getName());
  }

}

