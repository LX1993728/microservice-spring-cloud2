package com.liuxun.cloud.service;

import com.liuxun.cloud.entity.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> getBlogs();
    void deleteBlog(long id);
}
