package com.project.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.onetoone.model.Books;

public interface BookRepo extends JpaRepository<Books,Integer> {

    
} 