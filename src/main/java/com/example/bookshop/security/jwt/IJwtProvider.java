package com.example.bookshop.security.jwt;

import org.springframework.security.core.Authentication;

import com.example.bookshop.security.UserPrincipal;

import javax.servlet.http.HttpServletRequest;

public interface IJwtProvider
{
    String generateToken(UserPrincipal auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean validateToken(HttpServletRequest request);
}
