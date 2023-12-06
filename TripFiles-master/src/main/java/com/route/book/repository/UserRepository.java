package com.route.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.route.book.entity.User;

public interface UserRepository  extends JpaRepository<User, Integer>{

}
