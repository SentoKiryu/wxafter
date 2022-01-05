package com.example.demo.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tid;
    private String teamname;
    private String teamnum;
    private String teamsel;
    private int tpass;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getTeamnum() {
        return teamnum;
    }

    public void setTeamnum(String teamnum) {
        this.teamnum = teamnum;
    }

    public String getTeamsel() {
        return teamsel;
    }

    public void setTeamsel(String teamsel) {
        this.teamsel = teamsel;
    }

    public int getTpass() {
        return tpass;
    }

    public void setTpass(int tpass) {
        this.tpass = tpass;
    }
}
