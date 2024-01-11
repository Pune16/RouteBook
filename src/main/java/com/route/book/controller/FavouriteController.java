package com.route.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.route.book.entity.Favourite;
import com.route.book.service.FavouriteService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/favourites")
public class FavouriteController {

 @Autowired
 private FavouriteService favouriteService;

 @PostMapping("/create")
 public Favourite createFavourite(@RequestBody Favourite favourite) {
     return favouriteService.createFavourite(favourite);
 }

 @GetMapping("/getbyid/{favId}")
 public Favourite getFavouriteById(@PathVariable int favId) {
     return favouriteService.getFavouriteById(favId);
 }

 @GetMapping("/all")
 public List<Favourite> getAllFavourites() {
     return favouriteService.getAllFavourites();
 }

 @DeleteMapping("/delete/{favId}")
 public void deleteFavourite(@PathVariable int favId) {
     favouriteService.deleteFavourite(favId);
 }
}
