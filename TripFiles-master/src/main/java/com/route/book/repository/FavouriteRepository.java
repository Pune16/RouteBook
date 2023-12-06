package com.route.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.route.book.entity.Favourite;

@Repository
public interface FavouriteRepository extends JpaRepository<Favourite, Integer> {
	
}
