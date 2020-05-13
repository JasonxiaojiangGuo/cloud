package com.jason.provider.controller;

import com.jason.common.entity.People;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class TestController {
    @RequestMapping(value = "/test")
    public String firstCloud(int id){
        People people = new People();
        people.setId(id);
        people.setName("hello");
        return people.toString();
    }

    @RequestMapping(value = "/test2")
    public String secondCloud(@RequestBody People people){ //必须要有@RequestBody
        return people.toString();
    }
}
