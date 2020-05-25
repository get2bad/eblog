package com.wills.blog.im.message;

import com.wills.blog.im.vo.ImTo;
import com.wills.blog.im.vo.ImUser;
import lombok.Data;

@Data
public class ChatImMess {

    private ImUser mine;
    private ImTo to;

}
