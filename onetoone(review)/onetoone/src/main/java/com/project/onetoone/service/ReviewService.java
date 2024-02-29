package com.project.onetoone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.onetoone.model.Review;
import com.project.onetoone.repository.ReviewRepo;

@Service
public class ReviewService {
    private ReviewRepo reviewRepo;

    public ReviewService(ReviewRepo reviewRepo) {
        this.reviewRepo = reviewRepo;
    }
    public Review postreview(Review review)
    {
         return reviewRepo.save(review);
    }
    public List<Review> getAllReview()
    {
        return reviewRepo.findAll();
    }
    public Review getreviewid(int rid)
    {
        return reviewRepo.findById(rid).orElse(null);
    }
}
