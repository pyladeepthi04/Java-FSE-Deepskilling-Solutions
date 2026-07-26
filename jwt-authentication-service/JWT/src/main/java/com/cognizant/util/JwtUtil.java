package com.cognizant.jwtauthenticationservice.util;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    public String generateToken(String username) {
        // Dummy JWT token
        return "JWT_TOKEN_FOR_" + username;
    }
}