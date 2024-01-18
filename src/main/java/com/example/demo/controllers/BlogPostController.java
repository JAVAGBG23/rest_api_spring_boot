package com.example.demo.controllers;

import com.example.demo.models.BlogPost;
import com.example.demo.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/blogpost")
public class BlogPostController {
    @Autowired
    BlogPostService blogPostService;

    // POST
    @PostMapping()
    public BlogPost createBlogPost(@RequestBody BlogPost blogPost) {
        return blogPostService.createBlogPost(blogPost);
    }

    // GET
    @GetMapping("/all")
    public List<BlogPost> getAllBlogPosts() {
        return blogPostService.getAllBlogPosts();
    }

    // PUT
    @PutMapping()
    public BlogPost updateBlogPost(@RequestBody BlogPost blogPost) {
        return blogPostService.updateBlogPost(blogPost);
    }

    // GET by id
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BlogPost getBlogPostById(@PathVariable String id) {
        return blogPostService.getBlogPostById(id);
    }

    // DELETE
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteBlogPost(@PathVariable String id) {
        return blogPostService.deleteBlogPost(id);
    }






















}











