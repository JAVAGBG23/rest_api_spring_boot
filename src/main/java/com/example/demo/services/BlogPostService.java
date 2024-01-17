package com.example.demo.services;

import com.example.demo.models.BlogPost;
import com.example.demo.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogPostService {
    @Autowired
    BlogPostRepository blogPostRepository;

    public BlogPost createBlogPost(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }
}
