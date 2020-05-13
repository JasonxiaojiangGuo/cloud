package com.jason.customer.feign;

import com.jason.common.entity.People;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("provider")
@Component
public interface TestFeignClient {
    @RequestMapping(value = "/test")
    String getPeopleString(@RequestParam("id")int id);//必须要有@RequestParam

    @RequestMapping(value = "/test2")
    String getPeople(@RequestBody People people);//必须要有@RequestBody
}

