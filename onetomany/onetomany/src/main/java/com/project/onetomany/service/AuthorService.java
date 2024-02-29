package com.project.onetomany.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.project.onetomany.model.Author;
import com.project.onetomany.repository.AuthorRepo;
@Service
public class AuthorService {
    private AuthorRepo authorRepo;

    public AuthorService(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }
    public Author posAuthor(Author author)
    {
        return authorRepo.save(author);
    }
    public List<Author> geAuthors()
    {
        return authorRepo.findAll();
    }
    public Author getaid(int a_id)
    {
        return authorRepo.findById(a_id).orElse(null);
    }
    public Author putAuthor(int a_id,Author author)
    {
       return authorRepo.save(author);
    }
    public void delAuthor(int a_id)
    {
         authorRepo.deleteById(a_id);
    }
}
