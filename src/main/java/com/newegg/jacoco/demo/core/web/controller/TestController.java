package com.newegg.jacoco.demo.core.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    @RequestMapping(value = "/test.json")
    @ResponseBody
    public Map test(){
        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
        System.out.println("line 4");
        System.out.println("line 5");
        System.out.println("line 6");
        System.out.println("line 7");
        return new HashMap();
    }
    
     @RequestMapping(value = "/test2.json")
    @ResponseBody
    public Map test2(){
        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
        System.out.println("line 4");
        System.out.println("line 5");
        System.out.println("line 6");
        System.out.println("line 7");
        return new HashMap();
    }
    
    @RequestMapping(value = "/test3.json")
    @ResponseBody
    public Map test3(){
        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
        System.out.println("line 4");
        System.out.println("line 5");
        System.out.println("line 6");
        System.out.println("line 7");
        return new HashMap();
    }
    
    @RequestMapping(value = "/test4.json")
    @ResponseBody
    public Map test4(){
        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
        System.out.println("line 4");
        System.out.println("line 5");
        System.out.println("line 6");
        System.out.println("line 7");
        return new HashMap();
    }
    
    @RequestMapping(value = "/test5.json")
    @ResponseBody
    public Map test5(){
        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
        System.out.println("line 4");
        System.out.println("line 5");
        System.out.println("line 6");
        System.out.println("line 7");
        return new HashMap();
    }
    
    @RequestMapping(value = "/test6.json")
    @ResponseBody
    public Map test6(){
        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
        System.out.println("line 4");
        System.out.println("line 5");
        System.out.println("line 6");
        System.out.println("line 7");
        return new HashMap();
    }
}
