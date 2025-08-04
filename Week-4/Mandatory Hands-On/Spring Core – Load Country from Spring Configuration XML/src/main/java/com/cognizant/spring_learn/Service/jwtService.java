package com.cognizant.spring_learn.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Date;

@Service
public class jwtService {

    private String key = "";

    public jwtService() throws NoSuchAlgorithmException {
        KeyGenerator generate = KeyGenerator.getInstance("HmacSHA256");
        SecretKey secret = generate.generateKey();
        key = Base64.getEncoder().encodeToString(secret.getEncoded());
    }

    public Key getKey() {
        byte[] keyBytes = Decoders.BASE64.decode(key);
        return Keys.hmacShaKeyFor(keyBytes);
    }

    public String generateToken(String userName){
        return Jwts.builder()
                .subject(userName)
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis() + 60*60*60*24))
                .signWith(getKey())
                .compact();
    }
}