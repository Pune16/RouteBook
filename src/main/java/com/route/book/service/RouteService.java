package com.route.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.route.book.entity.Route;
import com.route.book.repository.RouteRepository;

//RouteService.java (Service)
@Service
public class RouteService {

 @Autowired
 private RouteRepository routeRepository;

 public Route createRoute(Route route) {
     return routeRepository.save(route);
 }

 public Route getRouteById(int routeId) {
     Optional<Route> optionalRoute = routeRepository.findById(routeId);
     return optionalRoute.orElse(null);
 }

 public List<Route> getAllRoutes() {
     return routeRepository.findAll();
 }

 public void deleteRoute(int routeId) {
     routeRepository.deleteById(routeId);
 }
}
