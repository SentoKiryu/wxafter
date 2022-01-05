package com.example.demo.controller;


import com.example.demo.bean.answer;
import com.example.demo.repository.answerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class answerController {

    @Autowired
    answerDao answerDao;

    @GetMapping("ansadd")
    public answer add(
            @RequestParam("object") String object,
            @RequestParam("content") String content
    ){
        answer ans = new answer();
        ans.setObject(object);
        ans.setContent(content);

        answer save = answerDao.save(ans);
        return save;

    }

}
