package com.project.onetoone.controller;
import org.springframework.web.bind.annotation.RestController;
import com.project.onetoone.model.Books;
import com.project.onetoone.model.Review;
import com.project.onetoone.service.BooksService;
import com.project.onetoone.service.ReviewService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class ReviewController {
    private BooksService reviewService;
    private ReviewService reviewService2;
    
    public ReviewController(BooksService reviewService, ReviewService reviewService2) {
        this.reviewService = reviewService;
        this.reviewService2 = reviewService2;
    }
    @PostMapping("/books")
    public Books postbks(@RequestBody Books books)
    {
         return reviewService.postbooks(books);
    }
    @PostMapping("/reviews")
    public Review postrvw(@RequestBody Review review)
    {
        return reviewService2.postreview(review);
    }
    @GetMapping("/getbooks")
    public List<Books> getlist()
    {
        return reviewService.getAll();
    }
    @GetMapping("/getreviews")
    public List<Review> getrvw()
    {
        return reviewService2.getAllReview();
    }
    
    @GetMapping("/getbooks/{b_id}")
    public Books getbookid(@PathVariable int bid)
    {
        return reviewService.getbid(bid);
    }
    @GetMapping("/getreviews/{b_id}")
    public Review getrvwid(@PathVariable int bid)
    {
        return reviewService2.getreviewid(bid);
    }
    @GetMapping("/page/{offset}/{pagesize}")
    public Page<Books> pagebks(@PathVariable int offset,@PathVariable int pagesize)
    {
        return reviewService.bookpgn(offset, pagesize);
    }
    @GetMapping("/sorting/{byfield}")
    public List<Books> sortbks(@PathVariable("byfield") String field)
    {
        return reviewService.sortBooks(field);
    }    
    @PutMapping("update/{bid}")
    
    public Books putbks(@PathVariable int bid,@RequestBody Books books)
    {
         return reviewService.putBooks(bid, books);
    }
    @DeleteMapping("delete/{bid}")
    public void deletebks(@PathVariable int bid)
    {
         reviewService.delBooks(bid);
    }
    
    
}
