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

import com.route.book.entity.Review;
import com.route.book.service.ReviewService;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

 @Autowired
 private ReviewService reviewService;

 @PostMapping("/create")
 public Review createReview(@RequestBody Review review) {
     return reviewService.createReview(review);
 }

 @GetMapping("/getbyid/{reviewId}")
 public Review getReviewById(@PathVariable int reviewId) {
     return reviewService.getReviewById(reviewId);
 }

 @GetMapping("/all")
 public List<Review> getAllReviews() {
     return reviewService.getAllReviews();
 }

 @DeleteMapping("/delete/{reviewId}")
 public void deleteReview(@PathVariable int reviewId) {
     reviewService.deleteReview(reviewId);
 }
}
