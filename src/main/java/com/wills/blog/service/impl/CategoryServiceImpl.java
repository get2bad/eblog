package com.wills.blog.service.impl;

import com.wills.blog.entity.Category;
import com.wills.blog.mapper.CategoryMapper;
import com.wills.blog.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
