package com.wills.blog.service;

import com.wills.blog.common.lang.Result;
import com.wills.blog.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wills.blog.shiro.AccountProfile;

public interface UserService extends IService<User> {

    Result register(User user);

    AccountProfile login(String username, String password);
}
