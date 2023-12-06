package com.route.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.route.book.entity.Review;


@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {


}