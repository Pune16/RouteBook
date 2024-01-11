package com.route.book.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String username;
    private String email;
    private String password;
    private String role;
    private String token;
    private boolean isAdmin;
    private String contact;

public User() {}

//In User entity
@OneToMany (mappedBy = "user" ) 
@JsonIgnore
private List<Review> reviews;

//In User entity
@OneToMany (mappedBy = "user") 
@JsonIgnore
private List<Favourite> favourites;

//In User entity
@OneToMany (mappedBy = "user" ) 
@JsonIgnore

private List<Route> routes;




public User(int userId, String username, String email, String password, String role, String token, boolean isAdmin,
		String contact, List<Review> reviews, List<Favourite> favourites, List<Route> routes) {
	super();
	this.userId = userId;
	this.username = username;
	this.email = email;
	this.password = password;
	this.role = role;
	this.token = token;
	this.isAdmin = isAdmin;
	this.contact = contact;
	this.reviews = reviews;
	this.favourites = favourites;
	this.routes = routes;
}



public int getUserId() {
	return userId;
}



public void setUserId(int userId) {
	this.userId = userId;
}



public String getUsername() {
	return username;
}



public void setUsername(String username) {
	this.username = username;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



public String getRole() {
	return role;
}



public void setRole(String role) {
	this.role = role;
}



public String getToken() {
	return token;
}



public void setToken(String token) {
	this.token = token;
}



public boolean isAdmin() {
	return isAdmin;
}



public void setAdmin(boolean isAdmin) {
	this.isAdmin = isAdmin;
}



public String getContact() {
	return contact;
}



public void setContact(String contact) {
	this.contact = contact;
}



public List<Review> getReviews() {
	return reviews;
}



public void setReviews(List<Review> reviews) {
	this.reviews = reviews;
}



public List<Favourite> getFavourites() {
	return favourites;
}



public void setFavourites(List<Favourite> favourites) {
	this.favourites = favourites;
}



public List<Route> getRoutes() {
	return routes;
}



public void setRoutes(List<Route> routes) {
	this.routes = routes;
}



@Override
public String toString() {
	return "User [userId=" + userId + ", username=" + username + ", email=" + email + ", password=" + password
			+ ", role=" + role + ", token=" + token + ", isAdmin=" + isAdmin + ", contact=" + contact + ", reviews="
			+ reviews + ", favourites=" + favourites + ", routes=" + routes + "]";
}



 
    
}
