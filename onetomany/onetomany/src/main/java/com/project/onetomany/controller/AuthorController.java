package com.project.onetomany.controller;
import org.springframework.web.bind.annotation.RestController;
import com.project.onetomany.model.Author;
import com.project.onetomany.service.AuthorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
@RestController
public class AuthorController {
    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }
    @PostMapping("/authors")
    public Author postahr(@RequestBody Author author)
    {
        return authorService.posAuthor(author);
    }
    @GetMapping("/getallauthors")
    public List<Author> getlist()
    {
        return authorService.geAuthors();
    }
    @GetMapping("/getallauthors/{a_id}")
    public Author getauthorid(@PathVariable int a_id)
    {
        return authorService.getaid(a_id);
    }
    @PutMapping("/putauthors/{a_id}")
    public Author putahr(@PathVariable int a_id,@RequestBody Author author)
    {
        return authorService.putAuthor(a_id, author);
    }
    @DeleteMapping("/remove/{a_id}")
    public void deleteahr(@PathVariable int a_id)
    {
        authorService.delAuthor(a_id);
    }
}
