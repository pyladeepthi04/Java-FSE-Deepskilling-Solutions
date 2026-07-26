package com.cognizant.jwtauthenticationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.jwtauthenticationservice.model.AuthenticationRequest;
import com.cognizant.jwtauthenticationservice.model.AuthenticationResponse;
import com.cognizant.jwtauthenticationservice.util.JwtUtil;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/authenticate")
    public AuthenticationResponse authenticate(@RequestBody AuthenticationRequest request) {

        String token = jwtUtil.generateToken(request.getUsername());

        return new AuthenticationResponse(token);
    }
}