package com.wills.blog.vo;

import com.wills.blog.entity.Comment;
import lombok.Data;

@Data
public class CommentVo extends Comment {

    private Long authorId;
    private String authorName;
    private String authorAvatar;

}
