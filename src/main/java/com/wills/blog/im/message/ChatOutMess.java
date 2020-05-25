package com.wills.blog.im.message;

import com.wills.blog.im.vo.ImMess;
import lombok.Data;

@Data
public class ChatOutMess {

    private String emit;
    private ImMess data;

}
