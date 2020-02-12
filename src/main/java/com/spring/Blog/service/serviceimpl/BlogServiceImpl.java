package com.spring.Blog.service.serviceimpl;

import com.spring.Blog.model.Post;
import com.spring.Blog.repository.BlogRepository;
import com.spring.Blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogrep;
    @Override
    public List<Post> findAll() {
        return blogrep.findAll();
    }

    @Override
    public Post findById(Long id) {
        return blogrep.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return blogrep.save(post);
    }
}
