package com.route.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.route.book.entity.Route;
import com.route.book.service.RouteService;

@RestController
@RequestMapping("/routes")
public class RouteController {

 @Autowired
 private RouteService routeService;

 @PostMapping("/create")
 public String createRoute(@RequestBody Route route) {
	 try {
    routeService.createRoute(route);
    return "route created Successfully!!";
	 }
	 catch(Exception e)
	 {
		    return "route  NOT created "+ e.getMessage();

	 }
 }

 @GetMapping("/getbyid/{routeId}")
 public Route getRouteById(@PathVariable int routeId) {
     return routeService.getRouteById(routeId);
 }

 @GetMapping("/all")
 public List<Route> getAllRoutes() {
     return routeService.getAllRoutes();
 }

 @DeleteMapping("/delete/{routeId}")
 public String deleteRoute(@PathVariable int routeId) {
	 try {
     routeService.deleteRoute(routeId);
     return "Route deleted Successfully!!";
	 } catch(Exception e)
	 {
         return "Error deleting route: " + e.getMessage();

	 }
 }
 
}
