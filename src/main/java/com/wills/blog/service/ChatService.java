package com.wills.blog.service;

import com.wills.blog.im.vo.ImMess;
import com.wills.blog.im.vo.ImUser;

import java.util.List;

public interface ChatService {
    ImUser getCurrentUser();

    void setGroupHistoryMsg(ImMess responseMess);

    List<Object> getGroupHistoryMsg(int count);
}
