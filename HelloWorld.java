package com.qingguatang.java5minute.course1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Pinquan
 * @date 2018/8/28
 */
@Controller
public class HelloWorld {

    @RequestMapping (value = "/")
    @ResponseBody
    public String hello( ) {
        String message = "Hello";
        return message;
    }

}

