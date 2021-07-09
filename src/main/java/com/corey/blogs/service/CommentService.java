package com.corey.blogs.service;

import com.corey.blogs.po.Comment;

import java.util.List;

/**
 * Created by corey on 2021/4/30
 **/

public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
