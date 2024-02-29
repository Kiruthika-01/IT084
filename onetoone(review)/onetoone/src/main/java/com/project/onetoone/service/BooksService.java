package com.project.onetoone.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.project.onetoone.model.Books;
import com.project.onetoone.repository.BookRepo;

@Service
public class BooksService {
    private BookRepo bookRepo;

    public BooksService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }
    public Books postbooks(Books books)
    {
        return bookRepo.save(books);
    }
    public List<Books> getAll()
    {
        return bookRepo.findAll();
    }
    public Books getbid(int bid)
    {
        return bookRepo.findById(bid).orElse(null);
    }
    public Page<Books> bookpgn(int offset,int pagesize)
    {
        return bookRepo.findAll(PageRequest.of(offset,pagesize));
    }
    public List<Books> sortBooks(String field)
    {
        return bookRepo.findAll( Sort.by(Sort.Direction.ASC,field)   );
    }
    public Books putBooks(int bid,Books books)
    {
        return bookRepo.save(books);
    }
    public void delBooks(int bid)
    {
        bookRepo.deleteById(bid);
    }
}
