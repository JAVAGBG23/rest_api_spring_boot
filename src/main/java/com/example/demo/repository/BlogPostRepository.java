package com.example.demo.repository;

import com.example.demo.models.BlogPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogPostRepository extends MongoRepository<BlogPost, String> {

}
