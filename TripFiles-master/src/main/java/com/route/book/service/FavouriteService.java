package com.route.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.route.book.entity.Favourite;
import com.route.book.repository.FavouriteRepository;

@Service
public class FavouriteService {

 @Autowired
 private FavouriteRepository favouriteRepository;

 public Favourite createFavourite(Favourite favourite) {
     return favouriteRepository.save(favourite);
 }

 public Favourite getFavouriteById(int favId) {
     Optional<Favourite> optionalFavourite = favouriteRepository.findById(favId);
     return optionalFavourite.orElse(null);
 }

 public List<Favourite> getAllFavourites() {
     return favouriteRepository.findAll();
 }

 public void deleteFavourite(int favId) {
     favouriteRepository.deleteById(favId);
 }
}

