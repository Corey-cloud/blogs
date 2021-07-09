package com.corey.blogs.service;

import com.corey.blogs.po.Blog;
import com.corey.blogs.po.Blog;
import com.corey.blogs.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * Created by corey on 2021/4/28
 **/

public interface BlogService {

    Blog saveBlog(Blog blog);

    Blog getBlog(Long id);

    Blog getAndConvert(Long id);

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    Page<Blog> listBlog(Pageable pageable);

    Page<Blog> listBlog(Long tagId, Pageable pageable);

    Page<Blog> listBlog(String query, Pageable pageable);

    List<Blog> listRecommendBlogTop(Integer size);

    Map<String,List<Blog>> archiveBlog();

    Long countBlog();

    Blog updateBlog(Long id, Blog blog);

    void deleteBlog(Long id);

}
