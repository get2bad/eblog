package com.wills.blog.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wills.blog.entity.Comment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wills.blog.vo.CommentVo;

public interface CommentService extends IService<Comment> {

    IPage<CommentVo> paing(Page page, Long postId, Long userId, String order);
}
