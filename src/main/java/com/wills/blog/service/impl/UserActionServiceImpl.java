package com.wills.blog.service.impl;

import com.wills.blog.entity.UserAction;
import com.wills.blog.mapper.UserActionMapper;
import com.wills.blog.service.UserActionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserActionServiceImpl extends ServiceImpl<UserActionMapper, UserAction> implements UserActionService {

}
