package com.project.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.onetoone.model.Review;

public interface ReviewRepo extends JpaRepository<Review,Integer>{

    
} 
