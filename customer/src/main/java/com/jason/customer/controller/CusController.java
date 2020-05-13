package com.jason.customer.controller;

import com.jason.common.entity.People;
import com.jason.customer.feign.TestFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CusController {

    @Autowired
    private TestFeignClient testFeignClient;

    @RequestMapping(value = "/getPeopleString")
    public String getPeople(int id){
        String people = testFeignClient.getPeopleString(id);
        return people;
    }
    @RequestMapping(value = "/getPeople")
    public  String getPeople(@RequestBody People people){//必须要有@RequestBody
        String people1 = testFeignClient.getPeople(people);
        return people1;
    }
}
