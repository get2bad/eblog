package com.wills.blog.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wills.blog.entity.Post;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wills.blog.vo.PostVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface PostMapper extends BaseMapper<Post> {

    IPage<PostVo> selectPosts(Page page, @Param(Constants.WRAPPER) QueryWrapper wrapper);

    PostVo selectOnePost(@Param(Constants.WRAPPER)QueryWrapper<Post> wrapper);
}