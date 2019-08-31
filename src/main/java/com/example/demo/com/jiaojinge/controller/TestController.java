package com.example.demo.com.jiaojinge.controller;;
import com.example.demo.com.jiaojinge.utils.BoolUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    BoolUtils boolUtils;

    @RequestMapping("hello")
    public  Object hello(){
        String name=boolUtils.hello("焦金戈");
        System.out.print(name);
        return  "hello";
    }

}
