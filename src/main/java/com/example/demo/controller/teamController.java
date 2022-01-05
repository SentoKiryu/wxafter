package com.example.demo.controller;


import com.example.demo.bean.team;
import com.example.demo.repository.teamDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class teamController {

    @Autowired
    teamDao teamDao;

    @GetMapping("/team")
    public team add(
            @RequestParam("tname") String tname,
            @RequestParam("tnum") String tnum,
            @RequestParam("tsel") String tsel,
            @RequestParam("tpass") int tpass
    ){
        team t = new team();
        t.setTeamname(tname);
        t.setTeamnum(tnum);
        t.setTeamsel(tsel);
        t.setTpass(tpass);
        team save =teamDao.save(t);
        return save;
    }

    @GetMapping("/teamall")
    public List getAll(){
        List all = teamDao.findAll();
        return all;
    }
}
