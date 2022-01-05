package com.example.demo.controller;


import com.example.demo.repository.teamallDao;
import com.example.demo.until.Message;
import com.example.demo.until.MessageBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class teamallController {
    @Autowired
    teamallDao teamallDao;

    @GetMapping("/findall")
    public Message findAll() {
        return new MessageBox<>(teamallDao.findAll());
    }

    @GetMapping("/findall2")
    @ResponseBody
    public Message findIdAndAddress2() {
        return new MessageBox<>(teamallDao.findIdAndAddress2());

    }
}
