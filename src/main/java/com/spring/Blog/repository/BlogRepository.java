package com.spring.Blog.repository;

import com.spring.Blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Post, Long> {

}
