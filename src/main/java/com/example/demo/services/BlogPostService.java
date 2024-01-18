package com.example.demo.services;

import com.example.demo.models.BlogPost;
import com.example.demo.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostService {
    @Autowired
    BlogPostRepository blogPostRepository;

    // skapa en blogg post
    public BlogPost createBlogPost(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }

    // hämta alla blogg poster
    public List<BlogPost> getAllBlogPosts() {
        return blogPostRepository.findAll();
    }

    // uppdatera en blogg post
    public BlogPost updateBlogPost(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }

    // hämta en specifik blogg post med hjälp av id
   public BlogPost getBlogPostById(String id) {
        return blogPostRepository.findById(id).get();
   }

   // deleta en blogg post
   public String deleteBlogPost(String id) {
        blogPostRepository.deleteById(id);
        return "Blog post deleted";
   }








































}
