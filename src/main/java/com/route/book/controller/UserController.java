package com.route.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.route.book.entity.User;
import com.route.book.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin (origins = "http://locahost:4200")
public class UserController {
	@Autowired
    private  UserService userService;
	
    // Create a new user
    @PostMapping("/create")
    public User createUser(@RequestBody User user) { 
    	
        	return userService.createUser(user);           
        	
    }

    // Get user details by ID
    @GetMapping("getuser/{userId}")
    public User getUserById(@PathVariable int userId) {
        return userService.getUserById(userId);
    }

    // Get all users
    @GetMapping("/allusers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Delete user by ID
    @DeleteMapping("/delete/{userId}")
    public String deleteUser(@PathVariable int userId) {
        try {
            userService.deleteUser(userId);
            return "User deleted successfully.";
        } catch (Exception e) {
            // Handle exceptions, log them, and return an error message
            return "Error deleting user: " + e.getMessage();
        }
    }
    
    
}
