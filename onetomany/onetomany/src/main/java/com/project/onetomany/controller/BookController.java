package com.project.onetomany.controller;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.project.onetomany.model.Books;
import com.project.onetomany.service.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @PostMapping("/books")
    
    public Books postBks(@RequestBody Books books)
    {
        return bookService.postBooks(books);
 
    }
    @GetMapping("/getbooks")
    public List<Books> getbks()
    {
        return bookService.getBooks();
    }
    @GetMapping("/getbooks/{a_id}")
    public Books getbkid(@PathVariable int a_id)
    {
        return bookService.getbid(a_id);
    }
    @PutMapping("/putbooks/{a_id}")
    public Books putbks(@PathVariable int a_id,@RequestBody Books books)
    {
      return bookService.putBooks(a_id, books);

    }
    @DeleteMapping("/removebooks/{a_id}")
    public void deletebooks(@PathVariable int a_id)
    {
        bookService.delBooks(a_id);
    }
}
