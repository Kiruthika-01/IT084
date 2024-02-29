package com.project.onetomany.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.project.onetomany.model.Books;
import com.project.onetomany.repository.BooksRepo;

@Service
public class BookService {
    private BooksRepo booksRepo;

    public BookService(BooksRepo booksRepo) {
        this.booksRepo = booksRepo;
    }
    public Books postBooks(Books books)
    {
        return booksRepo.save(books);
    }
    public List<Books> getBooks()
    {
        return booksRepo.findAll();
    }
    public Books getbid(int a_id)
    {
        return booksRepo.findById(a_id).orElse(null);
    }
    public Books putBooks(int a_id,Books books)
    {
       return booksRepo.save(books);
    }
    public void delBooks(int a_id)
    {
        booksRepo.deleteById(a_id);
    }
}
