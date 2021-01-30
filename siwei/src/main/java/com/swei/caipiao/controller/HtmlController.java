package com.swei.caipiao.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.baidu.speech.restapi.common.DemoException;
import com.baidu.speech.restapi.ttsdemo.TtsMain;
import com.swei.caipiao.entity.Content;

/**
 * @author rongrong
 * @version 1.0
 * @description:
 * @date 2019/12/28 21:32
 */
@Controller
public class HtmlController {

    @RequestMapping(value = "/say",method = RequestMethod.GET)
    public String index(){
    	
        return "index";
    }
    
    @PostMapping(path = "/sayContent")
    public String  demo1(@RequestBody Content content) {
    	content.toString();
    	TtsMain tm=new TtsMain();
    	String  contentValue="";
    	try {
		  contentValue=tm.run(content.getContent());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DemoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(content);
        return "index";
    }
}