package com.swei.caipiao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.swei.caipiao.entity.Content;

/**
 * @author rongrong
 * @version 1.0
 * @description:
 * @date 2019/12/26 20:34
 */
@RestController
/**
 * 在类上方使用，如在该处添加，接口访问时采取路径拼接方式访问
 * 如：localhost:8888/spring/hellow
 */
@RequestMapping("/spring")
public class HellowController {


    
    Content person;
    //在方法 上方使用
    @RequestMapping(value = "/hellow",method = RequestMethod.GET)
    public String say(){
        return "hi siwei";
    }

}