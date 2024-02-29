package com.project.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.onetomany.model.Author;

public interface AuthorRepo extends JpaRepository<Author,Integer> {

    
} 
