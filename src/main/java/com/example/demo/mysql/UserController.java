package com.example.demo.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class UserController {

    @Autowired
    UserDao userDao;

    @GetMapping("/getall")
    public List getAll(){
        List all = userDao.findAll();
        return all;
    }

    @GetMapping("/add")
    public User add(

            @RequestParam("name") String name,
            @RequestParam("age") int age
    ){
        User user= new User();

        user.setName(name);
        user.setAge(age);

        User save = userDao.save(user);
        return save;
    }

//    @GetMapping("/deteleone")
//    public String deleteOne(
//            @RequestParam("id") int id
//    ){
//        userDao.deleteById(id);
//        return "hao";
//    }
//
//    @GetMapping("/deleteall")
//    public String deleteAll(){
//        userDao.deleteAll();
//        return "yehao";
//    }


}
