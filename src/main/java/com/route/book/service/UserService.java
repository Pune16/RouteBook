package com.route.book.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.route.book.entity.User;
import com.route.book.repository.UserRepository;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
	@Autowired
    private  UserRepository userRepository;

		public User createUser(User user) {
        // Implement logic to create a new user
  
    		
        return  userRepository.save(user);
    }

    public User getUserById(int userId) {
        // Implement logic to retrieve user by ID
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.orElse(null);
    }

    public List<User> getAllUsers() {
        // Implement logic to retrieve all users
        return userRepository.findAll();
    }
    
    

    public void deleteUser(int userId) {
        // Implement logic to delete user by ID
        userRepository.deleteById(userId);
        
    }

}
