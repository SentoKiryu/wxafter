package com.example.demo.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@Entity
public class teamallEntity{
    @Id
    private int tid;
    @Column
    private String teamname;
    @Column
    private String teamnum;
    @Column
    private String teamsel;

    public teamallEntity() {
    }

    public teamallEntity(int tid,String teamname,String teamnum,String teamsel) {
        this.tid = tid;
        this.teamname = teamname;
        this.teamnum = teamnum;
        this.teamsel = teamsel;
    }

}