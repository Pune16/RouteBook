package com.route.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.route.book.entity.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer> {
}
