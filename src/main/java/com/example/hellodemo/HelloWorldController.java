package com.example.hellodemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright(C),2020-2022,桃子信息网络有限公司
 * FileName:HelloWorldController
 * Author:  taokekun
 * Date:    2022-03-02下午 3:41
 * Description
 * History:
 * <author>   <time>   <version>   <desc>
 * 作者姓名   修改时间   版本号     描述
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(){
        String aa = "我是新手彧123";
        return "Hello,spring boot";
    }
}
