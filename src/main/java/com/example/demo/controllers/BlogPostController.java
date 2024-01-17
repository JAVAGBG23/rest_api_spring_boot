package com.example.demo.controllers;

import com.example.demo.models.BlogPost;
import com.example.demo.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class BlogPostController {
    @Autowired
    BlogPostService blogPostService;

    // POST
    @PostMapping("/blogpost")
    public BlogPost createBlogPost(@RequestBody BlogPost blogPost) {
        return blogPostService.createBlogPost(blogPost);
    }
}











