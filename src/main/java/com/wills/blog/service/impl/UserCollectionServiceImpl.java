package com.wills.blog.service.impl;

import com.wills.blog.entity.UserCollection;
import com.wills.blog.mapper.UserCollectionMapper;
import com.wills.blog.service.UserCollectionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserCollectionServiceImpl extends ServiceImpl<UserCollectionMapper, UserCollection> implements UserCollectionService {

}
