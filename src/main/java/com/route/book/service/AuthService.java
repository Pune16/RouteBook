package com.route.book.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.route.book.entity.User;
import com.route.book.repository.UserRepository;

import java.security.SecureRandom;
import java.util.Base64;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    private static final SecureRandom secureRandom = new SecureRandom();
    private static final Base64.Encoder base64enocder = Base64.getUrlEncoder();


    public User register(User user) {
        // Check if user with username exist or not
        if(checkUserExist(user)== true)
            return null;

        user.setToken(generateToken());

        return userRepository.save(user);

    }

    private String generateToken() {

        byte[] token = new byte[24];
        secureRandom.nextBytes(token);
        return base64enocder.encodeToString(token);

    }

    private boolean checkUserExist(User user) {
        User existingUser = userRepository.findByEmail(user.getEmail());

        if(existingUser == null)
            return false;
        return true;
    }

    public User login(User user) {
        User existingUser = userRepository.findByEmail(user.getEmail());

        if (existingUser != null &&
                existingUser.getEmail() != null &&
                existingUser.getPassword() != null &&
                existingUser.getRole() != null &&
                existingUser.getRole().equals(user.getRole())) {
                existingUser.setPassword("");
                return existingUser;
            }

        return null;

    }
}
