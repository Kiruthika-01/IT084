package com.project.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.onetomany.model.Books;

public interface BooksRepo extends JpaRepository<Books,Integer>{

    
} 