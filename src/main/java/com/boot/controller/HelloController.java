package com.boot.controller;
import com.boot.DemoApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {


    @Autowired
    private DemoApplication.Person person;


    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return person.getName()+" hello";
    }

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public String info(){
        return person.getName()+"  "+person.getAge();
    }
}